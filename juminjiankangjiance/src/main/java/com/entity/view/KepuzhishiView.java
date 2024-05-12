package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.KepuzhishiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 健康科普
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("kepuzhishi")
public class KepuzhishiView extends KepuzhishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 科普类型的值
	*/
	@ColumnInfo(comment="科普类型的字典表值",type="varchar(200)")
	private String kepuzhishiValue;




	public KepuzhishiView() {

	}

	public KepuzhishiView(KepuzhishiEntity kepuzhishiEntity) {
		try {
			BeanUtils.copyProperties(this, kepuzhishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 科普类型的值
	*/
	public String getKepuzhishiValue() {
		return kepuzhishiValue;
	}
	/**
	* 设置： 科普类型的值
	*/
	public void setKepuzhishiValue(String kepuzhishiValue) {
		this.kepuzhishiValue = kepuzhishiValue;
	}




	@Override
	public String toString() {
		return "KepuzhishiView{" +
			", kepuzhishiValue=" + kepuzhishiValue +
			"} " + super.toString();
	}
}
