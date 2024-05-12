
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 健康上报
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/gerentizheng")
public class GerentizhengController {
    private static final Logger logger = LoggerFactory.getLogger(GerentizhengController.class);

    private static final String TABLE_NAME = "gerentizheng";

    @Autowired
    private GerentizhengService gerentizhengService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private ForumService forumService;//论坛
    @Autowired
    private KepuzhishiService kepuzhishiService;//健康科普
    @Autowired
    private KepuzhishiCollectionService kepuzhishiCollectionService;//科普收藏
    @Autowired
    private KepuzhishiLiuyanService kepuzhishiLiuyanService;//科普留言
    @Autowired
    private NewsService newsService;//公告信息
    @Autowired
    private YonghuService yonghuService;//用户
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        params.put("gerentizhengDeleteStart",1);params.put("gerentizhengDeleteEnd",1);
        CommonUtil.checkMap(params);
        PageUtils page = gerentizhengService.queryPage(params);

        //字典表数据转换
        List<GerentizhengView> list =(List<GerentizhengView>)page.getList();
        for(GerentizhengView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        GerentizhengEntity gerentizheng = gerentizhengService.selectById(id);
        if(gerentizheng !=null){
            //entity转view
            GerentizhengView view = new GerentizhengView();
            BeanUtils.copyProperties( gerentizheng , view );//把实体数据重构到view中
            //级联表 用户
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(gerentizheng.getYonghuId());
            if(yonghu != null){
            BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setYonghuId(yonghu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody GerentizhengEntity gerentizheng, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,gerentizheng:{}",this.getClass().getName(),gerentizheng.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            gerentizheng.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<GerentizhengEntity> queryWrapper = new EntityWrapper<GerentizhengEntity>()
            .eq("gerentizheng_name", gerentizheng.getGerentizhengName())
            .eq("gerentizheng_xieya", gerentizheng.getGerentizhengXieya())
            .eq("gerentizheng_xietang", gerentizheng.getGerentizhengXietang())
            .eq("gerentizheng_types", gerentizheng.getGerentizhengTypes())
            .eq("gerentizheng_shengao", gerentizheng.getGerentizhengShengao())
            .eq("gerentizheng_tizhong", gerentizheng.getGerentizhengTizhong())
            .eq("gerentizheng_tiwen", gerentizheng.getGerentizhengTiwen())
            .eq("gerentizheng_bushu", gerentizheng.getGerentizhengBushu())
            .eq("gerentizheng_shilil", gerentizheng.getGerentizhengShilil())
            .eq("gerentizheng_shilir", gerentizheng.getGerentizhengShilir())
            .eq("gerentizheng_time", new SimpleDateFormat("yyyy-MM-dd").format(gerentizheng.getGerentizhengTime()))
            .eq("yonghu_id", gerentizheng.getYonghuId())
            .eq("gerentizheng_delete", gerentizheng.getGerentizhengDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        GerentizhengEntity gerentizhengEntity = gerentizhengService.selectOne(queryWrapper);
        if(gerentizhengEntity==null){
            gerentizheng.setInsertTime(new Date());
            gerentizheng.setGerentizhengDelete(1);
            gerentizheng.setCreateTime(new Date());
            gerentizhengService.insert(gerentizheng);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody GerentizhengEntity gerentizheng, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,gerentizheng:{}",this.getClass().getName(),gerentizheng.toString());
        GerentizhengEntity oldGerentizhengEntity = gerentizhengService.selectById(gerentizheng.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            gerentizheng.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        if("".equals(gerentizheng.getGerentizhengFile()) || "null".equals(gerentizheng.getGerentizhengFile())){
                gerentizheng.setGerentizhengFile(null);
        }

            gerentizhengService.updateById(gerentizheng);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<GerentizhengEntity> oldGerentizhengList =gerentizhengService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        ArrayList<GerentizhengEntity> list = new ArrayList<>();
        for(Integer id:ids){
            GerentizhengEntity gerentizhengEntity = new GerentizhengEntity();
            gerentizhengEntity.setId(id);
            gerentizhengEntity.setGerentizhengDelete(2);
            list.add(gerentizhengEntity);
        }
        if(list != null && list.size() >0){
            gerentizhengService.updateBatchById(list);
        }

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<GerentizhengEntity> gerentizhengList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            GerentizhengEntity gerentizhengEntity = new GerentizhengEntity();
//                            gerentizhengEntity.setGerentizhengName(data.get(0));                    //标题 要改的
//                            gerentizhengEntity.setGerentizhengXieya(Integer.valueOf(data.get(0)));   //血压 要改的
//                            gerentizhengEntity.setGerentizhengXietang(Integer.valueOf(data.get(0)));   //血糖 要改的
//                            gerentizhengEntity.setGerentizhengTypes(Integer.valueOf(data.get(0)));   //身体质量 要改的
//                            gerentizhengEntity.setGerentizhengShengao(Integer.valueOf(data.get(0)));   //身高 要改的
//                            gerentizhengEntity.setGerentizhengTizhong(Integer.valueOf(data.get(0)));   //体重KG 要改的
//                            gerentizhengEntity.setGerentizhengTiwen(Integer.valueOf(data.get(0)));   //体温 要改的
//                            gerentizhengEntity.setGerentizhengBushu(Integer.valueOf(data.get(0)));   //步数 要改的
//                            gerentizhengEntity.setGerentizhengShilil(Integer.valueOf(data.get(0)));   //视力L 要改的
//                            gerentizhengEntity.setGerentizhengShilir(Integer.valueOf(data.get(0)));   //视力R 要改的
//                            gerentizhengEntity.setGerentizhengFile(data.get(0));                    //体检报告 要改的
//                            gerentizhengEntity.setGerentizhengTime(sdf.parse(data.get(0)));          //记录时间 要改的
//                            gerentizhengEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            gerentizhengEntity.setGerentizhengText(data.get(0));                    //备注 要改的
//                            gerentizhengEntity.setInsertTime(date);//时间
//                            gerentizhengEntity.setGerentizhengDelete(1);//逻辑删除字段
//                            gerentizhengEntity.setCreateTime(date);//时间
                            gerentizhengList.add(gerentizhengEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        gerentizhengService.insertBatch(gerentizhengList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = gerentizhengService.queryPage(params);

        //字典表数据转换
        List<GerentizhengView> list =(List<GerentizhengView>)page.getList();
        for(GerentizhengView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        GerentizhengEntity gerentizheng = gerentizhengService.selectById(id);
            if(gerentizheng !=null){


                //entity转view
                GerentizhengView view = new GerentizhengView();
                BeanUtils.copyProperties( gerentizheng , view );//把实体数据重构到view中

                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(gerentizheng.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody GerentizhengEntity gerentizheng, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,gerentizheng:{}",this.getClass().getName(),gerentizheng.toString());
        Wrapper<GerentizhengEntity> queryWrapper = new EntityWrapper<GerentizhengEntity>()
            .eq("gerentizheng_name", gerentizheng.getGerentizhengName())
            .eq("gerentizheng_xieya", gerentizheng.getGerentizhengXieya())
            .eq("gerentizheng_xietang", gerentizheng.getGerentizhengXietang())
            .eq("gerentizheng_types", gerentizheng.getGerentizhengTypes())
            .eq("gerentizheng_shengao", gerentizheng.getGerentizhengShengao())
            .eq("gerentizheng_tizhong", gerentizheng.getGerentizhengTizhong())
            .eq("gerentizheng_tiwen", gerentizheng.getGerentizhengTiwen())
            .eq("gerentizheng_bushu", gerentizheng.getGerentizhengBushu())
            .eq("gerentizheng_shilil", gerentizheng.getGerentizhengShilil())
            .eq("gerentizheng_shilir", gerentizheng.getGerentizhengShilir())
            .eq("yonghu_id", gerentizheng.getYonghuId())
            .eq("gerentizheng_text", gerentizheng.getGerentizhengText())
            .eq("gerentizheng_delete", gerentizheng.getGerentizhengDelete())
//            .notIn("gerentizheng_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        GerentizhengEntity gerentizhengEntity = gerentizhengService.selectOne(queryWrapper);
        if(gerentizhengEntity==null){
            gerentizheng.setInsertTime(new Date());
            gerentizheng.setGerentizhengDelete(1);
            gerentizheng.setCreateTime(new Date());
        gerentizhengService.insert(gerentizheng);

            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

}

