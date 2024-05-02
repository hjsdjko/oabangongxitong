package com.dao;

import com.entity.HuiyishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyishiView;

/**
 * 会议室 Dao 接口
 *
 * @author 
 */
public interface HuiyishiDao extends BaseMapper<HuiyishiEntity> {

   List<HuiyishiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
