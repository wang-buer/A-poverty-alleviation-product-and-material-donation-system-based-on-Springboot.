package com.entity.view;

import com.entity.DiscussfupinwuziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 扶贫物资评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-10 19:34:55
 */
@TableName("discussfupinwuzi")
public class DiscussfupinwuziView  extends DiscussfupinwuziEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussfupinwuziView(){
	}
 
 	public DiscussfupinwuziView(DiscussfupinwuziEntity discussfupinwuziEntity){
 	try {
			BeanUtils.copyProperties(this, discussfupinwuziEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
