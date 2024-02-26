package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfupinwuziEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfupinwuziVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfupinwuziView;


/**
 * 扶贫物资评论表
 *
 * @author 
 * @email 
 * @date 2022-03-10 19:34:55
 */
public interface DiscussfupinwuziService extends IService<DiscussfupinwuziEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfupinwuziVO> selectListVO(Wrapper<DiscussfupinwuziEntity> wrapper);
   	
   	DiscussfupinwuziVO selectVO(@Param("ew") Wrapper<DiscussfupinwuziEntity> wrapper);
   	
   	List<DiscussfupinwuziView> selectListView(Wrapper<DiscussfupinwuziEntity> wrapper);
   	
   	DiscussfupinwuziView selectView(@Param("ew") Wrapper<DiscussfupinwuziEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfupinwuziEntity> wrapper);
   	

}

