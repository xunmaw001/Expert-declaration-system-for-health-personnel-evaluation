package com.entity.view;

import com.entity.ShenbaoshenheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 申报审核
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-07 23:45:45
 */
@TableName("shenbaoshenhe")
public class ShenbaoshenheView  extends ShenbaoshenheEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShenbaoshenheView(){
	}
 
 	public ShenbaoshenheView(ShenbaoshenheEntity shenbaoshenheEntity){
 	try {
			BeanUtils.copyProperties(this, shenbaoshenheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
