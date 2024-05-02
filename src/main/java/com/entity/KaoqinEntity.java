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
 * 考勤
 *
 * @author 
 * @email
 */
@TableName("kaoqin")
public class KaoqinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KaoqinEntity() {

	}

	public KaoqinEntity(T t) {
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
     * 上班考勤时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "on_time")

    private Date onTime;


    /**
     * 下班考勤时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "down_time")

    private Date downTime;


    /**
     * 考勤类型
     */
    @TableField(value = "kaoqin_types")

    private Integer kaoqinTypes;


    /**
     * 加班时间(小时)
     */
    @TableField(value = "overtimeNumber")

    private Integer overtimeNumber;


    /**
     * 考勤时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 设置：上班考勤时间
	 */
    public Date getOnTime() {
        return onTime;
    }


    /**
	 * 获取：上班考勤时间
	 */

    public void setOnTime(Date onTime) {
        this.onTime = onTime;
    }
    /**
	 * 设置：下班考勤时间
	 */
    public Date getDownTime() {
        return downTime;
    }


    /**
	 * 获取：下班考勤时间
	 */

    public void setDownTime(Date downTime) {
        this.downTime = downTime;
    }
    /**
	 * 设置：考勤类型
	 */
    public Integer getKaoqinTypes() {
        return kaoqinTypes;
    }


    /**
	 * 获取：考勤类型
	 */

    public void setKaoqinTypes(Integer kaoqinTypes) {
        this.kaoqinTypes = kaoqinTypes;
    }
    /**
	 * 设置：加班时间(小时)
	 */
    public Integer getOvertimeNumber() {
        return overtimeNumber;
    }


    /**
	 * 获取：加班时间(小时)
	 */

    public void setOvertimeNumber(Integer overtimeNumber) {
        this.overtimeNumber = overtimeNumber;
    }
    /**
	 * 设置：考勤时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：考勤时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
        return "Kaoqin{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", onTime=" + onTime +
            ", downTime=" + downTime +
            ", kaoqinTypes=" + kaoqinTypes +
            ", overtimeNumber=" + overtimeNumber +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
