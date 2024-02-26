package com.dao;

import com.entity.DiscussfupinchanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfupinchanpinVO;
import com.entity.view.DiscussfupinchanpinView;


/**
 * 扶贫产品评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-10 19:34:55
 */
public interface DiscussfupinchanpinDao extends BaseMapper<DiscussfupinchanpinEntity> {
	
	List<DiscussfupinchanpinVO> selectListVO(@Param("ew") Wrapper<DiscussfupinchanpinEntity> wrapper);
	
	DiscussfupinchanpinVO selectVO(@Param("ew") Wrapper<DiscussfupinchanpinEntity> wrapper);
	
	List<DiscussfupinchanpinView> selectListView(@Param("ew") Wrapper<DiscussfupinchanpinEntity> wrapper);

	List<DiscussfupinchanpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfupinchanpinEntity> wrapper);
	
	DiscussfupinchanpinView selectView(@Param("ew") Wrapper<DiscussfupinchanpinEntity> wrapper);
	

}
