package com.dao;

import com.entity.ShenbaoshenheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenbaoshenheVO;
import com.entity.view.ShenbaoshenheView;


/**
 * 申报审核
 * 
 * @author 
 * @email 
 * @date 2021-02-07 23:45:45
 */
public interface ShenbaoshenheDao extends BaseMapper<ShenbaoshenheEntity> {
	
	List<ShenbaoshenheVO> selectListVO(@Param("ew") Wrapper<ShenbaoshenheEntity> wrapper);
	
	ShenbaoshenheVO selectVO(@Param("ew") Wrapper<ShenbaoshenheEntity> wrapper);
	
	List<ShenbaoshenheView> selectListView(@Param("ew") Wrapper<ShenbaoshenheEntity> wrapper);

	List<ShenbaoshenheView> selectListView(Pagination page,@Param("ew") Wrapper<ShenbaoshenheEntity> wrapper);
	
	ShenbaoshenheView selectView(@Param("ew") Wrapper<ShenbaoshenheEntity> wrapper);
	
}
