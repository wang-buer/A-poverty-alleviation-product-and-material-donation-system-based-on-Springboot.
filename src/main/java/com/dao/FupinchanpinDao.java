package com.dao;

import com.entity.FupinchanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FupinchanpinVO;
import com.entity.view.FupinchanpinView;


/**
 * 扶贫产品
 * 
 * @author 
 * @email 
 * @date 2022-03-10 19:34:55
 */
public interface FupinchanpinDao extends BaseMapper<FupinchanpinEntity> {
	
	List<FupinchanpinVO> selectListVO(@Param("ew") Wrapper<FupinchanpinEntity> wrapper);
	
	FupinchanpinVO selectVO(@Param("ew") Wrapper<FupinchanpinEntity> wrapper);
	
	List<FupinchanpinView> selectListView(@Param("ew") Wrapper<FupinchanpinEntity> wrapper);

	List<FupinchanpinView> selectListView(Pagination page,@Param("ew") Wrapper<FupinchanpinEntity> wrapper);
	
	FupinchanpinView selectView(@Param("ew") Wrapper<FupinchanpinEntity> wrapper);
	

}
