package com.zhen.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhen.common.utils.PageUtils;
import com.zhen.gulimall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * »áÔ±ÊÕ²ØµÄÉÌÆ·
 *
 * @author zhengao
 * @email gaozhen0516@gmail.com
 * @date 2024-09-16 20:44:34
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

