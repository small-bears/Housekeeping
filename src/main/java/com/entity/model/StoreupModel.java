package com.entity.model;

import com.entity.StoreupEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 收藏表
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-20 17:40:05
 */
public class StoreupModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 收藏id
	 */
	
	private Long refid;
		
	/**
	 * 表名
	 */
	
	private String tablename;
		
	/**
	 * 收藏名称
	 */
	
	private String name;
		
	/**
	 * 收藏图片
	 */
	
	private String picture;
		
	/**
	 * 类型(1:收藏,21:赞,22:踩)
	 */
	
	private String type;
		
	/**
	 * 推荐类型
	 */
	
	private String inteltype;
				
	
	/**
	 * 设置：收藏id
	 */
	 
	public void setRefid(Long refid) {
		this.refid = refid;
	}
	
	/**
	 * 获取：收藏id
	 */
	public Long getRefid() {
		return refid;
	}
				
	
	/**
	 * 设置：表名
	 */
	 
	public void setTablename(String tablename) {
		this.tablename = tablename;
	}
	
	/**
	 * 获取：表名
	 */
	public String getTablename() {
		return tablename;
	}
				
	
	/**
	 * 设置：收藏名称
	 */
	 
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 获取：收藏名称
	 */
	public String getName() {
		return name;
	}
				
	
	/**
	 * 设置：收藏图片
	 */
	 
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	/**
	 * 获取：收藏图片
	 */
	public String getPicture() {
		return picture;
	}
				
	
	/**
	 * 设置：类型(1:收藏,21:赞,22:踩)
	 */
	 
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * 获取：类型(1:收藏,21:赞,22:踩)
	 */
	public String getType() {
		return type;
	}
				
	
	/**
	 * 设置：推荐类型
	 */
	 
	public void setInteltype(String inteltype) {
		this.inteltype = inteltype;
	}
	
	/**
	 * 获取：推荐类型
	 */
	public String getInteltype() {
		return inteltype;
	}
			
}
