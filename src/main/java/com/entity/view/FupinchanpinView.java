package com.entity.view;

import com.entity.FupinchanpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 扶贫产品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-10 19:34:55
 */
@TableName("fupinchanpin")
public class FupinchanpinView  extends FupinchanpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FupinchanpinView(){
	}
 
 	public FupinchanpinView(FupinchanpinEntity fupinchanpinEntity){
 	try {
			BeanUtils.copyProperties(this, fupinchanpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
