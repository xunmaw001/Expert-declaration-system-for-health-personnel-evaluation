package com.dao;

import com.entity.YishengzhuanjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YishengzhuanjiaVO;
import com.entity.view.YishengzhuanjiaView;


/**
 * 医生专家
 * 
 * @author 
 * @email 
 * @date 2021-02-07 23:45:45
 */
public interface YishengzhuanjiaDao extends BaseMapper<YishengzhuanjiaEntity> {
	
	List<YishengzhuanjiaVO> selectListVO(@Param("ew") Wrapper<YishengzhuanjiaEntity> wrapper);
	
	YishengzhuanjiaVO selectVO(@Param("ew") Wrapper<YishengzhuanjiaEntity> wrapper);
	
	List<YishengzhuanjiaView> selectListView(@Param("ew") Wrapper<YishengzhuanjiaEntity> wrapper);

	List<YishengzhuanjiaView> selectListView(Pagination page,@Param("ew") Wrapper<YishengzhuanjiaEntity> wrapper);
	
	YishengzhuanjiaView selectView(@Param("ew") Wrapper<YishengzhuanjiaEntity> wrapper);
	
}
