package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LiulantongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LiulantongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LiulantongjiView;


/**
 * 浏览统计
 *
 * @author 
 * @email 
 * @date 2022-03-10 19:34:55
 */
public interface LiulantongjiService extends IService<LiulantongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LiulantongjiVO> selectListVO(Wrapper<LiulantongjiEntity> wrapper);
   	
   	LiulantongjiVO selectVO(@Param("ew") Wrapper<LiulantongjiEntity> wrapper);
   	
   	List<LiulantongjiView> selectListView(Wrapper<LiulantongjiEntity> wrapper);
   	
   	LiulantongjiView selectView(@Param("ew") Wrapper<LiulantongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LiulantongjiEntity> wrapper);
   	

}

