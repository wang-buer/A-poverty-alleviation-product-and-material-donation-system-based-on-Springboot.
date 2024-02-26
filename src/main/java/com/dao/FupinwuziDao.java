package com.dao;

import com.entity.FupinwuziEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FupinwuziVO;
import com.entity.view.FupinwuziView;


/**
 * 扶贫物资
 * 
 * @author 
 * @email 
 * @date 2022-03-10 19:34:55
 */
public interface FupinwuziDao extends BaseMapper<FupinwuziEntity> {
	
	List<FupinwuziVO> selectListVO(@Param("ew") Wrapper<FupinwuziEntity> wrapper);
	
	FupinwuziVO selectVO(@Param("ew") Wrapper<FupinwuziEntity> wrapper);
	
	List<FupinwuziView> selectListView(@Param("ew") Wrapper<FupinwuziEntity> wrapper);

	List<FupinwuziView> selectListView(Pagination page,@Param("ew") Wrapper<FupinwuziEntity> wrapper);
	
	FupinwuziView selectView(@Param("ew") Wrapper<FupinwuziEntity> wrapper);
	

}
