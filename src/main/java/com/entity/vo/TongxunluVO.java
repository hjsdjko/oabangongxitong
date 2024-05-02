package com.entity.vo;

import com.entity.TongxunluEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 通讯录
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("tongxunlu")
public class TongxunluVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 员工
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 联系人姓
     */

    @TableField(value = "tongxunlu_chengguo")
    private String tongxunluChengguo;


    /**
     * 联系人名
     */

    @TableField(value = "tongxunlu_zhengshu")
    private String tongxunluZhengshu;


    /**
     * 联系方式
     */

    @TableField(value = "tongxunlu_phone")
    private String tongxunluPhone;


    /**
     * 联系人类型
     */

    @TableField(value = "tongxunlu_types")
    private Integer tongxunluTypes;


    /**
     * 备注
     */

    @TableField(value = "gerenbianqian_text")
    private String gerenbianqianText;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：联系人姓
	 */
    public String getTongxunluChengguo() {
        return tongxunluChengguo;
    }


    /**
	 * 获取：联系人姓
	 */

    public void setTongxunluChengguo(String tongxunluChengguo) {
        this.tongxunluChengguo = tongxunluChengguo;
    }
    /**
	 * 设置：联系人名
	 */
    public String getTongxunluZhengshu() {
        return tongxunluZhengshu;
    }


    /**
	 * 获取：联系人名
	 */

    public void setTongxunluZhengshu(String tongxunluZhengshu) {
        this.tongxunluZhengshu = tongxunluZhengshu;
    }
    /**
	 * 设置：联系方式
	 */
    public String getTongxunluPhone() {
        return tongxunluPhone;
    }


    /**
	 * 获取：联系方式
	 */

    public void setTongxunluPhone(String tongxunluPhone) {
        this.tongxunluPhone = tongxunluPhone;
    }
    /**
	 * 设置：联系人类型
	 */
    public Integer getTongxunluTypes() {
        return tongxunluTypes;
    }


    /**
	 * 获取：联系人类型
	 */

    public void setTongxunluTypes(Integer tongxunluTypes) {
        this.tongxunluTypes = tongxunluTypes;
    }
    /**
	 * 设置：备注
	 */
    public String getGerenbianqianText() {
        return gerenbianqianText;
    }


    /**
	 * 获取：备注
	 */

    public void setGerenbianqianText(String gerenbianqianText) {
        this.gerenbianqianText = gerenbianqianText;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
