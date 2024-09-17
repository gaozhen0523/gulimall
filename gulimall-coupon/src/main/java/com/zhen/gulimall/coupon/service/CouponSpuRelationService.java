package com.zhen.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhen.common.utils.PageUtils;
import com.zhen.gulimall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * ÓÅ»ÝÈ¯Óë²úÆ·¹ØÁª
 *
 * @author zhengao
 * @email gaozhen0516@gmail.com
 * @date 2024-09-16 20:35:32
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

