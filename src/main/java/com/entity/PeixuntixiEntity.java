package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 培训体系
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-20 17:40:05
 */
@TableName("peixuntixi")
public class PeixuntixiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PeixuntixiEntity() {
		
	}
	
	public PeixuntixiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 培训名称
	 */
					
	private String peixunmingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：培训名称
	 */
	public void setPeixunmingcheng(String peixunmingcheng) {
		this.peixunmingcheng = peixunmingcheng;
	}
	/**
	 * 获取：培训名称
	 */
	public String getPeixunmingcheng() {
		return peixunmingcheng;
	}
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
