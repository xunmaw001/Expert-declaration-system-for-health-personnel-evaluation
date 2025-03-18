package com.entity.vo;

import com.entity.BiaozhunxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 标准信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-02-07 23:45:45
 */
public class BiaozhunxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 适用范围
	 */
	
	private String shiyongfanwei;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 标准文件
	 */
	
	private String biaozhunwenjian;
		
	/**
	 * 视频
	 */
	
	private String shipin;
		
	/**
	 * 标准流程
	 */
	
	private String biaozhunliucheng;
		
	/**
	 * 申报条件
	 */
	
	private String shenbaotiaojian;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 省卫账号
	 */
	
	private String shengweizhanghao;
		
	/**
	 * 昵称
	 */
	
	private String nicheng;
				
	
	/**
	 * 设置：适用范围
	 */
	 
	public void setShiyongfanwei(String shiyongfanwei) {
		this.shiyongfanwei = shiyongfanwei;
	}
	
	/**
	 * 获取：适用范围
	 */
	public String getShiyongfanwei() {
		return shiyongfanwei;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：标准文件
	 */
	 
	public void setBiaozhunwenjian(String biaozhunwenjian) {
		this.biaozhunwenjian = biaozhunwenjian;
	}
	
	/**
	 * 获取：标准文件
	 */
	public String getBiaozhunwenjian() {
		return biaozhunwenjian;
	}
				
	
	/**
	 * 设置：视频
	 */
	 
	public void setShipin(String shipin) {
		this.shipin = shipin;
	}
	
	/**
	 * 获取：视频
	 */
	public String getShipin() {
		return shipin;
	}
				
	
	/**
	 * 设置：标准流程
	 */
	 
	public void setBiaozhunliucheng(String biaozhunliucheng) {
		this.biaozhunliucheng = biaozhunliucheng;
	}
	
	/**
	 * 获取：标准流程
	 */
	public String getBiaozhunliucheng() {
		return biaozhunliucheng;
	}
				
	
	/**
	 * 设置：申报条件
	 */
	 
	public void setShenbaotiaojian(String shenbaotiaojian) {
		this.shenbaotiaojian = shenbaotiaojian;
	}
	
	/**
	 * 获取：申报条件
	 */
	public String getShenbaotiaojian() {
		return shenbaotiaojian;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：省卫账号
	 */
	 
	public void setShengweizhanghao(String shengweizhanghao) {
		this.shengweizhanghao = shengweizhanghao;
	}
	
	/**
	 * 获取：省卫账号
	 */
	public String getShengweizhanghao() {
		return shengweizhanghao;
	}
				
	
	/**
	 * 设置：昵称
	 */
	 
	public void setNicheng(String nicheng) {
		this.nicheng = nicheng;
	}
	
	/**
	 * 获取：昵称
	 */
	public String getNicheng() {
		return nicheng;
	}
			
}
