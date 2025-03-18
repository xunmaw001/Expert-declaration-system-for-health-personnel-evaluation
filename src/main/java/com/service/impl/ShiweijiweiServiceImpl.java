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


import com.dao.ShiweijiweiDao;
import com.entity.ShiweijiweiEntity;
import com.service.ShiweijiweiService;
import com.entity.vo.ShiweijiweiVO;
import com.entity.view.ShiweijiweiView;

@Service("shiweijiweiService")
public class ShiweijiweiServiceImpl extends ServiceImpl<ShiweijiweiDao, ShiweijiweiEntity> implements ShiweijiweiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiweijiweiEntity> page = this.selectPage(
                new Query<ShiweijiweiEntity>(params).getPage(),
                new EntityWrapper<ShiweijiweiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiweijiweiEntity> wrapper) {
		  Page<ShiweijiweiView> page =new Query<ShiweijiweiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiweijiweiVO> selectListVO(Wrapper<ShiweijiweiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiweijiweiVO selectVO(Wrapper<ShiweijiweiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiweijiweiView> selectListView(Wrapper<ShiweijiweiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiweijiweiView selectView(Wrapper<ShiweijiweiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
