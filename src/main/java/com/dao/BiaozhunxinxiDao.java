package com.dao;

import com.entity.BiaozhunxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BiaozhunxinxiVO;
import com.entity.view.BiaozhunxinxiView;


/**
 * 标准信息
 * 
 * @author 
 * @email 
 * @date 2021-02-07 23:45:45
 */
public interface BiaozhunxinxiDao extends BaseMapper<BiaozhunxinxiEntity> {
	
	List<BiaozhunxinxiVO> selectListVO(@Param("ew") Wrapper<BiaozhunxinxiEntity> wrapper);
	
	BiaozhunxinxiVO selectVO(@Param("ew") Wrapper<BiaozhunxinxiEntity> wrapper);
	
	List<BiaozhunxinxiView> selectListView(@Param("ew") Wrapper<BiaozhunxinxiEntity> wrapper);

	List<BiaozhunxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BiaozhunxinxiEntity> wrapper);
	
	BiaozhunxinxiView selectView(@Param("ew") Wrapper<BiaozhunxinxiEntity> wrapper);
	
}
