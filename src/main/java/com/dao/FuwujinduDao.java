package com.dao;

import com.entity.FuwujinduEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwujinduVO;
import com.entity.view.FuwujinduView;


/**
 * 服务进度
 * 
 * @author 
 * @email 
 * @date 2022-04-20 17:40:05
 */
public interface FuwujinduDao extends BaseMapper<FuwujinduEntity> {
	
	List<FuwujinduVO> selectListVO(@Param("ew") Wrapper<FuwujinduEntity> wrapper);
	
	FuwujinduVO selectVO(@Param("ew") Wrapper<FuwujinduEntity> wrapper);
	
	List<FuwujinduView> selectListView(@Param("ew") Wrapper<FuwujinduEntity> wrapper);

	List<FuwujinduView> selectListView(Pagination page,@Param("ew") Wrapper<FuwujinduEntity> wrapper);
	
	FuwujinduView selectView(@Param("ew") Wrapper<FuwujinduEntity> wrapper);
	

}
