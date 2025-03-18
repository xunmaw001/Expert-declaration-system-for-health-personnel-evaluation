package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiweijiweiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiweijiweiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiweijiweiView;


/**
 * 市卫计委
 *
 * @author 
 * @email 
 * @date 2021-02-07 23:45:45
 */
public interface ShiweijiweiService extends IService<ShiweijiweiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiweijiweiVO> selectListVO(Wrapper<ShiweijiweiEntity> wrapper);
   	
   	ShiweijiweiVO selectVO(@Param("ew") Wrapper<ShiweijiweiEntity> wrapper);
   	
   	List<ShiweijiweiView> selectListView(Wrapper<ShiweijiweiEntity> wrapper);
   	
   	ShiweijiweiView selectView(@Param("ew") Wrapper<ShiweijiweiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiweijiweiEntity> wrapper);
   	
}

