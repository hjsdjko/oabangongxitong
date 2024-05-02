package com.dao;

import com.entity.WenjianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.WenjianView;

/**
 * 文件信息 Dao 接口
 *
 * @author 
 */
public interface WenjianDao extends BaseMapper<WenjianEntity> {

   List<WenjianView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
