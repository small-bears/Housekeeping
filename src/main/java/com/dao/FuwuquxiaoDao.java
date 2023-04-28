package com.dao;

import com.entity.FuwuquxiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwuquxiaoVO;
import com.entity.view.FuwuquxiaoView;


/**
 * 服务取消
 * 
 * @author 
 * @email 
 * @date 2022-04-20 17:40:05
 */
public interface FuwuquxiaoDao extends BaseMapper<FuwuquxiaoEntity> {
	
	List<FuwuquxiaoVO> selectListVO(@Param("ew") Wrapper<FuwuquxiaoEntity> wrapper);
	
	FuwuquxiaoVO selectVO(@Param("ew") Wrapper<FuwuquxiaoEntity> wrapper);
	
	List<FuwuquxiaoView> selectListView(@Param("ew") Wrapper<FuwuquxiaoEntity> wrapper);

	List<FuwuquxiaoView> selectListView(Pagination page,@Param("ew") Wrapper<FuwuquxiaoEntity> wrapper);
	
	FuwuquxiaoView selectView(@Param("ew") Wrapper<FuwuquxiaoEntity> wrapper);
	

}
