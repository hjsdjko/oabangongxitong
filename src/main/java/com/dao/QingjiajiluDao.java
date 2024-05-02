package com.dao;

import com.entity.QingjiajiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.QingjiajiluView;

/**
 * 请假记录 Dao 接口
 *
 * @author 
 */
public interface QingjiajiluDao extends BaseMapper<QingjiajiluEntity> {

   List<QingjiajiluView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
