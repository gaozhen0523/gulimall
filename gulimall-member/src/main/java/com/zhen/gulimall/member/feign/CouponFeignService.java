package com.zhen.gulimall.member.feign;

import com.zhen.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: CouponFeignService
 * Package: com.zhen.gulimall.member.feign
 * Description:
 *
 * @Author Zhen
 * @Create 9/16/2024 9:51 PM
 * @Version 1.0
 */

@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
