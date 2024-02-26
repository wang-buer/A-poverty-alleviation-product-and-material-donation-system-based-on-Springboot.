package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfupinxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfupinxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfupinxiangmuView;


/**
 * 扶贫项目评论表
 *
 * @author 
 * @email 
 * @date 2022-03-10 19:34:55
 */
public interface DiscussfupinxiangmuService extends IService<DiscussfupinxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfupinxiangmuVO> selectListVO(Wrapper<DiscussfupinxiangmuEntity> wrapper);
   	
   	DiscussfupinxiangmuVO selectVO(@Param("ew") Wrapper<DiscussfupinxiangmuEntity> wrapper);
   	
   	List<DiscussfupinxiangmuView> selectListView(Wrapper<DiscussfupinxiangmuEntity> wrapper);
   	
   	DiscussfupinxiangmuView selectView(@Param("ew") Wrapper<DiscussfupinxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfupinxiangmuEntity> wrapper);
   	

}

