package com.entity.view;

import com.entity.ShiweijiweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 市卫计委
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-07 23:45:45
 */
@TableName("shiweijiwei")
public class ShiweijiweiView  extends ShiweijiweiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiweijiweiView(){
	}
 
 	public ShiweijiweiView(ShiweijiweiEntity shiweijiweiEntity){
 	try {
			BeanUtils.copyProperties(this, shiweijiweiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
