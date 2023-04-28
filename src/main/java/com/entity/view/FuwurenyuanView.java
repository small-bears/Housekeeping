package com.entity.view;

import com.entity.FuwurenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 服务人员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-20 17:40:05
 */
@TableName("fuwurenyuan")
public class FuwurenyuanView  extends FuwurenyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FuwurenyuanView(){
	}
 
 	public FuwurenyuanView(FuwurenyuanEntity fuwurenyuanEntity){
 	try {
			BeanUtils.copyProperties(this, fuwurenyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
