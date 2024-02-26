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


import com.dao.DiscussfupinwuziDao;
import com.entity.DiscussfupinwuziEntity;
import com.service.DiscussfupinwuziService;
import com.entity.vo.DiscussfupinwuziVO;
import com.entity.view.DiscussfupinwuziView;

@Service("discussfupinwuziService")
public class DiscussfupinwuziServiceImpl extends ServiceImpl<DiscussfupinwuziDao, DiscussfupinwuziEntity> implements DiscussfupinwuziService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfupinwuziEntity> page = this.selectPage(
                new Query<DiscussfupinwuziEntity>(params).getPage(),
                new EntityWrapper<DiscussfupinwuziEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfupinwuziEntity> wrapper) {
		  Page<DiscussfupinwuziView> page =new Query<DiscussfupinwuziView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfupinwuziVO> selectListVO(Wrapper<DiscussfupinwuziEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfupinwuziVO selectVO(Wrapper<DiscussfupinwuziEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfupinwuziView> selectListView(Wrapper<DiscussfupinwuziEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfupinwuziView selectView(Wrapper<DiscussfupinwuziEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
