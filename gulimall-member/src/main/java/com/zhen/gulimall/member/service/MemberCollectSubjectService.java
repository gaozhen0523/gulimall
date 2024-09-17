package com.zhen.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhen.common.utils.PageUtils;
import com.zhen.gulimall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * »áÔ±ÊÕ²ØµÄ×¨Ìâ»î¶¯
 *
 * @author zhengao
 * @email gaozhen0516@gmail.com
 * @date 2024-09-16 20:44:34
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

