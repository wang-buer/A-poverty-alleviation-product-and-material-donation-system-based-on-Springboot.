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


import com.dao.FupinchanpinDao;
import com.entity.FupinchanpinEntity;
import com.service.FupinchanpinService;
import com.entity.vo.FupinchanpinVO;
import com.entity.view.FupinchanpinView;

@Service("fupinchanpinService")
public class FupinchanpinServiceImpl extends ServiceImpl<FupinchanpinDao, FupinchanpinEntity> implements FupinchanpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FupinchanpinEntity> page = this.selectPage(
                new Query<FupinchanpinEntity>(params).getPage(),
                new EntityWrapper<FupinchanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FupinchanpinEntity> wrapper) {
		  Page<FupinchanpinView> page =new Query<FupinchanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FupinchanpinVO> selectListVO(Wrapper<FupinchanpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FupinchanpinVO selectVO(Wrapper<FupinchanpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FupinchanpinView> selectListView(Wrapper<FupinchanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FupinchanpinView selectView(Wrapper<FupinchanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
