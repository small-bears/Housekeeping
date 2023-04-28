package com.dao;

import com.entity.FuwuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwuxinxiVO;
import com.entity.view.FuwuxinxiView;


/**
 * 服务信息
 * 
 * @author 
 * @email 
 * @date 2022-04-20 17:40:05
 */
public interface FuwuxinxiDao extends BaseMapper<FuwuxinxiEntity> {
	
	List<FuwuxinxiVO> selectListVO(@Param("ew") Wrapper<FuwuxinxiEntity> wrapper);
	
	FuwuxinxiVO selectVO(@Param("ew") Wrapper<FuwuxinxiEntity> wrapper);
	
	List<FuwuxinxiView> selectListView(@Param("ew") Wrapper<FuwuxinxiEntity> wrapper);

	List<FuwuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<FuwuxinxiEntity> wrapper);
	
	FuwuxinxiView selectView(@Param("ew") Wrapper<FuwuxinxiEntity> wrapper);
	

}
