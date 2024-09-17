package com.zhen.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhen.common.utils.PageUtils;
import com.zhen.gulimall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * »áÔ±µÇÂ¼¼ÇÂ¼
 *
 * @author zhengao
 * @email gaozhen0516@gmail.com
 * @date 2024-09-16 20:44:34
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

