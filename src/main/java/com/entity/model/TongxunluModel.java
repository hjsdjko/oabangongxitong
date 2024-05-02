package com.entity.model;

import com.entity.TongxunluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 通讯录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class TongxunluModel implements Serializable {
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
     * 联系人姓
     */
    private String tongxunluChengguo;


    /**
     * 联系人名
     */
    private String tongxunluZhengshu;


    /**
     * 联系方式
     */
    private String tongxunluPhone;


    /**
     * 联系人类型
     */
    private Integer tongxunluTypes;


    /**
     * 备注
     */
    private String gerenbianqianText;


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
	 * 获取：联系人姓
	 */
    public String getTongxunluChengguo() {
        return tongxunluChengguo;
    }


    /**
	 * 设置：联系人姓
	 */
    public void setTongxunluChengguo(String tongxunluChengguo) {
        this.tongxunluChengguo = tongxunluChengguo;
    }
    /**
	 * 获取：联系人名
	 */
    public String getTongxunluZhengshu() {
        return tongxunluZhengshu;
    }


    /**
	 * 设置：联系人名
	 */
    public void setTongxunluZhengshu(String tongxunluZhengshu) {
        this.tongxunluZhengshu = tongxunluZhengshu;
    }
    /**
	 * 获取：联系方式
	 */
    public String getTongxunluPhone() {
        return tongxunluPhone;
    }


    /**
	 * 设置：联系方式
	 */
    public void setTongxunluPhone(String tongxunluPhone) {
        this.tongxunluPhone = tongxunluPhone;
    }
    /**
	 * 获取：联系人类型
	 */
    public Integer getTongxunluTypes() {
        return tongxunluTypes;
    }


    /**
	 * 设置：联系人类型
	 */
    public void setTongxunluTypes(Integer tongxunluTypes) {
        this.tongxunluTypes = tongxunluTypes;
    }
    /**
	 * 获取：备注
	 */
    public String getGerenbianqianText() {
        return gerenbianqianText;
    }


    /**
	 * 设置：备注
	 */
    public void setGerenbianqianText(String gerenbianqianText) {
        this.gerenbianqianText = gerenbianqianText;
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
