package com.entity.view;

import com.entity.BiaozhunxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 标准信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-07 23:45:45
 */
@TableName("biaozhunxinxi")
public class BiaozhunxinxiView  extends BiaozhunxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BiaozhunxinxiView(){
	}
 
 	public BiaozhunxinxiView(BiaozhunxinxiEntity biaozhunxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, biaozhunxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
