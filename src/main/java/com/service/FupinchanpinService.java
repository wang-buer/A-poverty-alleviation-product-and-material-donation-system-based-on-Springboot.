package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FupinchanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FupinchanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FupinchanpinView;


/**
 * 扶贫产品
 *
 * @author 
 * @email 
 * @date 2022-03-10 19:34:55
 */
public interface FupinchanpinService extends IService<FupinchanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FupinchanpinVO> selectListVO(Wrapper<FupinchanpinEntity> wrapper);
   	
   	FupinchanpinVO selectVO(@Param("ew") Wrapper<FupinchanpinEntity> wrapper);
   	
   	List<FupinchanpinView> selectListView(Wrapper<FupinchanpinEntity> wrapper);
   	
   	FupinchanpinView selectView(@Param("ew") Wrapper<FupinchanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FupinchanpinEntity> wrapper);
   	

}

