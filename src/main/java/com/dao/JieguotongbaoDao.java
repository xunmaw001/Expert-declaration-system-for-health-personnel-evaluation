package com.dao;

import com.entity.JieguotongbaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JieguotongbaoVO;
import com.entity.view.JieguotongbaoView;


/**
 * 结果通报
 * 
 * @author 
 * @email 
 * @date 2021-02-07 23:45:45
 */
public interface JieguotongbaoDao extends BaseMapper<JieguotongbaoEntity> {
	
	List<JieguotongbaoVO> selectListVO(@Param("ew") Wrapper<JieguotongbaoEntity> wrapper);
	
	JieguotongbaoVO selectVO(@Param("ew") Wrapper<JieguotongbaoEntity> wrapper);
	
	List<JieguotongbaoView> selectListView(@Param("ew") Wrapper<JieguotongbaoEntity> wrapper);

	List<JieguotongbaoView> selectListView(Pagination page,@Param("ew") Wrapper<JieguotongbaoEntity> wrapper);
	
	JieguotongbaoView selectView(@Param("ew") Wrapper<JieguotongbaoEntity> wrapper);
	
}
