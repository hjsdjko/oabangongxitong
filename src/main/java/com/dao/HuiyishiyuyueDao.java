package com.dao;

import com.entity.HuiyishiyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyishiyuyueView;

/**
 * 会议室预约 Dao 接口
 *
 * @author 
 */
public interface HuiyishiyuyueDao extends BaseMapper<HuiyishiyuyueEntity> {

   List<HuiyishiyuyueView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
