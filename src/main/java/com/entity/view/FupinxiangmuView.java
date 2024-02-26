package com.entity.view;

import com.entity.FupinxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 扶贫项目
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-10 19:34:55
 */
@TableName("fupinxiangmu")
public class FupinxiangmuView  extends FupinxiangmuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FupinxiangmuView(){
	}
 
 	public FupinxiangmuView(FupinxiangmuEntity fupinxiangmuEntity){
 	try {
			BeanUtils.copyProperties(this, fupinxiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
