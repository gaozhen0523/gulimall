package com.zhen.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhen.common.utils.PageUtils;
import com.zhen.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spuÐÅÏ¢½éÉÜ
 *
 * @author zhengao
 * @email gaozhen0516@gmail.com
 * @date 2024-09-13 14:38:41
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

