package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfupinchanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfupinchanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfupinchanpinView;


/**
 * 扶贫产品评论表
 *
 * @author 
 * @email 
 * @date 2022-03-10 19:34:55
 */
public interface DiscussfupinchanpinService extends IService<DiscussfupinchanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfupinchanpinVO> selectListVO(Wrapper<DiscussfupinchanpinEntity> wrapper);
   	
   	DiscussfupinchanpinVO selectVO(@Param("ew") Wrapper<DiscussfupinchanpinEntity> wrapper);
   	
   	List<DiscussfupinchanpinView> selectListView(Wrapper<DiscussfupinchanpinEntity> wrapper);
   	
   	DiscussfupinchanpinView selectView(@Param("ew") Wrapper<DiscussfupinchanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfupinchanpinEntity> wrapper);
   	

}

