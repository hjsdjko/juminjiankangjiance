package com.entity.vo;

import com.entity.KepuzhishiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 健康科普
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kepuzhishi")
public class KepuzhishiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "kepuzhishi_name")
    private String kepuzhishiName;


    /**
     * 封面
     */

    @TableField(value = "kepuzhishi_photo")
    private String kepuzhishiPhoto;


    /**
     * 科普类型
     */

    @TableField(value = "kepuzhishi_types")
    private Integer kepuzhishiTypes;


    /**
     * 科普视频
     */

    @TableField(value = "kepuzhishi_video")
    private String kepuzhishiVideo;


    /**
     * 赞
     */

    @TableField(value = "zan_number")
    private Integer zanNumber;


    /**
     * 踩
     */

    @TableField(value = "cai_number")
    private Integer caiNumber;


    /**
     * 科普介绍
     */

    @TableField(value = "kepuzhishi_content")
    private String kepuzhishiContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "kepuzhishi_delete")
    private Integer kepuzhishiDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：标题
	 */
    public String getKepuzhishiName() {
        return kepuzhishiName;
    }


    /**
	 * 获取：标题
	 */

    public void setKepuzhishiName(String kepuzhishiName) {
        this.kepuzhishiName = kepuzhishiName;
    }
    /**
	 * 设置：封面
	 */
    public String getKepuzhishiPhoto() {
        return kepuzhishiPhoto;
    }


    /**
	 * 获取：封面
	 */

    public void setKepuzhishiPhoto(String kepuzhishiPhoto) {
        this.kepuzhishiPhoto = kepuzhishiPhoto;
    }
    /**
	 * 设置：科普类型
	 */
    public Integer getKepuzhishiTypes() {
        return kepuzhishiTypes;
    }


    /**
	 * 获取：科普类型
	 */

    public void setKepuzhishiTypes(Integer kepuzhishiTypes) {
        this.kepuzhishiTypes = kepuzhishiTypes;
    }
    /**
	 * 设置：科普视频
	 */
    public String getKepuzhishiVideo() {
        return kepuzhishiVideo;
    }


    /**
	 * 获取：科普视频
	 */

    public void setKepuzhishiVideo(String kepuzhishiVideo) {
        this.kepuzhishiVideo = kepuzhishiVideo;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：科普介绍
	 */
    public String getKepuzhishiContent() {
        return kepuzhishiContent;
    }


    /**
	 * 获取：科普介绍
	 */

    public void setKepuzhishiContent(String kepuzhishiContent) {
        this.kepuzhishiContent = kepuzhishiContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getKepuzhishiDelete() {
        return kepuzhishiDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setKepuzhishiDelete(Integer kepuzhishiDelete) {
        this.kepuzhishiDelete = kepuzhishiDelete;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
