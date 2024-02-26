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


import com.dao.FupinwuziDao;
import com.entity.FupinwuziEntity;
import com.service.FupinwuziService;
import com.entity.vo.FupinwuziVO;
import com.entity.view.FupinwuziView;

@Service("fupinwuziService")
public class FupinwuziServiceImpl extends ServiceImpl<FupinwuziDao, FupinwuziEntity> implements FupinwuziService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FupinwuziEntity> page = this.selectPage(
                new Query<FupinwuziEntity>(params).getPage(),
                new EntityWrapper<FupinwuziEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FupinwuziEntity> wrapper) {
		  Page<FupinwuziView> page =new Query<FupinwuziView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FupinwuziVO> selectListVO(Wrapper<FupinwuziEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FupinwuziVO selectVO(Wrapper<FupinwuziEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FupinwuziView> selectListView(Wrapper<FupinwuziEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FupinwuziView selectView(Wrapper<FupinwuziEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
