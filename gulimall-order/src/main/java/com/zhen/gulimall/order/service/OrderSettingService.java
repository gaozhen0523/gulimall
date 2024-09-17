package com.zhen.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhen.common.utils.PageUtils;
import com.zhen.gulimall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * ¶©µ¥ÅäÖÃÐÅÏ¢
 *
 * @author zhengao
 * @email gaozhen0516@gmail.com
 * @date 2024-09-16 20:52:56
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

