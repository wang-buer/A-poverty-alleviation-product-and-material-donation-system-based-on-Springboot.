package com.dao;

import com.entity.LiulantongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LiulantongjiVO;
import com.entity.view.LiulantongjiView;


/**
 * 浏览统计
 * 
 * @author 
 * @email 
 * @date 2022-03-10 19:34:55
 */
public interface LiulantongjiDao extends BaseMapper<LiulantongjiEntity> {
	
	List<LiulantongjiVO> selectListVO(@Param("ew") Wrapper<LiulantongjiEntity> wrapper);
	
	LiulantongjiVO selectVO(@Param("ew") Wrapper<LiulantongjiEntity> wrapper);
	
	List<LiulantongjiView> selectListView(@Param("ew") Wrapper<LiulantongjiEntity> wrapper);

	List<LiulantongjiView> selectListView(Pagination page,@Param("ew") Wrapper<LiulantongjiEntity> wrapper);
	
	LiulantongjiView selectView(@Param("ew") Wrapper<LiulantongjiEntity> wrapper);
	

}
