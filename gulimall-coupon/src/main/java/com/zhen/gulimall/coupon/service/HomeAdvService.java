package com.zhen.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhen.common.utils.PageUtils;
import com.zhen.gulimall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * Ê×Ò³ÂÖ²¥¹ã¸æ
 *
 * @author zhengao
 * @email gaozhen0516@gmail.com
 * @date 2024-09-16 20:35:32
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

