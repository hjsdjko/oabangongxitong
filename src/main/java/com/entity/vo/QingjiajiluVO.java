package com.entity.vo;

import com.entity.QingjiajiluEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 请假记录
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("qingjiajilu")
public class QingjiajiluVO implements Serializable {
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
     * 请假原因
     */

    @TableField(value = "qingjiajilu_name")
    private String qingjiajiluName;


    /**
     * 请假结果
     */

    @TableField(value = "qingjiajilu_types")
    private Integer qingjiajiluTypes;


    /**
     * 请假时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "richeng_time")
    private Date richengTime;


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
	 * 设置：请假原因
	 */
    public String getQingjiajiluName() {
        return qingjiajiluName;
    }


    /**
	 * 获取：请假原因
	 */

    public void setQingjiajiluName(String qingjiajiluName) {
        this.qingjiajiluName = qingjiajiluName;
    }
    /**
	 * 设置：请假结果
	 */
    public Integer getQingjiajiluTypes() {
        return qingjiajiluTypes;
    }


    /**
	 * 获取：请假结果
	 */

    public void setQingjiajiluTypes(Integer qingjiajiluTypes) {
        this.qingjiajiluTypes = qingjiajiluTypes;
    }
    /**
	 * 设置：请假时间
	 */
    public Date getRichengTime() {
        return richengTime;
    }


    /**
	 * 获取：请假时间
	 */

    public void setRichengTime(Date richengTime) {
        this.richengTime = richengTime;
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
