package com.entity.vo;

import com.entity.ShenbaoshenheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 申报审核
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-02-07 23:45:45
 */
public class ShenbaoshenheVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 申请职称
	 */
	
	private String shenqingzhicheng;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 真实姓名
	 */
	
	private String zhenshixingming;
		
	/**
	 * 城市
	 */
	
	private String chengshi;
		
	/**
	 * 审核结果
	 */
	
	private String shenhejieguo;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 审核日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenheriqi;
				
	
	/**
	 * 设置：申请职称
	 */
	 
	public void setShenqingzhicheng(String shenqingzhicheng) {
		this.shenqingzhicheng = shenqingzhicheng;
	}
	
	/**
	 * 获取：申请职称
	 */
	public String getShenqingzhicheng() {
		return shenqingzhicheng;
	}
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
	/**
	 * 设置：真实姓名
	 */
	 
	public void setZhenshixingming(String zhenshixingming) {
		this.zhenshixingming = zhenshixingming;
	}
	
	/**
	 * 获取：真实姓名
	 */
	public String getZhenshixingming() {
		return zhenshixingming;
	}
				
	
	/**
	 * 设置：城市
	 */
	 
	public void setChengshi(String chengshi) {
		this.chengshi = chengshi;
	}
	
	/**
	 * 获取：城市
	 */
	public String getChengshi() {
		return chengshi;
	}
				
	
	/**
	 * 设置：审核结果
	 */
	 
	public void setShenhejieguo(String shenhejieguo) {
		this.shenhejieguo = shenhejieguo;
	}
	
	/**
	 * 获取：审核结果
	 */
	public String getShenhejieguo() {
		return shenhejieguo;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：审核日期
	 */
	 
	public void setShenheriqi(Date shenheriqi) {
		this.shenheriqi = shenheriqi;
	}
	
	/**
	 * 获取：审核日期
	 */
	public Date getShenheriqi() {
		return shenheriqi;
	}
			
}
