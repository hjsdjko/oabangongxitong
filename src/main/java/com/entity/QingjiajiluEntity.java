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
 * 请假记录
 *
 * @author 
 * @email
 */
@TableName("qingjiajilu")
public class QingjiajiluEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public QingjiajiluEntity() {

	}

	public QingjiajiluEntity(T t) {
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
     * 请假原因
     */
    @TableField(value = "qingjiajilu_name")

    private String qingjiajiluName;


    /**
     * 请假结果
     */
    @TableField(value = "qingjiajilu_types")

    private Integer qingjiajiluTypes;


    /**
     * 请假时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "richeng_time")

    private Date richengTime;


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
	 * 设置：请假原因
	 */
    public String getQingjiajiluName() {
        return qingjiajiluName;
    }


    /**
	 * 获取：请假原因
	 */

    public void setQingjiajiluName(String qingjiajiluName) {
        this.qingjiajiluName = qingjiajiluName;
    }
    /**
	 * 设置：请假结果
	 */
    public Integer getQingjiajiluTypes() {
        return qingjiajiluTypes;
    }


    /**
	 * 获取：请假结果
	 */

    public void setQingjiajiluTypes(Integer qingjiajiluTypes) {
        this.qingjiajiluTypes = qingjiajiluTypes;
    }
    /**
	 * 设置：请假时间
	 */
    public Date getRichengTime() {
        return richengTime;
    }


    /**
	 * 获取：请假时间
	 */

    public void setRichengTime(Date richengTime) {
        this.richengTime = richengTime;
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
        return "Qingjiajilu{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", qingjiajiluName=" + qingjiajiluName +
            ", qingjiajiluTypes=" + qingjiajiluTypes +
            ", richengTime=" + richengTime +
            ", createTime=" + createTime +
        "}";
    }
}
