package com.fiee.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fiee.common.utils.PageUtils;
import com.fiee.mall.coupon.entity.SmsCouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author Fiee
 * @email 260043270@qq.com
 * @date 2023-04-25 23:16:05
 */
public interface SmsCouponSpuRelationService extends IService<SmsCouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

