package com.zhen.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ÊôÐÔ·Ö×é
 * 
 * @author zhengao
 * @email gaozhen0516@gmail.com
 * @date 2024-09-13 14:38:41
 */
@Data
@TableName("pms_attr_group")
public class AttrGroupEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ·Ö×éid
	 */
	@TableId
	private Long attrGroupId;
	/**
	 * ×éÃû
	 */
	private String attrGroupName;
	/**
	 * ÅÅÐò
	 */
	private Integer sort;
	/**
	 * ÃèÊö
	 */
	private String descript;
	/**
	 * ×éÍ¼±ê
	 */
	private String icon;
	/**
	 * ËùÊô·ÖÀàid
	 */
	private Long catelogId;

}
