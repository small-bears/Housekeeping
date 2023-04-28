package com.entity.view;

import com.entity.FuwufenpeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 服务分配
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-20 17:40:05
 */
@TableName("fuwufenpei")
public class FuwufenpeiView  extends FuwufenpeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FuwufenpeiView(){
	}
 
 	public FuwufenpeiView(FuwufenpeiEntity fuwufenpeiEntity){
 	try {
			BeanUtils.copyProperties(this, fuwufenpeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
