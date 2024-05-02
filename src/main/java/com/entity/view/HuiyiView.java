package com.entity.view;

import com.entity.HuiyiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 会议信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("huiyi")
public class HuiyiView extends HuiyiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 会议类型的值
		*/
		private String huiyiValue;



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

	public HuiyiView() {

	}

	public HuiyiView(HuiyiEntity huiyiEntity) {
		try {
			BeanUtils.copyProperties(this, huiyiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 会议类型的值
			*/
			public String getHuiyiValue() {
				return huiyiValue;
			}
			/**
			* 设置： 会议类型的值
			*/
			public void setHuiyiValue(String huiyiValue) {
				this.huiyiValue = huiyiValue;
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


















}
