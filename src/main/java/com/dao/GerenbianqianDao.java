package com.dao;

import com.entity.GerenbianqianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GerenbianqianView;

/**
 * 个人便签 Dao 接口
 *
 * @author 
 */
public interface GerenbianqianDao extends BaseMapper<GerenbianqianEntity> {

   List<GerenbianqianView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
