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


import com.dao.YishengzhuanjiaDao;
import com.entity.YishengzhuanjiaEntity;
import com.service.YishengzhuanjiaService;
import com.entity.vo.YishengzhuanjiaVO;
import com.entity.view.YishengzhuanjiaView;

@Service("yishengzhuanjiaService")
public class YishengzhuanjiaServiceImpl extends ServiceImpl<YishengzhuanjiaDao, YishengzhuanjiaEntity> implements YishengzhuanjiaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YishengzhuanjiaEntity> page = this.selectPage(
                new Query<YishengzhuanjiaEntity>(params).getPage(),
                new EntityWrapper<YishengzhuanjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YishengzhuanjiaEntity> wrapper) {
		  Page<YishengzhuanjiaView> page =new Query<YishengzhuanjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YishengzhuanjiaVO> selectListVO(Wrapper<YishengzhuanjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YishengzhuanjiaVO selectVO(Wrapper<YishengzhuanjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YishengzhuanjiaView> selectListView(Wrapper<YishengzhuanjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YishengzhuanjiaView selectView(Wrapper<YishengzhuanjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
