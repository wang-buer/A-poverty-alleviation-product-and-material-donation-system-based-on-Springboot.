package com.dao;

import com.entity.FupinxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FupinxiangmuVO;
import com.entity.view.FupinxiangmuView;


/**
 * 扶贫项目
 * 
 * @author 
 * @email 
 * @date 2022-03-10 19:34:55
 */
public interface FupinxiangmuDao extends BaseMapper<FupinxiangmuEntity> {
	
	List<FupinxiangmuVO> selectListVO(@Param("ew") Wrapper<FupinxiangmuEntity> wrapper);
	
	FupinxiangmuVO selectVO(@Param("ew") Wrapper<FupinxiangmuEntity> wrapper);
	
	List<FupinxiangmuView> selectListView(@Param("ew") Wrapper<FupinxiangmuEntity> wrapper);

	List<FupinxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<FupinxiangmuEntity> wrapper);
	
	FupinxiangmuView selectView(@Param("ew") Wrapper<FupinxiangmuEntity> wrapper);
	

}
