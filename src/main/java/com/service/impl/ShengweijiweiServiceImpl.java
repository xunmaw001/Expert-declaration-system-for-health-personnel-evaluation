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


import com.dao.ShengweijiweiDao;
import com.entity.ShengweijiweiEntity;
import com.service.ShengweijiweiService;
import com.entity.vo.ShengweijiweiVO;
import com.entity.view.ShengweijiweiView;

@Service("shengweijiweiService")
public class ShengweijiweiServiceImpl extends ServiceImpl<ShengweijiweiDao, ShengweijiweiEntity> implements ShengweijiweiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShengweijiweiEntity> page = this.selectPage(
                new Query<ShengweijiweiEntity>(params).getPage(),
                new EntityWrapper<ShengweijiweiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShengweijiweiEntity> wrapper) {
		  Page<ShengweijiweiView> page =new Query<ShengweijiweiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShengweijiweiVO> selectListVO(Wrapper<ShengweijiweiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShengweijiweiVO selectVO(Wrapper<ShengweijiweiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShengweijiweiView> selectListView(Wrapper<ShengweijiweiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShengweijiweiView selectView(Wrapper<ShengweijiweiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
