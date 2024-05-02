package com.entity.view;

import com.entity.HuiyishiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 会议室
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("huiyishi")
public class HuiyishiView extends HuiyishiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 会议室类型的值
		*/
		private String huiyishiValue;



	public HuiyishiView() {

	}

	public HuiyishiView(HuiyishiEntity huiyishiEntity) {
		try {
			BeanUtils.copyProperties(this, huiyishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
