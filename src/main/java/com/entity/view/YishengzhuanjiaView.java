package com.entity.view;

import com.entity.YishengzhuanjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 医生专家
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-07 23:45:45
 */
@TableName("yishengzhuanjia")
public class YishengzhuanjiaView  extends YishengzhuanjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YishengzhuanjiaView(){
	}
 
 	public YishengzhuanjiaView(YishengzhuanjiaEntity yishengzhuanjiaEntity){
 	try {
			BeanUtils.copyProperties(this, yishengzhuanjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
