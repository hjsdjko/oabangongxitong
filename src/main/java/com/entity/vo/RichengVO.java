package com.entity.vo;

import com.entity.RichengEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 日程信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("richeng")
public class RichengVO implements Serializable {
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
     * 日程标题
     */

    @TableField(value = "richeng_richeng")
    private String richengRicheng;


    /**
     * 日程类型
     */

    @TableField(value = "richeng_types")
    private Integer richengTypes;


    /**
     * 日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "richeng_time")
    private Date richengTime;


    /**
     * 日程信息备注
     */

    @TableField(value = "richeng_text")
    private String richengText;


    /**
     * 日程信息详情
     */

    @TableField(value = "richeng_content")
    private String richengContent;


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
	 * 设置：日程标题
	 */
    public String getRichengRicheng() {
        return richengRicheng;
    }


    /**
	 * 获取：日程标题
	 */

    public void setRichengRicheng(String richengRicheng) {
        this.richengRicheng = richengRicheng;
    }
    /**
	 * 设置：日程类型
	 */
    public Integer getRichengTypes() {
        return richengTypes;
    }


    /**
	 * 获取：日程类型
	 */

    public void setRichengTypes(Integer richengTypes) {
        this.richengTypes = richengTypes;
    }
    /**
	 * 设置：日期
	 */
    public Date getRichengTime() {
        return richengTime;
    }


    /**
	 * 获取：日期
	 */

    public void setRichengTime(Date richengTime) {
        this.richengTime = richengTime;
    }
    /**
	 * 设置：日程信息备注
	 */
    public String getRichengText() {
        return richengText;
    }


    /**
	 * 获取：日程信息备注
	 */

    public void setRichengText(String richengText) {
        this.richengText = richengText;
    }
    /**
	 * 设置：日程信息详情
	 */
    public String getRichengContent() {
        return richengContent;
    }


    /**
	 * 获取：日程信息详情
	 */

    public void setRichengContent(String richengContent) {
        this.richengContent = richengContent;
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
