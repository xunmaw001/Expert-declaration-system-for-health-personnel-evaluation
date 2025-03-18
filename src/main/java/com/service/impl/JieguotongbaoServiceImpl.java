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


import com.dao.JieguotongbaoDao;
import com.entity.JieguotongbaoEntity;
import com.service.JieguotongbaoService;
import com.entity.vo.JieguotongbaoVO;
import com.entity.view.JieguotongbaoView;

@Service("jieguotongbaoService")
public class JieguotongbaoServiceImpl extends ServiceImpl<JieguotongbaoDao, JieguotongbaoEntity> implements JieguotongbaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JieguotongbaoEntity> page = this.selectPage(
                new Query<JieguotongbaoEntity>(params).getPage(),
                new EntityWrapper<JieguotongbaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JieguotongbaoEntity> wrapper) {
		  Page<JieguotongbaoView> page =new Query<JieguotongbaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JieguotongbaoVO> selectListVO(Wrapper<JieguotongbaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JieguotongbaoVO selectVO(Wrapper<JieguotongbaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JieguotongbaoView> selectListView(Wrapper<JieguotongbaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JieguotongbaoView selectView(Wrapper<JieguotongbaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
