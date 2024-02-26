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


import com.dao.DiscussfupinxiangmuDao;
import com.entity.DiscussfupinxiangmuEntity;
import com.service.DiscussfupinxiangmuService;
import com.entity.vo.DiscussfupinxiangmuVO;
import com.entity.view.DiscussfupinxiangmuView;

@Service("discussfupinxiangmuService")
public class DiscussfupinxiangmuServiceImpl extends ServiceImpl<DiscussfupinxiangmuDao, DiscussfupinxiangmuEntity> implements DiscussfupinxiangmuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfupinxiangmuEntity> page = this.selectPage(
                new Query<DiscussfupinxiangmuEntity>(params).getPage(),
                new EntityWrapper<DiscussfupinxiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfupinxiangmuEntity> wrapper) {
		  Page<DiscussfupinxiangmuView> page =new Query<DiscussfupinxiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfupinxiangmuVO> selectListVO(Wrapper<DiscussfupinxiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfupinxiangmuVO selectVO(Wrapper<DiscussfupinxiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfupinxiangmuView> selectListView(Wrapper<DiscussfupinxiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfupinxiangmuView selectView(Wrapper<DiscussfupinxiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
