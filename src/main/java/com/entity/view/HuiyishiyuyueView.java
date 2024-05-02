package com.entity.view;

import com.entity.HuiyishiyuyueEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 会议室预约
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("huiyishiyuyue")
public class HuiyishiyuyueView extends HuiyishiyuyueEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 预约状态的值
		*/
		private String huiyishiyuyueYesnoValue;



		//级联表 huiyishi
			/**
			* 会议室名称
			*/
			private String huiyishiName;
			/**
			* 会议室地点
			*/
			private String huiyishiAddress;
			/**
			* 会议室大小
			*/
			private String huiyishiSize;
			/**
			* 会议室类型
			*/
			private Integer huiyishiTypes;
				/**
				* 会议室类型的值
				*/
				private String huiyishiValue;

		//级联表 yonghu
			/**
			* 员工姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 员工身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public HuiyishiyuyueView() {

	}

	public HuiyishiyuyueView(HuiyishiyuyueEntity huiyishiyuyueEntity) {
		try {
			BeanUtils.copyProperties(this, huiyishiyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 预约状态的值
			*/
			public String getHuiyishiyuyueYesnoValue() {
				return huiyishiyuyueYesnoValue;
			}
			/**
			* 设置： 预约状态的值
			*/
			public void setHuiyishiyuyueYesnoValue(String huiyishiyuyueYesnoValue) {
				this.huiyishiyuyueYesnoValue = huiyishiyuyueYesnoValue;
			}













				//级联表的get和set huiyishi
					/**
					* 获取： 会议室名称
					*/
					public String getHuiyishiName() {
						return huiyishiName;
					}
					/**
					* 设置： 会议室名称
					*/
					public void setHuiyishiName(String huiyishiName) {
						this.huiyishiName = huiyishiName;
					}
					/**
					* 获取： 会议室地点
					*/
					public String getHuiyishiAddress() {
						return huiyishiAddress;
					}
					/**
					* 设置： 会议室地点
					*/
					public void setHuiyishiAddress(String huiyishiAddress) {
						this.huiyishiAddress = huiyishiAddress;
					}
					/**
					* 获取： 会议室大小
					*/
					public String getHuiyishiSize() {
						return huiyishiSize;
					}
					/**
					* 设置： 会议室大小
					*/
					public void setHuiyishiSize(String huiyishiSize) {
						this.huiyishiSize = huiyishiSize;
					}
					/**
					* 获取： 会议室类型
					*/
					public Integer getHuiyishiTypes() {
						return huiyishiTypes;
					}
					/**
					* 设置： 会议室类型
					*/
					public void setHuiyishiTypes(Integer huiyishiTypes) {
						this.huiyishiTypes = huiyishiTypes;
					}


						/**
						* 获取： 会议室类型的值
						*/
						public String getHuiyishiValue() {
							return huiyishiValue;
						}
						/**
						* 设置： 会议室类型的值
						*/
						public void setHuiyishiValue(String huiyishiValue) {
							this.huiyishiValue = huiyishiValue;
						}

























				//级联表的get和set yonghu
					/**
					* 获取： 员工姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 员工姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 员工身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 员工身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
