package com.entity.model;

import com.entity.HuiyishiyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 会议室预约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class HuiyishiyuyueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 会议室
     */
    private Integer huiyishiId;


    /**
     * 员工
     */
    private Integer yonghuId;


    /**
     * 预约状态
     */
    private Integer huiyishiyuyueYesnoTypes;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：会议室
	 */
    public Integer getHuiyishiId() {
        return huiyishiId;
    }


    /**
	 * 设置：会议室
	 */
    public void setHuiyishiId(Integer huiyishiId) {
        this.huiyishiId = huiyishiId;
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
	 * 获取：预约状态
	 */
    public Integer getHuiyishiyuyueYesnoTypes() {
        return huiyishiyuyueYesnoTypes;
    }


    /**
	 * 设置：预约状态
	 */
    public void setHuiyishiyuyueYesnoTypes(Integer huiyishiyuyueYesnoTypes) {
        this.huiyishiyuyueYesnoTypes = huiyishiyuyueYesnoTypes;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
