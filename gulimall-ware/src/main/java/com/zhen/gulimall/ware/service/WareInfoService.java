package com.zhen.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhen.common.utils.PageUtils;
import com.zhen.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author zhengao
 * @email gaozhen0516@gmail.com
 * @date 2024-09-16 20:57:37
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

