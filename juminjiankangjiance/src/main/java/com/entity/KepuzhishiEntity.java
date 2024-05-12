package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 健康科普
 *
 * @author 
 * @email
 */
@TableName("kepuzhishi")
public class KepuzhishiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KepuzhishiEntity() {

	}

	public KepuzhishiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 标题
     */
    @ColumnInfo(comment="标题",type="varchar(200)")
    @TableField(value = "kepuzhishi_name")

    private String kepuzhishiName;


    /**
     * 封面
     */
    @ColumnInfo(comment="封面",type="varchar(200)")
    @TableField(value = "kepuzhishi_photo")

    private String kepuzhishiPhoto;


    /**
     * 科普类型
     */
    @ColumnInfo(comment="科普类型",type="int(11)")
    @TableField(value = "kepuzhishi_types")

    private Integer kepuzhishiTypes;


    /**
     * 科普视频
     */
    @ColumnInfo(comment="科普视频",type="varchar(200)")
    @TableField(value = "kepuzhishi_video")

    private String kepuzhishiVideo;


    /**
     * 赞
     */
    @ColumnInfo(comment="赞",type="int(11)")
    @TableField(value = "zan_number")

    private Integer zanNumber;


    /**
     * 踩
     */
    @ColumnInfo(comment="踩",type="int(11)")
    @TableField(value = "cai_number")

    private Integer caiNumber;


    /**
     * 科普介绍
     */
    @ColumnInfo(comment="科普介绍",type="longtext")
    @TableField(value = "kepuzhishi_content")

    private String kepuzhishiContent;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "kepuzhishi_delete")

    private Integer kepuzhishiDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：标题
	 */
    public String getKepuzhishiName() {
        return kepuzhishiName;
    }
    /**
	 * 设置：标题
	 */

    public void setKepuzhishiName(String kepuzhishiName) {
        this.kepuzhishiName = kepuzhishiName;
    }
    /**
	 * 获取：封面
	 */
    public String getKepuzhishiPhoto() {
        return kepuzhishiPhoto;
    }
    /**
	 * 设置：封面
	 */

    public void setKepuzhishiPhoto(String kepuzhishiPhoto) {
        this.kepuzhishiPhoto = kepuzhishiPhoto;
    }
    /**
	 * 获取：科普类型
	 */
    public Integer getKepuzhishiTypes() {
        return kepuzhishiTypes;
    }
    /**
	 * 设置：科普类型
	 */

    public void setKepuzhishiTypes(Integer kepuzhishiTypes) {
        this.kepuzhishiTypes = kepuzhishiTypes;
    }
    /**
	 * 获取：科普视频
	 */
    public String getKepuzhishiVideo() {
        return kepuzhishiVideo;
    }
    /**
	 * 设置：科普视频
	 */

    public void setKepuzhishiVideo(String kepuzhishiVideo) {
        this.kepuzhishiVideo = kepuzhishiVideo;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }
    /**
	 * 设置：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }
    /**
	 * 设置：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：科普介绍
	 */
    public String getKepuzhishiContent() {
        return kepuzhishiContent;
    }
    /**
	 * 设置：科普介绍
	 */

    public void setKepuzhishiContent(String kepuzhishiContent) {
        this.kepuzhishiContent = kepuzhishiContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getKepuzhishiDelete() {
        return kepuzhishiDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setKepuzhishiDelete(Integer kepuzhishiDelete) {
        this.kepuzhishiDelete = kepuzhishiDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Kepuzhishi{" +
            ", id=" + id +
            ", kepuzhishiName=" + kepuzhishiName +
            ", kepuzhishiPhoto=" + kepuzhishiPhoto +
            ", kepuzhishiTypes=" + kepuzhishiTypes +
            ", kepuzhishiVideo=" + kepuzhishiVideo +
            ", zanNumber=" + zanNumber +
            ", caiNumber=" + caiNumber +
            ", kepuzhishiContent=" + kepuzhishiContent +
            ", kepuzhishiDelete=" + kepuzhishiDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
