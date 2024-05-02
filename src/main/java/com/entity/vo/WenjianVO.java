package com.entity.vo;

import com.entity.WenjianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 文件信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("wenjian")
public class WenjianVO implements Serializable {
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
     * 文件名称
     */

    @TableField(value = "wenjian_name")
    private String wenjianName;


    /**
     * 文件类型
     */

    @TableField(value = "wenjian_types")
    private Integer wenjianTypes;


    /**
     * 文件审批状态
     */

    @TableField(value = "wenjian_yesno_types")
    private Integer wenjianYesnoTypes;


    /**
     * 文件
     */

    @TableField(value = "wenjian_file")
    private String wenjianFile;


    /**
     * 文件详情
     */

    @TableField(value = "wenjian_text")
    private String wenjianText;


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
	 * 设置：文件名称
	 */
    public String getWenjianName() {
        return wenjianName;
    }


    /**
	 * 获取：文件名称
	 */

    public void setWenjianName(String wenjianName) {
        this.wenjianName = wenjianName;
    }
    /**
	 * 设置：文件类型
	 */
    public Integer getWenjianTypes() {
        return wenjianTypes;
    }


    /**
	 * 获取：文件类型
	 */

    public void setWenjianTypes(Integer wenjianTypes) {
        this.wenjianTypes = wenjianTypes;
    }
    /**
	 * 设置：文件审批状态
	 */
    public Integer getWenjianYesnoTypes() {
        return wenjianYesnoTypes;
    }


    /**
	 * 获取：文件审批状态
	 */

    public void setWenjianYesnoTypes(Integer wenjianYesnoTypes) {
        this.wenjianYesnoTypes = wenjianYesnoTypes;
    }
    /**
	 * 设置：文件
	 */
    public String getWenjianFile() {
        return wenjianFile;
    }


    /**
	 * 获取：文件
	 */

    public void setWenjianFile(String wenjianFile) {
        this.wenjianFile = wenjianFile;
    }
    /**
	 * 设置：文件详情
	 */
    public String getWenjianText() {
        return wenjianText;
    }


    /**
	 * 获取：文件详情
	 */

    public void setWenjianText(String wenjianText) {
        this.wenjianText = wenjianText;
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
