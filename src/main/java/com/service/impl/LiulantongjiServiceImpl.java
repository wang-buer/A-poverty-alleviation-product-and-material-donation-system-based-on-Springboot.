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


import com.dao.LiulantongjiDao;
import com.entity.LiulantongjiEntity;
import com.service.LiulantongjiService;
import com.entity.vo.LiulantongjiVO;
import com.entity.view.LiulantongjiView;

@Service("liulantongjiService")
public class LiulantongjiServiceImpl extends ServiceImpl<LiulantongjiDao, LiulantongjiEntity> implements LiulantongjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LiulantongjiEntity> page = this.selectPage(
                new Query<LiulantongjiEntity>(params).getPage(),
                new EntityWrapper<LiulantongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LiulantongjiEntity> wrapper) {
		  Page<LiulantongjiView> page =new Query<LiulantongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LiulantongjiVO> selectListVO(Wrapper<LiulantongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LiulantongjiVO selectVO(Wrapper<LiulantongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LiulantongjiView> selectListView(Wrapper<LiulantongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LiulantongjiView selectView(Wrapper<LiulantongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
