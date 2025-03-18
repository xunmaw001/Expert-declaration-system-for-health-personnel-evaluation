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


import com.dao.BiaozhunxinxiDao;
import com.entity.BiaozhunxinxiEntity;
import com.service.BiaozhunxinxiService;
import com.entity.vo.BiaozhunxinxiVO;
import com.entity.view.BiaozhunxinxiView;

@Service("biaozhunxinxiService")
public class BiaozhunxinxiServiceImpl extends ServiceImpl<BiaozhunxinxiDao, BiaozhunxinxiEntity> implements BiaozhunxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BiaozhunxinxiEntity> page = this.selectPage(
                new Query<BiaozhunxinxiEntity>(params).getPage(),
                new EntityWrapper<BiaozhunxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BiaozhunxinxiEntity> wrapper) {
		  Page<BiaozhunxinxiView> page =new Query<BiaozhunxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BiaozhunxinxiVO> selectListVO(Wrapper<BiaozhunxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BiaozhunxinxiVO selectVO(Wrapper<BiaozhunxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BiaozhunxinxiView> selectListView(Wrapper<BiaozhunxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BiaozhunxinxiView selectView(Wrapper<BiaozhunxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
