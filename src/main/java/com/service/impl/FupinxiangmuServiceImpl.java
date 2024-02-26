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


import com.dao.FupinxiangmuDao;
import com.entity.FupinxiangmuEntity;
import com.service.FupinxiangmuService;
import com.entity.vo.FupinxiangmuVO;
import com.entity.view.FupinxiangmuView;

@Service("fupinxiangmuService")
public class FupinxiangmuServiceImpl extends ServiceImpl<FupinxiangmuDao, FupinxiangmuEntity> implements FupinxiangmuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FupinxiangmuEntity> page = this.selectPage(
                new Query<FupinxiangmuEntity>(params).getPage(),
                new EntityWrapper<FupinxiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FupinxiangmuEntity> wrapper) {
		  Page<FupinxiangmuView> page =new Query<FupinxiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FupinxiangmuVO> selectListVO(Wrapper<FupinxiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FupinxiangmuVO selectVO(Wrapper<FupinxiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FupinxiangmuView> selectListView(Wrapper<FupinxiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FupinxiangmuView selectView(Wrapper<FupinxiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
