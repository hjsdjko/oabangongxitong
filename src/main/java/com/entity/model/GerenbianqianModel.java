package com.entity.model;

import com.entity.GerenbianqianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 个人便签
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GerenbianqianModel implements Serializable {
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
     * 便签名称
     */
    private String gerenbianqianName;


    /**
     * 便签类型
     */
    private Integer gerenbianqianTypes;


    /**
     * 日程信息详情
     */
    private String gerenbianqianContent;


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
	 * 获取：便签名称
	 */
    public String getGerenbianqianName() {
        return gerenbianqianName;
    }


    /**
	 * 设置：便签名称
	 */
    public void setGerenbianqianName(String gerenbianqianName) {
        this.gerenbianqianName = gerenbianqianName;
    }
    /**
	 * 获取：便签类型
	 */
    public Integer getGerenbianqianTypes() {
        return gerenbianqianTypes;
    }


    /**
	 * 设置：便签类型
	 */
    public void setGerenbianqianTypes(Integer gerenbianqianTypes) {
        this.gerenbianqianTypes = gerenbianqianTypes;
    }
    /**
	 * 获取：日程信息详情
	 */
    public String getGerenbianqianContent() {
        return gerenbianqianContent;
    }


    /**
	 * 设置：日程信息详情
	 */
    public void setGerenbianqianContent(String gerenbianqianContent) {
        this.gerenbianqianContent = gerenbianqianContent;
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
