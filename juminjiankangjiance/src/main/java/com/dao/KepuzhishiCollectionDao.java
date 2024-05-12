package com.dao;

import com.entity.KepuzhishiCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KepuzhishiCollectionView;

/**
 * 科普收藏 Dao 接口
 *
 * @author 
 */
public interface KepuzhishiCollectionDao extends BaseMapper<KepuzhishiCollectionEntity> {

   List<KepuzhishiCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
