package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YishengzhuanjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YishengzhuanjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YishengzhuanjiaView;


/**
 * 医生专家
 *
 * @author 
 * @email 
 * @date 2021-02-07 23:45:45
 */
public interface YishengzhuanjiaService extends IService<YishengzhuanjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YishengzhuanjiaVO> selectListVO(Wrapper<YishengzhuanjiaEntity> wrapper);
   	
   	YishengzhuanjiaVO selectVO(@Param("ew") Wrapper<YishengzhuanjiaEntity> wrapper);
   	
   	List<YishengzhuanjiaView> selectListView(Wrapper<YishengzhuanjiaEntity> wrapper);
   	
   	YishengzhuanjiaView selectView(@Param("ew") Wrapper<YishengzhuanjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YishengzhuanjiaEntity> wrapper);
   	
}

