package com.dao;

import com.entity.FuwufenpeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwufenpeiVO;
import com.entity.view.FuwufenpeiView;


/**
 * 服务分配
 * 
 * @author 
 * @email 
 * @date 2022-04-20 17:40:05
 */
public interface FuwufenpeiDao extends BaseMapper<FuwufenpeiEntity> {
	
	List<FuwufenpeiVO> selectListVO(@Param("ew") Wrapper<FuwufenpeiEntity> wrapper);
	
	FuwufenpeiVO selectVO(@Param("ew") Wrapper<FuwufenpeiEntity> wrapper);
	
	List<FuwufenpeiView> selectListView(@Param("ew") Wrapper<FuwufenpeiEntity> wrapper);

	List<FuwufenpeiView> selectListView(Pagination page,@Param("ew") Wrapper<FuwufenpeiEntity> wrapper);
	
	FuwufenpeiView selectView(@Param("ew") Wrapper<FuwufenpeiEntity> wrapper);
	

}
