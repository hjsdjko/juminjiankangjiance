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
 * 健康上报
 *
 * @author 
 * @email
 */
@TableName("gerentizheng")
public class GerentizhengEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GerentizhengEntity() {

	}

	public GerentizhengEntity(T t) {
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
    @TableField(value = "gerentizheng_name")

    private String gerentizhengName;


    /**
     * 血压
     */
    @ColumnInfo(comment="血压",type="int(11)")
    @TableField(value = "gerentizheng_xieya")

    private Integer gerentizhengXieya;


    /**
     * 血糖
     */
    @ColumnInfo(comment="血糖",type="int(11)")
    @TableField(value = "gerentizheng_xietang")

    private Double gerentizhengXietang;


    /**
     * 身体质量
     */
    @ColumnInfo(comment="身体质量",type="int(11)")
    @TableField(value = "gerentizheng_types")

    private Integer gerentizhengTypes;


    /**
     * 身高
     */
    @ColumnInfo(comment="身高",type="int(11)")
    @TableField(value = "gerentizheng_shengao")

    private Integer gerentizhengShengao;


    /**
     * 体重KG
     */
    @ColumnInfo(comment="体重KG",type="int(11)")
    @TableField(value = "gerentizheng_tizhong")

    private Integer gerentizhengTizhong;


    /**
     * 体温
     */
    @ColumnInfo(comment="体温",type="int(11)")
    @TableField(value = "gerentizheng_tiwen")

    private Integer gerentizhengTiwen;


    /**
     * 步数
     */
    @ColumnInfo(comment="步数",type="int(11)")
    @TableField(value = "gerentizheng_bushu")

    private Integer gerentizhengBushu;


    /**
     * 视力L
     */
    @ColumnInfo(comment="视力L",type="int(11)")
    @TableField(value = "gerentizheng_shilil")

    private Integer gerentizhengShilil;


    /**
     * 视力R
     */
    @ColumnInfo(comment="视力R",type="int(11)")
    @TableField(value = "gerentizheng_shilir")

    private Integer gerentizhengShilir;


    /**
     * 体检报告
     */
    @ColumnInfo(comment="体检报告",type="varchar(200)")
    @TableField(value = "gerentizheng_file")

    private String gerentizhengFile;


    /**
     * 记录时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @ColumnInfo(comment="记录时间",type="date")
    @TableField(value = "gerentizheng_time")

    private Date gerentizhengTime;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 备注
     */
    @ColumnInfo(comment="备注",type="longtext")
    @TableField(value = "gerentizheng_text")

    private String gerentizhengText;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="添加时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 假删
     */
    @ColumnInfo(comment="假删",type="int(11)")
    @TableField(value = "gerentizheng_delete")

    private Integer gerentizhengDelete;


    /**
     * 创建时间  listShow
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
    public String getGerentizhengName() {
        return gerentizhengName;
    }
    /**
	 * 设置：标题
	 */

    public void setGerentizhengName(String gerentizhengName) {
        this.gerentizhengName = gerentizhengName;
    }
    /**
	 * 获取：血压
	 */
    public Integer getGerentizhengXieya() {
        return gerentizhengXieya;
    }
    /**
	 * 设置：血压
	 */

    public void setGerentizhengXieya(Integer gerentizhengXieya) {
        this.gerentizhengXieya = gerentizhengXieya;
    }
    /**
	 * 获取：血糖
	 */
    public Double getGerentizhengXietang() {
        return gerentizhengXietang;
    }
    /**
	 * 设置：血糖
	 */

    public void setGerentizhengXietang(Double gerentizhengXietang) {
        this.gerentizhengXietang = gerentizhengXietang;
    }
    /**
	 * 获取：身体质量
	 */
    public Integer getGerentizhengTypes() {
        return gerentizhengTypes;
    }
    /**
	 * 设置：身体质量
	 */

    public void setGerentizhengTypes(Integer gerentizhengTypes) {
        this.gerentizhengTypes = gerentizhengTypes;
    }
    /**
	 * 获取：身高
	 */
    public Integer getGerentizhengShengao() {
        return gerentizhengShengao;
    }
    /**
	 * 设置：身高
	 */

    public void setGerentizhengShengao(Integer gerentizhengShengao) {
        this.gerentizhengShengao = gerentizhengShengao;
    }
    /**
	 * 获取：体重KG
	 */
    public Integer getGerentizhengTizhong() {
        return gerentizhengTizhong;
    }
    /**
	 * 设置：体重KG
	 */

    public void setGerentizhengTizhong(Integer gerentizhengTizhong) {
        this.gerentizhengTizhong = gerentizhengTizhong;
    }
    /**
	 * 获取：体温
	 */
    public Integer getGerentizhengTiwen() {
        return gerentizhengTiwen;
    }
    /**
	 * 设置：体温
	 */

    public void setGerentizhengTiwen(Integer gerentizhengTiwen) {
        this.gerentizhengTiwen = gerentizhengTiwen;
    }
    /**
	 * 获取：步数
	 */
    public Integer getGerentizhengBushu() {
        return gerentizhengBushu;
    }
    /**
	 * 设置：步数
	 */

    public void setGerentizhengBushu(Integer gerentizhengBushu) {
        this.gerentizhengBushu = gerentizhengBushu;
    }
    /**
	 * 获取：视力L
	 */
    public Integer getGerentizhengShilil() {
        return gerentizhengShilil;
    }
    /**
	 * 设置：视力L
	 */

    public void setGerentizhengShilil(Integer gerentizhengShilil) {
        this.gerentizhengShilil = gerentizhengShilil;
    }
    /**
	 * 获取：视力R
	 */
    public Integer getGerentizhengShilir() {
        return gerentizhengShilir;
    }
    /**
	 * 设置：视力R
	 */

    public void setGerentizhengShilir(Integer gerentizhengShilir) {
        this.gerentizhengShilir = gerentizhengShilir;
    }
    /**
	 * 获取：体检报告
	 */
    public String getGerentizhengFile() {
        return gerentizhengFile;
    }
    /**
	 * 设置：体检报告
	 */

    public void setGerentizhengFile(String gerentizhengFile) {
        this.gerentizhengFile = gerentizhengFile;
    }
    /**
	 * 获取：记录时间
	 */
    public Date getGerentizhengTime() {
        return gerentizhengTime;
    }
    /**
	 * 设置：记录时间
	 */

    public void setGerentizhengTime(Date gerentizhengTime) {
        this.gerentizhengTime = gerentizhengTime;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 设置：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：备注
	 */
    public String getGerentizhengText() {
        return gerentizhengText;
    }
    /**
	 * 设置：备注
	 */

    public void setGerentizhengText(String gerentizhengText) {
        this.gerentizhengText = gerentizhengText;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：假删
	 */
    public Integer getGerentizhengDelete() {
        return gerentizhengDelete;
    }
    /**
	 * 设置：假删
	 */

    public void setGerentizhengDelete(Integer gerentizhengDelete) {
        this.gerentizhengDelete = gerentizhengDelete;
    }
    /**
	 * 获取：创建时间  listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间  listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Gerentizheng{" +
            ", id=" + id +
            ", gerentizhengName=" + gerentizhengName +
            ", gerentizhengXieya=" + gerentizhengXieya +
            ", gerentizhengXietang=" + gerentizhengXietang +
            ", gerentizhengTypes=" + gerentizhengTypes +
            ", gerentizhengShengao=" + gerentizhengShengao +
            ", gerentizhengTizhong=" + gerentizhengTizhong +
            ", gerentizhengTiwen=" + gerentizhengTiwen +
            ", gerentizhengBushu=" + gerentizhengBushu +
            ", gerentizhengShilil=" + gerentizhengShilil +
            ", gerentizhengShilir=" + gerentizhengShilir +
            ", gerentizhengFile=" + gerentizhengFile +
            ", gerentizhengTime=" + DateUtil.convertString(gerentizhengTime,"yyyy-MM-dd") +
            ", yonghuId=" + yonghuId +
            ", gerentizhengText=" + gerentizhengText +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", gerentizhengDelete=" + gerentizhengDelete +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
