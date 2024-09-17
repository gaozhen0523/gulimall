package com.zhen.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ÓÅ»ÝÈ¯·ÖÀà¹ØÁª
 * 
 * @author zhengao
 * @email gaozhen0516@gmail.com
 * @date 2024-09-16 20:35:32
 */
@Data
@TableName("sms_coupon_spu_category_relation")
public class CouponSpuCategoryRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ÓÅ»ÝÈ¯id
	 */
	private Long couponId;
	/**
	 * ²úÆ··ÖÀàid
	 */
	private Long categoryId;
	/**
	 * ²úÆ··ÖÀàÃû³Æ
	 */
	private String categoryName;

}
