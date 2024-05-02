package com.entity.model;

import com.entity.QingjiajiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 请假记录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class QingjiajiluModel implements Serializable {
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
     * 请假原因
     */
    private String qingjiajiluName;


    /**
     * 请假结果
     */
    private Integer qingjiajiluTypes;


    /**
     * 请假时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date richengTime;


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
	 * 获取：请假原因
	 */
    public String getQingjiajiluName() {
        return qingjiajiluName;
    }


    /**
	 * 设置：请假原因
	 */
    public void setQingjiajiluName(String qingjiajiluName) {
        this.qingjiajiluName = qingjiajiluName;
    }
    /**
	 * 获取：请假结果
	 */
    public Integer getQingjiajiluTypes() {
        return qingjiajiluTypes;
    }


    /**
	 * 设置：请假结果
	 */
    public void setQingjiajiluTypes(Integer qingjiajiluTypes) {
        this.qingjiajiluTypes = qingjiajiluTypes;
    }
    /**
	 * 获取：请假时间
	 */
    public Date getRichengTime() {
        return richengTime;
    }


    /**
	 * 设置：请假时间
	 */
    public void setRichengTime(Date richengTime) {
        this.richengTime = richengTime;
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
