package com.entity.view;

import com.entity.StoreupEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 收藏表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-20 17:40:05
 */
@TableName("storeup")
public class StoreupView  extends StoreupEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public StoreupView(){
	}
 
 	public StoreupView(StoreupEntity storeupEntity){
 	try {
			BeanUtils.copyProperties(this, storeupEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
