package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenbaoshenheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenbaoshenheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenbaoshenheView;


/**
 * 申报审核
 *
 * @author 
 * @email 
 * @date 2021-02-07 23:45:45
 */
public interface ShenbaoshenheService extends IService<ShenbaoshenheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenbaoshenheVO> selectListVO(Wrapper<ShenbaoshenheEntity> wrapper);
   	
   	ShenbaoshenheVO selectVO(@Param("ew") Wrapper<ShenbaoshenheEntity> wrapper);
   	
   	List<ShenbaoshenheView> selectListView(Wrapper<ShenbaoshenheEntity> wrapper);
   	
   	ShenbaoshenheView selectView(@Param("ew") Wrapper<ShenbaoshenheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenbaoshenheEntity> wrapper);
   	
}

