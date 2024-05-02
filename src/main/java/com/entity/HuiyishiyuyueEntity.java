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
 * 会议室预约
 *
 * @author 
 * @email
 */
@TableName("huiyishiyuyue")
public class HuiyishiyuyueEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HuiyishiyuyueEntity() {

	}

	public HuiyishiyuyueEntity(T t) {
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
     * 会议室
     */
    @TableField(value = "huiyishi_id")

    private Integer huiyishiId;


    /**
     * 员工
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 预约状态
     */
    @TableField(value = "huiyishiyuyue_yesno_types")

    private Integer huiyishiyuyueYesnoTypes;


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
	 * 设置：会议室
	 */
    public Integer getHuiyishiId() {
        return huiyishiId;
    }


    /**
	 * 获取：会议室
	 */

    public void setHuiyishiId(Integer huiyishiId) {
        this.huiyishiId = huiyishiId;
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
	 * 设置：预约状态
	 */
    public Integer getHuiyishiyuyueYesnoTypes() {
        return huiyishiyuyueYesnoTypes;
    }


    /**
	 * 获取：预约状态
	 */

    public void setHuiyishiyuyueYesnoTypes(Integer huiyishiyuyueYesnoTypes) {
        this.huiyishiyuyueYesnoTypes = huiyishiyuyueYesnoTypes;
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
        return "Huiyishiyuyue{" +
            "id=" + id +
            ", huiyishiId=" + huiyishiId +
            ", yonghuId=" + yonghuId +
            ", huiyishiyuyueYesnoTypes=" + huiyishiyuyueYesnoTypes +
            ", createTime=" + createTime +
        "}";
    }
}
