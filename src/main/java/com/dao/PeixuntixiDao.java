package com.dao;

import com.entity.PeixuntixiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeixuntixiVO;
import com.entity.view.PeixuntixiView;


/**
 * 培训体系
 * 
 * @author 
 * @email 
 * @date 2022-04-20 17:40:05
 */
public interface PeixuntixiDao extends BaseMapper<PeixuntixiEntity> {
	
	List<PeixuntixiVO> selectListVO(@Param("ew") Wrapper<PeixuntixiEntity> wrapper);
	
	PeixuntixiVO selectVO(@Param("ew") Wrapper<PeixuntixiEntity> wrapper);
	
	List<PeixuntixiView> selectListView(@Param("ew") Wrapper<PeixuntixiEntity> wrapper);

	List<PeixuntixiView> selectListView(Pagination page,@Param("ew") Wrapper<PeixuntixiEntity> wrapper);
	
	PeixuntixiView selectView(@Param("ew") Wrapper<PeixuntixiEntity> wrapper);
	

}
