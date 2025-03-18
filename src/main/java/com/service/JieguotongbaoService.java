package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JieguotongbaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JieguotongbaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JieguotongbaoView;


/**
 * 结果通报
 *
 * @author 
 * @email 
 * @date 2021-02-07 23:45:45
 */
public interface JieguotongbaoService extends IService<JieguotongbaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JieguotongbaoVO> selectListVO(Wrapper<JieguotongbaoEntity> wrapper);
   	
   	JieguotongbaoVO selectVO(@Param("ew") Wrapper<JieguotongbaoEntity> wrapper);
   	
   	List<JieguotongbaoView> selectListView(Wrapper<JieguotongbaoEntity> wrapper);
   	
   	JieguotongbaoView selectView(@Param("ew") Wrapper<JieguotongbaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JieguotongbaoEntity> wrapper);
   	
}

