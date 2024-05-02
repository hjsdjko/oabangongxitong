package com.entity.model;

import com.entity.HuiyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 会议信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class HuiyiModel implements Serializable {
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
     * 会议主题
     */
    private String huiyiName;


    /**
     * 会议类型
     */
    private Integer huiyiTypes;


    /**
     * 会议时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date huiyiTime;


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
	 * 获取：会议主题
	 */
    public String getHuiyiName() {
        return huiyiName;
    }


    /**
	 * 设置：会议主题
	 */
    public void setHuiyiName(String huiyiName) {
        this.huiyiName = huiyiName;
    }
    /**
	 * 获取：会议类型
	 */
    public Integer getHuiyiTypes() {
        return huiyiTypes;
    }


    /**
	 * 设置：会议类型
	 */
    public void setHuiyiTypes(Integer huiyiTypes) {
        this.huiyiTypes = huiyiTypes;
    }
    /**
	 * 获取：会议时间
	 */
    public Date getHuiyiTime() {
        return huiyiTime;
    }


    /**
	 * 设置：会议时间
	 */
    public void setHuiyiTime(Date huiyiTime) {
        this.huiyiTime = huiyiTime;
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
