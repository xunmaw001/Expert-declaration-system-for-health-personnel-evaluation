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


import com.dao.ShenbaoshenheDao;
import com.entity.ShenbaoshenheEntity;
import com.service.ShenbaoshenheService;
import com.entity.vo.ShenbaoshenheVO;
import com.entity.view.ShenbaoshenheView;

@Service("shenbaoshenheService")
public class ShenbaoshenheServiceImpl extends ServiceImpl<ShenbaoshenheDao, ShenbaoshenheEntity> implements ShenbaoshenheService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenbaoshenheEntity> page = this.selectPage(
                new Query<ShenbaoshenheEntity>(params).getPage(),
                new EntityWrapper<ShenbaoshenheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenbaoshenheEntity> wrapper) {
		  Page<ShenbaoshenheView> page =new Query<ShenbaoshenheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenbaoshenheVO> selectListVO(Wrapper<ShenbaoshenheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenbaoshenheVO selectVO(Wrapper<ShenbaoshenheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenbaoshenheView> selectListView(Wrapper<ShenbaoshenheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenbaoshenheView selectView(Wrapper<ShenbaoshenheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
