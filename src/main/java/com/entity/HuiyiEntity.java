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
 * 会议信息
 *
 * @author 
 * @email
 */
@TableName("huiyi")
public class HuiyiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HuiyiEntity() {

	}

	public HuiyiEntity(T t) {
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
     * 会议主题
     */
    @TableField(value = "huiyi_name")

    private String huiyiName;


    /**
     * 会议类型
     */
    @TableField(value = "huiyi_types")

    private Integer huiyiTypes;


    /**
     * 会议时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "huiyi_time")

    private Date huiyiTime;


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
	 * 设置：会议主题
	 */
    public String getHuiyiName() {
        return huiyiName;
    }


    /**
	 * 获取：会议主题
	 */

    public void setHuiyiName(String huiyiName) {
        this.huiyiName = huiyiName;
    }
    /**
	 * 设置：会议类型
	 */
    public Integer getHuiyiTypes() {
        return huiyiTypes;
    }


    /**
	 * 获取：会议类型
	 */

    public void setHuiyiTypes(Integer huiyiTypes) {
        this.huiyiTypes = huiyiTypes;
    }
    /**
	 * 设置：会议时间
	 */
    public Date getHuiyiTime() {
        return huiyiTime;
    }


    /**
	 * 获取：会议时间
	 */

    public void setHuiyiTime(Date huiyiTime) {
        this.huiyiTime = huiyiTime;
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
        return "Huiyi{" +
            "id=" + id +
            ", huiyishiId=" + huiyishiId +
            ", huiyiName=" + huiyiName +
            ", huiyiTypes=" + huiyiTypes +
            ", huiyiTime=" + huiyiTime +
            ", createTime=" + createTime +
        "}";
    }
}
