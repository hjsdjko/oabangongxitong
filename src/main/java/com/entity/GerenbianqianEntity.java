package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 个人便签
 *
 * @author 
 * @email
 */
@TableName("gerenbianqian")
public class GerenbianqianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GerenbianqianEntity() {

	}

	public GerenbianqianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Gerenbianqian{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", gerenbianqianName=" + gerenbianqianName +
            ", gerenbianqianTypes=" + gerenbianqianTypes +
            ", gerenbianqianContent=" + gerenbianqianContent +
            ", createTime=" + createTime +
        "}";
    }
}
