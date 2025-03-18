package com.dao;

import com.entity.ZizhushenbaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZizhushenbaoVO;
import com.entity.view.ZizhushenbaoView;


/**
 * 自主申报
 * 
 * @author 
 * @email 
 * @date 2021-02-07 23:45:45
 */
public interface ZizhushenbaoDao extends BaseMapper<ZizhushenbaoEntity> {
	
	List<ZizhushenbaoVO> selectListVO(@Param("ew") Wrapper<ZizhushenbaoEntity> wrapper);
	
	ZizhushenbaoVO selectVO(@Param("ew") Wrapper<ZizhushenbaoEntity> wrapper);
	
	List<ZizhushenbaoView> selectListView(@Param("ew") Wrapper<ZizhushenbaoEntity> wrapper);

	List<ZizhushenbaoView> selectListView(Pagination page,@Param("ew") Wrapper<ZizhushenbaoEntity> wrapper);
	
	ZizhushenbaoView selectView(@Param("ew") Wrapper<ZizhushenbaoEntity> wrapper);
	
}
