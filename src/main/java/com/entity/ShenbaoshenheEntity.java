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
 * 申报审核
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-07 23:45:45
 */
@TableName("shenbaoshenhe")
public class ShenbaoshenheEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShenbaoshenheEntity() {
		
	}
	
	public ShenbaoshenheEntity(T t) {
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
	 * 名称
	 */
					
	private String mingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shenheriqi;
	
	
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
	 * 设置：名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
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
