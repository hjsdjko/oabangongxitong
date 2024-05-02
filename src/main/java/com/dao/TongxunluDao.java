package com.dao;

import com.entity.TongxunluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.TongxunluView;

/**
 * 通讯录 Dao 接口
 *
 * @author 
 */
public interface TongxunluDao extends BaseMapper<TongxunluEntity> {

   List<TongxunluView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
