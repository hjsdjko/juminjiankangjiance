package com.dao;

import com.entity.KepuzhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KepuzhishiView;

/**
 * 健康科普 Dao 接口
 *
 * @author 
 */
public interface KepuzhishiDao extends BaseMapper<KepuzhishiEntity> {

   List<KepuzhishiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
