package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.KepuzhishiCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 科普收藏
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("kepuzhishi_collection")
public class KepuzhishiCollectionView extends KepuzhishiCollectionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 类型的值
	*/
	@ColumnInfo(comment="类型的字典表值",type="varchar(200)")
	private String kepuzhishiCollectionValue;

	//级联表 健康科普
		/**
		* 标题
		*/

		@ColumnInfo(comment="标题",type="varchar(200)")
		private String kepuzhishiName;
		/**
		* 封面
		*/

		@ColumnInfo(comment="封面",type="varchar(200)")
		private String kepuzhishiPhoto;
		/**
		* 科普类型
		*/
		@ColumnInfo(comment="科普类型",type="int(11)")
		private Integer kepuzhishiTypes;
			/**
			* 科普类型的值
			*/
			@ColumnInfo(comment="科普类型的字典表值",type="varchar(200)")
			private String kepuzhishiValue;
		/**
		* 科普视频
		*/

		@ColumnInfo(comment="科普视频",type="varchar(200)")
		private String kepuzhishiVideo;
		/**
		* 赞
		*/

		@ColumnInfo(comment="赞",type="int(11)")
		private Integer zanNumber;
		/**
		* 踩
		*/

		@ColumnInfo(comment="踩",type="int(11)")
		private Integer caiNumber;
		/**
		* 科普介绍
		*/

		@ColumnInfo(comment="科普介绍",type="longtext")
		private String kepuzhishiContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer kepuzhishiDelete;
	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;



	public KepuzhishiCollectionView() {

	}

	public KepuzhishiCollectionView(KepuzhishiCollectionEntity kepuzhishiCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, kepuzhishiCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 类型的值
	*/
	public String getKepuzhishiCollectionValue() {
		return kepuzhishiCollectionValue;
	}
	/**
	* 设置： 类型的值
	*/
	public void setKepuzhishiCollectionValue(String kepuzhishiCollectionValue) {
		this.kepuzhishiCollectionValue = kepuzhishiCollectionValue;
	}


	//级联表的get和set 健康科普

		/**
		* 获取： 标题
		*/
		public String getKepuzhishiName() {
			return kepuzhishiName;
		}
		/**
		* 设置： 标题
		*/
		public void setKepuzhishiName(String kepuzhishiName) {
			this.kepuzhishiName = kepuzhishiName;
		}

		/**
		* 获取： 封面
		*/
		public String getKepuzhishiPhoto() {
			return kepuzhishiPhoto;
		}
		/**
		* 设置： 封面
		*/
		public void setKepuzhishiPhoto(String kepuzhishiPhoto) {
			this.kepuzhishiPhoto = kepuzhishiPhoto;
		}
		/**
		* 获取： 科普类型
		*/
		public Integer getKepuzhishiTypes() {
			return kepuzhishiTypes;
		}
		/**
		* 设置： 科普类型
		*/
		public void setKepuzhishiTypes(Integer kepuzhishiTypes) {
			this.kepuzhishiTypes = kepuzhishiTypes;
		}


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

		/**
		* 获取： 科普视频
		*/
		public String getKepuzhishiVideo() {
			return kepuzhishiVideo;
		}
		/**
		* 设置： 科普视频
		*/
		public void setKepuzhishiVideo(String kepuzhishiVideo) {
			this.kepuzhishiVideo = kepuzhishiVideo;
		}

		/**
		* 获取： 赞
		*/
		public Integer getZanNumber() {
			return zanNumber;
		}
		/**
		* 设置： 赞
		*/
		public void setZanNumber(Integer zanNumber) {
			this.zanNumber = zanNumber;
		}

		/**
		* 获取： 踩
		*/
		public Integer getCaiNumber() {
			return caiNumber;
		}
		/**
		* 设置： 踩
		*/
		public void setCaiNumber(Integer caiNumber) {
			this.caiNumber = caiNumber;
		}

		/**
		* 获取： 科普介绍
		*/
		public String getKepuzhishiContent() {
			return kepuzhishiContent;
		}
		/**
		* 设置： 科普介绍
		*/
		public void setKepuzhishiContent(String kepuzhishiContent) {
			this.kepuzhishiContent = kepuzhishiContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getKepuzhishiDelete() {
			return kepuzhishiDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setKepuzhishiDelete(Integer kepuzhishiDelete) {
			this.kepuzhishiDelete = kepuzhishiDelete;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}


	@Override
	public String toString() {
		return "KepuzhishiCollectionView{" +
			", kepuzhishiCollectionValue=" + kepuzhishiCollectionValue +
			", kepuzhishiName=" + kepuzhishiName +
			", kepuzhishiPhoto=" + kepuzhishiPhoto +
			", kepuzhishiVideo=" + kepuzhishiVideo +
			", zanNumber=" + zanNumber +
			", caiNumber=" + caiNumber +
			", kepuzhishiContent=" + kepuzhishiContent +
			", kepuzhishiDelete=" + kepuzhishiDelete +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
