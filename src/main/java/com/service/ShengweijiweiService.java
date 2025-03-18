package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShengweijiweiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShengweijiweiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShengweijiweiView;


/**
 * 省卫计委
 *
 * @author 
 * @email 
 * @date 2021-02-07 23:45:45
 */
public interface ShengweijiweiService extends IService<ShengweijiweiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShengweijiweiVO> selectListVO(Wrapper<ShengweijiweiEntity> wrapper);
   	
   	ShengweijiweiVO selectVO(@Param("ew") Wrapper<ShengweijiweiEntity> wrapper);
   	
   	List<ShengweijiweiView> selectListView(Wrapper<ShengweijiweiEntity> wrapper);
   	
   	ShengweijiweiView selectView(@Param("ew") Wrapper<ShengweijiweiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShengweijiweiEntity> wrapper);
   	
}

