package com.entity.model;

import com.entity.RichengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 日程信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class RichengModel implements Serializable {
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
     * 日程标题
     */
    private String richengRicheng;


    /**
     * 日程类型
     */
    private Integer richengTypes;


    /**
     * 日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date richengTime;


    /**
     * 日程信息备注
     */
    private String richengText;


    /**
     * 日程信息详情
     */
    private String richengContent;


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
	 * 获取：日程标题
	 */
    public String getRichengRicheng() {
        return richengRicheng;
    }


    /**
	 * 设置：日程标题
	 */
    public void setRichengRicheng(String richengRicheng) {
        this.richengRicheng = richengRicheng;
    }
    /**
	 * 获取：日程类型
	 */
    public Integer getRichengTypes() {
        return richengTypes;
    }


    /**
	 * 设置：日程类型
	 */
    public void setRichengTypes(Integer richengTypes) {
        this.richengTypes = richengTypes;
    }
    /**
	 * 获取：日期
	 */
    public Date getRichengTime() {
        return richengTime;
    }


    /**
	 * 设置：日期
	 */
    public void setRichengTime(Date richengTime) {
        this.richengTime = richengTime;
    }
    /**
	 * 获取：日程信息备注
	 */
    public String getRichengText() {
        return richengText;
    }


    /**
	 * 设置：日程信息备注
	 */
    public void setRichengText(String richengText) {
        this.richengText = richengText;
    }
    /**
	 * 获取：日程信息详情
	 */
    public String getRichengContent() {
        return richengContent;
    }


    /**
	 * 设置：日程信息详情
	 */
    public void setRichengContent(String richengContent) {
        this.richengContent = richengContent;
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
