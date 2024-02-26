package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FupinxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FupinxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FupinxiangmuView;


/**
 * 扶贫项目
 *
 * @author 
 * @email 
 * @date 2022-03-10 19:34:55
 */
public interface FupinxiangmuService extends IService<FupinxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FupinxiangmuVO> selectListVO(Wrapper<FupinxiangmuEntity> wrapper);
   	
   	FupinxiangmuVO selectVO(@Param("ew") Wrapper<FupinxiangmuEntity> wrapper);
   	
   	List<FupinxiangmuView> selectListView(Wrapper<FupinxiangmuEntity> wrapper);
   	
   	FupinxiangmuView selectView(@Param("ew") Wrapper<FupinxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FupinxiangmuEntity> wrapper);
   	

}

