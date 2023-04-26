package com.fiee.mall.member.feign;

import com.fiee.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Fiee
 * @ClassName: CouponFeignService
 * @Date: 2023/4/26
 * @Version: v1.0.0
 **/

@FeignClient("mall-coupon")
@Component
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    R memberCoupons();
}
