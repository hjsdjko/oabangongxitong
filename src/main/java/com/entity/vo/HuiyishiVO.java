package com.entity.vo;

import com.entity.HuiyishiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 会议室
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("huiyishi")
public class HuiyishiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 会议室名称
     */

    @TableField(value = "huiyishi_name")
    private String huiyishiName;


    /**
     * 会议室地点
     */

    @TableField(value = "huiyishi_address")
    private String huiyishiAddress;


    /**
     * 会议室大小
     */

    @TableField(value = "huiyishi_size")
    private String huiyishiSize;


    /**
     * 会议室类型
     */

    @TableField(value = "huiyishi_types")
    private Integer huiyishiTypes;


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
	 * 设置：会议室名称
	 */
    public String getHuiyishiName() {
        return huiyishiName;
    }


    /**
	 * 获取：会议室名称
	 */

    public void setHuiyishiName(String huiyishiName) {
        this.huiyishiName = huiyishiName;
    }
    /**
	 * 设置：会议室地点
	 */
    public String getHuiyishiAddress() {
        return huiyishiAddress;
    }


    /**
	 * 获取：会议室地点
	 */

    public void setHuiyishiAddress(String huiyishiAddress) {
        this.huiyishiAddress = huiyishiAddress;
    }
    /**
	 * 设置：会议室大小
	 */
    public String getHuiyishiSize() {
        return huiyishiSize;
    }


    /**
	 * 获取：会议室大小
	 */

    public void setHuiyishiSize(String huiyishiSize) {
        this.huiyishiSize = huiyishiSize;
    }
    /**
	 * 设置：会议室类型
	 */
    public Integer getHuiyishiTypes() {
        return huiyishiTypes;
    }


    /**
	 * 获取：会议室类型
	 */

    public void setHuiyishiTypes(Integer huiyishiTypes) {
        this.huiyishiTypes = huiyishiTypes;
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
