package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZizhushenbaoDao;
import com.entity.ZizhushenbaoEntity;
import com.service.ZizhushenbaoService;
import com.entity.vo.ZizhushenbaoVO;
import com.entity.view.ZizhushenbaoView;

@Service("zizhushenbaoService")
public class ZizhushenbaoServiceImpl extends ServiceImpl<ZizhushenbaoDao, ZizhushenbaoEntity> implements ZizhushenbaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZizhushenbaoEntity> page = this.selectPage(
                new Query<ZizhushenbaoEntity>(params).getPage(),
                new EntityWrapper<ZizhushenbaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZizhushenbaoEntity> wrapper) {
		  Page<ZizhushenbaoView> page =new Query<ZizhushenbaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZizhushenbaoVO> selectListVO(Wrapper<ZizhushenbaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZizhushenbaoVO selectVO(Wrapper<ZizhushenbaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZizhushenbaoView> selectListView(Wrapper<ZizhushenbaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZizhushenbaoView selectView(Wrapper<ZizhushenbaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
