package com.dao;

import com.entity.ZaixianjuanzengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZaixianjuanzengVO;
import com.entity.view.ZaixianjuanzengView;


/**
 * 在线捐赠
 * 
 * @author 
 * @email 
 * @date 2022-03-10 19:34:55
 */
public interface ZaixianjuanzengDao extends BaseMapper<ZaixianjuanzengEntity> {
	
	List<ZaixianjuanzengVO> selectListVO(@Param("ew") Wrapper<ZaixianjuanzengEntity> wrapper);
	
	ZaixianjuanzengVO selectVO(@Param("ew") Wrapper<ZaixianjuanzengEntity> wrapper);
	
	List<ZaixianjuanzengView> selectListView(@Param("ew") Wrapper<ZaixianjuanzengEntity> wrapper);

	List<ZaixianjuanzengView> selectListView(Pagination page,@Param("ew") Wrapper<ZaixianjuanzengEntity> wrapper);
	
	ZaixianjuanzengView selectView(@Param("ew") Wrapper<ZaixianjuanzengEntity> wrapper);
	

}
