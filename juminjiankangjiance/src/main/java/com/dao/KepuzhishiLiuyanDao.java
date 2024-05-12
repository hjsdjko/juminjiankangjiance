package com.dao;

import com.entity.KepuzhishiLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KepuzhishiLiuyanView;

/**
 * 科普留言 Dao 接口
 *
 * @author 
 */
public interface KepuzhishiLiuyanDao extends BaseMapper<KepuzhishiLiuyanEntity> {

   List<KepuzhishiLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
