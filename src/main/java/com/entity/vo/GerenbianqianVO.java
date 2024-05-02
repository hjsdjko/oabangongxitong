package com.entity.vo;

import com.entity.GerenbianqianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 个人便签
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gerenbianqian")
public class GerenbianqianVO implements Serializable {
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
     * 便签名称
     */

    @TableField(value = "gerenbianqian_name")
    private String gerenbianqianName;


    /**
     * 便签类型
     */

    @TableField(value = "gerenbianqian_types")
    private Integer gerenbianqianTypes;


    /**
     * 日程信息详情
     */

    @TableField(value = "gerenbianqian_content")
    private String gerenbianqianContent;


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
	 * 设置：便签名称
	 */
    public String getGerenbianqianName() {
        return gerenbianqianName;
    }


    /**
	 * 获取：便签名称
	 */

    public void setGerenbianqianName(String gerenbianqianName) {
        this.gerenbianqianName = gerenbianqianName;
    }
    /**
	 * 设置：便签类型
	 */
    public Integer getGerenbianqianTypes() {
        return gerenbianqianTypes;
    }


    /**
	 * 获取：便签类型
	 */

    public void setGerenbianqianTypes(Integer gerenbianqianTypes) {
        this.gerenbianqianTypes = gerenbianqianTypes;
    }
    /**
	 * 设置：日程信息详情
	 */
    public String getGerenbianqianContent() {
        return gerenbianqianContent;
    }


    /**
	 * 获取：日程信息详情
	 */

    public void setGerenbianqianContent(String gerenbianqianContent) {
        this.gerenbianqianContent = gerenbianqianContent;
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
