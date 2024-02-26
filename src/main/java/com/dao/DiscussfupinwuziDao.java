package com.dao;

import com.entity.DiscussfupinwuziEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfupinwuziVO;
import com.entity.view.DiscussfupinwuziView;


/**
 * 扶贫物资评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-10 19:34:55
 */
public interface DiscussfupinwuziDao extends BaseMapper<DiscussfupinwuziEntity> {
	
	List<DiscussfupinwuziVO> selectListVO(@Param("ew") Wrapper<DiscussfupinwuziEntity> wrapper);
	
	DiscussfupinwuziVO selectVO(@Param("ew") Wrapper<DiscussfupinwuziEntity> wrapper);
	
	List<DiscussfupinwuziView> selectListView(@Param("ew") Wrapper<DiscussfupinwuziEntity> wrapper);

	List<DiscussfupinwuziView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfupinwuziEntity> wrapper);
	
	DiscussfupinwuziView selectView(@Param("ew") Wrapper<DiscussfupinwuziEntity> wrapper);
	

}
