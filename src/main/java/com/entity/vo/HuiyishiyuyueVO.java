package com.entity.vo;

import com.entity.HuiyishiyuyueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 会议室预约
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("huiyishiyuyue")
public class HuiyishiyuyueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 会议室
     */

    @TableField(value = "huiyishi_id")
    private Integer huiyishiId;


    /**
     * 员工
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 预约状态
     */

    @TableField(value = "huiyishiyuyue_yesno_types")
    private Integer huiyishiyuyueYesnoTypes;


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
	 * 设置：会议室
	 */
    public Integer getHuiyishiId() {
        return huiyishiId;
    }


    /**
	 * 获取：会议室
	 */

    public void setHuiyishiId(Integer huiyishiId) {
        this.huiyishiId = huiyishiId;
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
	 * 设置：预约状态
	 */
    public Integer getHuiyishiyuyueYesnoTypes() {
        return huiyishiyuyueYesnoTypes;
    }


    /**
	 * 获取：预约状态
	 */

    public void setHuiyishiyuyueYesnoTypes(Integer huiyishiyuyueYesnoTypes) {
        this.huiyishiyuyueYesnoTypes = huiyishiyuyueYesnoTypes;
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
