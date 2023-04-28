package com.dao;

import com.entity.FuwuleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwuleixingVO;
import com.entity.view.FuwuleixingView;


/**
 * 服务类型
 * 
 * @author 
 * @email 
 * @date 2022-04-20 17:40:05
 */
public interface FuwuleixingDao extends BaseMapper<FuwuleixingEntity> {
	
	List<FuwuleixingVO> selectListVO(@Param("ew") Wrapper<FuwuleixingEntity> wrapper);
	
	FuwuleixingVO selectVO(@Param("ew") Wrapper<FuwuleixingEntity> wrapper);
	
	List<FuwuleixingView> selectListView(@Param("ew") Wrapper<FuwuleixingEntity> wrapper);

	List<FuwuleixingView> selectListView(Pagination page,@Param("ew") Wrapper<FuwuleixingEntity> wrapper);
	
	FuwuleixingView selectView(@Param("ew") Wrapper<FuwuleixingEntity> wrapper);
	

}
