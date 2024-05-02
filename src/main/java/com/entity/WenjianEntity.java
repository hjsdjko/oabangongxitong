package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 文件信息
 *
 * @author 
 * @email
 */
@TableName("wenjian")
public class WenjianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public WenjianEntity() {

	}

	public WenjianEntity(T t) {
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
    @TableField(value = "id")

    private Integer id;


    /**
     * 员工
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 文件名称
     */
    @TableField(value = "wenjian_name")

    private String wenjianName;


    /**
     * 文件类型
     */
    @TableField(value = "wenjian_types")

    private Integer wenjianTypes;


    /**
     * 文件审批状态
     */
    @TableField(value = "wenjian_yesno_types")

    private Integer wenjianYesnoTypes;


    /**
     * 文件
     */
    @TableField(value = "wenjian_file")

    private String wenjianFile;


    /**
     * 文件详情
     */
    @TableField(value = "wenjian_text")

    private String wenjianText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：员工
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：员工
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：文件名称
	 */
    public String getWenjianName() {
        return wenjianName;
    }


    /**
	 * 获取：文件名称
	 */

    public void setWenjianName(String wenjianName) {
        this.wenjianName = wenjianName;
    }
    /**
	 * 设置：文件类型
	 */
    public Integer getWenjianTypes() {
        return wenjianTypes;
    }


    /**
	 * 获取：文件类型
	 */

    public void setWenjianTypes(Integer wenjianTypes) {
        this.wenjianTypes = wenjianTypes;
    }
    /**
	 * 设置：文件审批状态
	 */
    public Integer getWenjianYesnoTypes() {
        return wenjianYesnoTypes;
    }


    /**
	 * 获取：文件审批状态
	 */

    public void setWenjianYesnoTypes(Integer wenjianYesnoTypes) {
        this.wenjianYesnoTypes = wenjianYesnoTypes;
    }
    /**
	 * 设置：文件
	 */
    public String getWenjianFile() {
        return wenjianFile;
    }


    /**
	 * 获取：文件
	 */

    public void setWenjianFile(String wenjianFile) {
        this.wenjianFile = wenjianFile;
    }
    /**
	 * 设置：文件详情
	 */
    public String getWenjianText() {
        return wenjianText;
    }


    /**
	 * 获取：文件详情
	 */

    public void setWenjianText(String wenjianText) {
        this.wenjianText = wenjianText;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Wenjian{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", wenjianName=" + wenjianName +
            ", wenjianTypes=" + wenjianTypes +
            ", wenjianYesnoTypes=" + wenjianYesnoTypes +
            ", wenjianFile=" + wenjianFile +
            ", wenjianText=" + wenjianText +
            ", createTime=" + createTime +
        "}";
    }
}
