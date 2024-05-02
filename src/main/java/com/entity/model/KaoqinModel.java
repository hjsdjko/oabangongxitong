package com.entity.model;

import com.entity.KaoqinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 考勤
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KaoqinModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 员工
     */
    private Integer yonghuId;


    /**
     * 上班考勤时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date onTime;


    /**
     * 下班考勤时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date downTime;


    /**
     * 考勤类型
     */
    private Integer kaoqinTypes;


    /**
     * 加班时间(小时)
     */
    private Integer overtimeNumber;


    /**
     * 考勤时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
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
	 * 获取：员工
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：员工
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：上班考勤时间
	 */
    public Date getOnTime() {
        return onTime;
    }


    /**
	 * 设置：上班考勤时间
	 */
    public void setOnTime(Date onTime) {
        this.onTime = onTime;
    }
    /**
	 * 获取：下班考勤时间
	 */
    public Date getDownTime() {
        return downTime;
    }


    /**
	 * 设置：下班考勤时间
	 */
    public void setDownTime(Date downTime) {
        this.downTime = downTime;
    }
    /**
	 * 获取：考勤类型
	 */
    public Integer getKaoqinTypes() {
        return kaoqinTypes;
    }


    /**
	 * 设置：考勤类型
	 */
    public void setKaoqinTypes(Integer kaoqinTypes) {
        this.kaoqinTypes = kaoqinTypes;
    }
    /**
	 * 获取：加班时间(小时)
	 */
    public Integer getOvertimeNumber() {
        return overtimeNumber;
    }


    /**
	 * 设置：加班时间(小时)
	 */
    public void setOvertimeNumber(Integer overtimeNumber) {
        this.overtimeNumber = overtimeNumber;
    }
    /**
	 * 获取：考勤时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：考勤时间
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

    }
