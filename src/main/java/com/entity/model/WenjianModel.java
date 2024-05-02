package com.entity.model;

import com.entity.WenjianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 文件信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class WenjianModel implements Serializable {
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
     * 文件名称
     */
    private String wenjianName;


    /**
     * 文件类型
     */
    private Integer wenjianTypes;


    /**
     * 文件审批状态
     */
    private Integer wenjianYesnoTypes;


    /**
     * 文件
     */
    private String wenjianFile;


    /**
     * 文件详情
     */
    private String wenjianText;


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
	 * 获取：文件名称
	 */
    public String getWenjianName() {
        return wenjianName;
    }


    /**
	 * 设置：文件名称
	 */
    public void setWenjianName(String wenjianName) {
        this.wenjianName = wenjianName;
    }
    /**
	 * 获取：文件类型
	 */
    public Integer getWenjianTypes() {
        return wenjianTypes;
    }


    /**
	 * 设置：文件类型
	 */
    public void setWenjianTypes(Integer wenjianTypes) {
        this.wenjianTypes = wenjianTypes;
    }
    /**
	 * 获取：文件审批状态
	 */
    public Integer getWenjianYesnoTypes() {
        return wenjianYesnoTypes;
    }


    /**
	 * 设置：文件审批状态
	 */
    public void setWenjianYesnoTypes(Integer wenjianYesnoTypes) {
        this.wenjianYesnoTypes = wenjianYesnoTypes;
    }
    /**
	 * 获取：文件
	 */
    public String getWenjianFile() {
        return wenjianFile;
    }


    /**
	 * 设置：文件
	 */
    public void setWenjianFile(String wenjianFile) {
        this.wenjianFile = wenjianFile;
    }
    /**
	 * 获取：文件详情
	 */
    public String getWenjianText() {
        return wenjianText;
    }


    /**
	 * 设置：文件详情
	 */
    public void setWenjianText(String wenjianText) {
        this.wenjianText = wenjianText;
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
