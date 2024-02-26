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


import com.dao.DiscussfupinchanpinDao;
import com.entity.DiscussfupinchanpinEntity;
import com.service.DiscussfupinchanpinService;
import com.entity.vo.DiscussfupinchanpinVO;
import com.entity.view.DiscussfupinchanpinView;

@Service("discussfupinchanpinService")
public class DiscussfupinchanpinServiceImpl extends ServiceImpl<DiscussfupinchanpinDao, DiscussfupinchanpinEntity> implements DiscussfupinchanpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfupinchanpinEntity> page = this.selectPage(
                new Query<DiscussfupinchanpinEntity>(params).getPage(),
                new EntityWrapper<DiscussfupinchanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfupinchanpinEntity> wrapper) {
		  Page<DiscussfupinchanpinView> page =new Query<DiscussfupinchanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfupinchanpinVO> selectListVO(Wrapper<DiscussfupinchanpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfupinchanpinVO selectVO(Wrapper<DiscussfupinchanpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfupinchanpinView> selectListView(Wrapper<DiscussfupinchanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfupinchanpinView selectView(Wrapper<DiscussfupinchanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
