package com.entity.vo;

import com.entity.GerentizhengEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 健康上报
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gerentizheng")
public class GerentizhengVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "gerentizheng_name")
    private String gerentizhengName;


    /**
     * 血压
     */

    @TableField(value = "gerentizheng_xieya")
    private Integer gerentizhengXieya;


    /**
     * 血糖
     */

    @TableField(value = "gerentizheng_xietang")
    private Integer gerentizhengXietang;


    /**
     * 身体质量
     */

    @TableField(value = "gerentizheng_types")
    private Integer gerentizhengTypes;


    /**
     * 身高
     */

    @TableField(value = "gerentizheng_shengao")
    private Integer gerentizhengShengao;


    /**
     * 体重KG
     */

    @TableField(value = "gerentizheng_tizhong")
    private Integer gerentizhengTizhong;


    /**
     * 体温
     */

    @TableField(value = "gerentizheng_tiwen")
    private Integer gerentizhengTiwen;


    /**
     * 步数
     */

    @TableField(value = "gerentizheng_bushu")
    private Integer gerentizhengBushu;


    /**
     * 视力L
     */

    @TableField(value = "gerentizheng_shilil")
    private Integer gerentizhengShilil;


    /**
     * 视力R
     */

    @TableField(value = "gerentizheng_shilir")
    private Integer gerentizhengShilir;


    /**
     * 体检报告
     */

    @TableField(value = "gerentizheng_file")
    private String gerentizhengFile;


    /**
     * 记录时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "gerentizheng_time")
    private Date gerentizhengTime;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 备注
     */

    @TableField(value = "gerentizheng_text")
    private String gerentizhengText;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 假删
     */

    @TableField(value = "gerentizheng_delete")
    private Integer gerentizhengDelete;


    /**
     * 创建时间 show3 listShow
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
    public String getGerentizhengName() {
        return gerentizhengName;
    }


    /**
	 * 获取：标题
	 */

    public void setGerentizhengName(String gerentizhengName) {
        this.gerentizhengName = gerentizhengName;
    }
    /**
	 * 设置：血压
	 */
    public Integer getGerentizhengXieya() {
        return gerentizhengXieya;
    }


    /**
	 * 获取：血压
	 */

    public void setGerentizhengXieya(Integer gerentizhengXieya) {
        this.gerentizhengXieya = gerentizhengXieya;
    }
    /**
	 * 设置：血糖
	 */
    public Integer getGerentizhengXietang() {
        return gerentizhengXietang;
    }


    /**
	 * 获取：血糖
	 */

    public void setGerentizhengXietang(Integer gerentizhengXietang) {
        this.gerentizhengXietang = gerentizhengXietang;
    }
    /**
	 * 设置：身体质量
	 */
    public Integer getGerentizhengTypes() {
        return gerentizhengTypes;
    }


    /**
	 * 获取：身体质量
	 */

    public void setGerentizhengTypes(Integer gerentizhengTypes) {
        this.gerentizhengTypes = gerentizhengTypes;
    }
    /**
	 * 设置：身高
	 */
    public Integer getGerentizhengShengao() {
        return gerentizhengShengao;
    }


    /**
	 * 获取：身高
	 */

    public void setGerentizhengShengao(Integer gerentizhengShengao) {
        this.gerentizhengShengao = gerentizhengShengao;
    }
    /**
	 * 设置：体重KG
	 */
    public Integer getGerentizhengTizhong() {
        return gerentizhengTizhong;
    }


    /**
	 * 获取：体重KG
	 */

    public void setGerentizhengTizhong(Integer gerentizhengTizhong) {
        this.gerentizhengTizhong = gerentizhengTizhong;
    }
    /**
	 * 设置：体温
	 */
    public Integer getGerentizhengTiwen() {
        return gerentizhengTiwen;
    }


    /**
	 * 获取：体温
	 */

    public void setGerentizhengTiwen(Integer gerentizhengTiwen) {
        this.gerentizhengTiwen = gerentizhengTiwen;
    }
    /**
	 * 设置：步数
	 */
    public Integer getGerentizhengBushu() {
        return gerentizhengBushu;
    }


    /**
	 * 获取：步数
	 */

    public void setGerentizhengBushu(Integer gerentizhengBushu) {
        this.gerentizhengBushu = gerentizhengBushu;
    }
    /**
	 * 设置：视力L
	 */
    public Integer getGerentizhengShilil() {
        return gerentizhengShilil;
    }


    /**
	 * 获取：视力L
	 */

    public void setGerentizhengShilil(Integer gerentizhengShilil) {
        this.gerentizhengShilil = gerentizhengShilil;
    }
    /**
	 * 设置：视力R
	 */
    public Integer getGerentizhengShilir() {
        return gerentizhengShilir;
    }


    /**
	 * 获取：视力R
	 */

    public void setGerentizhengShilir(Integer gerentizhengShilir) {
        this.gerentizhengShilir = gerentizhengShilir;
    }
    /**
	 * 设置：体检报告
	 */
    public String getGerentizhengFile() {
        return gerentizhengFile;
    }


    /**
	 * 获取：体检报告
	 */

    public void setGerentizhengFile(String gerentizhengFile) {
        this.gerentizhengFile = gerentizhengFile;
    }
    /**
	 * 设置：记录时间
	 */
    public Date getGerentizhengTime() {
        return gerentizhengTime;
    }


    /**
	 * 获取：记录时间
	 */

    public void setGerentizhengTime(Date gerentizhengTime) {
        this.gerentizhengTime = gerentizhengTime;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：备注
	 */
    public String getGerentizhengText() {
        return gerentizhengText;
    }


    /**
	 * 获取：备注
	 */

    public void setGerentizhengText(String gerentizhengText) {
        this.gerentizhengText = gerentizhengText;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：假删
	 */
    public Integer getGerentizhengDelete() {
        return gerentizhengDelete;
    }


    /**
	 * 获取：假删
	 */

    public void setGerentizhengDelete(Integer gerentizhengDelete) {
        this.gerentizhengDelete = gerentizhengDelete;
    }
    /**
	 * 设置：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
