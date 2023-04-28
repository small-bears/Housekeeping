package com.entity.vo;

import com.entity.PeixuntixiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 培训体系
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-20 17:40:05
 */
public class PeixuntixiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 培训图片
	 */
	
	private String peixuntupian;
		
	/**
	 * 基本流程
	 */
	
	private String jibenliucheng;
		
	/**
	 * 师资力量
	 */
	
	private String shizililiang;
		
	/**
	 * 联系人
	 */
	
	private String lianxiren;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 培训视频
	 */
	
	private String peixunshipin;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
	/**
	 * 设置：培训图片
	 */
	 
	public void setPeixuntupian(String peixuntupian) {
		this.peixuntupian = peixuntupian;
	}
	
	/**
	 * 获取：培训图片
	 */
	public String getPeixuntupian() {
		return peixuntupian;
	}
				
	
	/**
	 * 设置：基本流程
	 */
	 
	public void setJibenliucheng(String jibenliucheng) {
		this.jibenliucheng = jibenliucheng;
	}
	
	/**
	 * 获取：基本流程
	 */
	public String getJibenliucheng() {
		return jibenliucheng;
	}
				
	
	/**
	 * 设置：师资力量
	 */
	 
	public void setShizililiang(String shizililiang) {
		this.shizililiang = shizililiang;
	}
	
	/**
	 * 获取：师资力量
	 */
	public String getShizililiang() {
		return shizililiang;
	}
				
	
	/**
	 * 设置：联系人
	 */
	 
	public void setLianxiren(String lianxiren) {
		this.lianxiren = lianxiren;
	}
	
	/**
	 * 获取：联系人
	 */
	public String getLianxiren() {
		return lianxiren;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：培训视频
	 */
	 
	public void setPeixunshipin(String peixunshipin) {
		this.peixunshipin = peixunshipin;
	}
	
	/**
	 * 获取：培训视频
	 */
	public String getPeixunshipin() {
		return peixunshipin;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
			
}
