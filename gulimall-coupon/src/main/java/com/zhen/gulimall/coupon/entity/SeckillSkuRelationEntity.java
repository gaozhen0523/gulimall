package com.zhen.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ÃëÉ±»î¶¯ÉÌÆ·¹ØÁª
 * 
 * @author zhengao
 * @email gaozhen0516@gmail.com
 * @date 2024-09-16 20:35:32
 */
@Data
@TableName("sms_seckill_sku_relation")
public class SeckillSkuRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * »î¶¯id
	 */
	private Long promotionId;
	/**
	 * »î¶¯³¡´Îid
	 */
	private Long promotionSessionId;
	/**
	 * ÉÌÆ·id
	 */
	private Long skuId;
	/**
	 * ÃëÉ±¼Û¸ñ
	 */
	private BigDecimal seckillPrice;
	/**
	 * ÃëÉ±×ÜÁ¿
	 */
	private BigDecimal seckillCount;
	/**
	 * Ã¿ÈËÏÞ¹ºÊýÁ¿
	 */
	private BigDecimal seckillLimit;
	/**
	 * ÅÅÐò
	 */
	private Integer seckillSort;

}
