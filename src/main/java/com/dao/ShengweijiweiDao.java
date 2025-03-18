package com.dao;

import com.entity.ShengweijiweiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShengweijiweiVO;
import com.entity.view.ShengweijiweiView;


/**
 * 省卫计委
 * 
 * @author 
 * @email 
 * @date 2021-02-07 23:45:45
 */
public interface ShengweijiweiDao extends BaseMapper<ShengweijiweiEntity> {
	
	List<ShengweijiweiVO> selectListVO(@Param("ew") Wrapper<ShengweijiweiEntity> wrapper);
	
	ShengweijiweiVO selectVO(@Param("ew") Wrapper<ShengweijiweiEntity> wrapper);
	
	List<ShengweijiweiView> selectListView(@Param("ew") Wrapper<ShengweijiweiEntity> wrapper);

	List<ShengweijiweiView> selectListView(Pagination page,@Param("ew") Wrapper<ShengweijiweiEntity> wrapper);
	
	ShengweijiweiView selectView(@Param("ew") Wrapper<ShengweijiweiEntity> wrapper);
	
}
