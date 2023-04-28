package com.entity.view;

import com.entity.FuwujinduEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 服务进度
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-20 17:40:05
 */
@TableName("fuwujindu")
public class FuwujinduView  extends FuwujinduEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FuwujinduView(){
	}
 
 	public FuwujinduView(FuwujinduEntity fuwujinduEntity){
 	try {
			BeanUtils.copyProperties(this, fuwujinduEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
