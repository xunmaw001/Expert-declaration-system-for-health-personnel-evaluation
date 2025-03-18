package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZizhushenbaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZizhushenbaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZizhushenbaoView;


/**
 * 自主申报
 *
 * @author 
 * @email 
 * @date 2021-02-07 23:45:45
 */
public interface ZizhushenbaoService extends IService<ZizhushenbaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZizhushenbaoVO> selectListVO(Wrapper<ZizhushenbaoEntity> wrapper);
   	
   	ZizhushenbaoVO selectVO(@Param("ew") Wrapper<ZizhushenbaoEntity> wrapper);
   	
   	List<ZizhushenbaoView> selectListView(Wrapper<ZizhushenbaoEntity> wrapper);
   	
   	ZizhushenbaoView selectView(@Param("ew") Wrapper<ZizhushenbaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZizhushenbaoEntity> wrapper);
   	
}

