package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FupinwuziEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FupinwuziVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FupinwuziView;


/**
 * 扶贫物资
 *
 * @author 
 * @email 
 * @date 2022-03-10 19:34:55
 */
public interface FupinwuziService extends IService<FupinwuziEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FupinwuziVO> selectListVO(Wrapper<FupinwuziEntity> wrapper);
   	
   	FupinwuziVO selectVO(@Param("ew") Wrapper<FupinwuziEntity> wrapper);
   	
   	List<FupinwuziView> selectListView(Wrapper<FupinwuziEntity> wrapper);
   	
   	FupinwuziView selectView(@Param("ew") Wrapper<FupinwuziEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FupinwuziEntity> wrapper);
   	

}

