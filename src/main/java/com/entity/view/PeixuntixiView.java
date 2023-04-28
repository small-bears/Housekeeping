package com.entity.view;

import com.entity.PeixuntixiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 培训体系
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-20 17:40:05
 */
@TableName("peixuntixi")
public class PeixuntixiView  extends PeixuntixiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PeixuntixiView(){
	}
 
 	public PeixuntixiView(PeixuntixiEntity peixuntixiEntity){
 	try {
			BeanUtils.copyProperties(this, peixuntixiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
