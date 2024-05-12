package com.entity.model;

import com.entity.KepuzhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 健康科普
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KepuzhishiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String kepuzhishiName;


    /**
     * 封面
     */
    private String kepuzhishiPhoto;


    /**
     * 科普类型
     */
    private Integer kepuzhishiTypes;


    /**
     * 科普视频
     */
    private String kepuzhishiVideo;


    /**
     * 赞
     */
    private Integer zanNumber;


    /**
     * 踩
     */
    private Integer caiNumber;


    /**
     * 科普介绍
     */
    private String kepuzhishiContent;


    /**
     * 逻辑删除
     */
    private Integer kepuzhishiDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
