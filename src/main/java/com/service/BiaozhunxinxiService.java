package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BiaozhunxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BiaozhunxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BiaozhunxinxiView;


/**
 * 标准信息
 *
 * @author 
 * @email 
 * @date 2021-02-07 23:45:45
 */
public interface BiaozhunxinxiService extends IService<BiaozhunxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BiaozhunxinxiVO> selectListVO(Wrapper<BiaozhunxinxiEntity> wrapper);
   	
   	BiaozhunxinxiVO selectVO(@Param("ew") Wrapper<BiaozhunxinxiEntity> wrapper);
   	
   	List<BiaozhunxinxiView> selectListView(Wrapper<BiaozhunxinxiEntity> wrapper);
   	
   	BiaozhunxinxiView selectView(@Param("ew") Wrapper<BiaozhunxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BiaozhunxinxiEntity> wrapper);
   	
}

