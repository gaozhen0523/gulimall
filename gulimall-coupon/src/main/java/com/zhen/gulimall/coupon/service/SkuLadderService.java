package com.zhen.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhen.common.utils.PageUtils;
import com.zhen.gulimall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * ÉÌÆ·½×ÌÝ¼Û¸ñ
 *
 * @author zhengao
 * @email gaozhen0516@gmail.com
 * @date 2024-09-16 20:35:32
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

