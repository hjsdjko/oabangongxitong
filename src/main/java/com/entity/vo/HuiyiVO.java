package com.entity.vo;

import com.entity.HuiyiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 会议信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("huiyi")
public class HuiyiVO implements Serializable {
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
     * 会议主题
     */

    @TableField(value = "huiyi_name")
    private String huiyiName;


    /**
     * 会议类型
     */

    @TableField(value = "huiyi_types")
    private Integer huiyiTypes;


    /**
     * 会议时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "huiyi_time")
    private Date huiyiTime;


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
	 * 设置：会议主题
	 */
    public String getHuiyiName() {
        return huiyiName;
    }


    /**
	 * 获取：会议主题
	 */

    public void setHuiyiName(String huiyiName) {
        this.huiyiName = huiyiName;
    }
    /**
	 * 设置：会议类型
	 */
    public Integer getHuiyiTypes() {
        return huiyiTypes;
    }


    /**
	 * 获取：会议类型
	 */

    public void setHuiyiTypes(Integer huiyiTypes) {
        this.huiyiTypes = huiyiTypes;
    }
    /**
	 * 设置：会议时间
	 */
    public Date getHuiyiTime() {
        return huiyiTime;
    }


    /**
	 * 获取：会议时间
	 */

    public void setHuiyiTime(Date huiyiTime) {
        this.huiyiTime = huiyiTime;
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
