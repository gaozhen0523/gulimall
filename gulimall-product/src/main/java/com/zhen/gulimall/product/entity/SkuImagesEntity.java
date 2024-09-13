package com.zhen.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * skuÍ¼Æ¬
 * 
 * @author zhengao
 * @email gaozhen0516@gmail.com
 * @date 2024-09-13 14:38:41
 */
@Data
@TableName("pms_sku_images")
public class SkuImagesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * Í¼Æ¬µØÖ·
	 */
	private String imgUrl;
	/**
	 * ÅÅÐò
	 */
	private Integer imgSort;
	/**
	 * Ä¬ÈÏÍ¼[0 - ²»ÊÇÄ¬ÈÏÍ¼£¬1 - ÊÇÄ¬ÈÏÍ¼]
	 */
	private Integer defaultImg;

}
