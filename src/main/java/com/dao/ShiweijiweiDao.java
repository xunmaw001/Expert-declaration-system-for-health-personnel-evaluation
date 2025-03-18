package com.dao;

import com.entity.ShiweijiweiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiweijiweiVO;
import com.entity.view.ShiweijiweiView;


/**
 * 市卫计委
 * 
 * @author 
 * @email 
 * @date 2021-02-07 23:45:45
 */
public interface ShiweijiweiDao extends BaseMapper<ShiweijiweiEntity> {
	
	List<ShiweijiweiVO> selectListVO(@Param("ew") Wrapper<ShiweijiweiEntity> wrapper);
	
	ShiweijiweiVO selectVO(@Param("ew") Wrapper<ShiweijiweiEntity> wrapper);
	
	List<ShiweijiweiView> selectListView(@Param("ew") Wrapper<ShiweijiweiEntity> wrapper);

	List<ShiweijiweiView> selectListView(Pagination page,@Param("ew") Wrapper<ShiweijiweiEntity> wrapper);
	
	ShiweijiweiView selectView(@Param("ew") Wrapper<ShiweijiweiEntity> wrapper);
	
}
