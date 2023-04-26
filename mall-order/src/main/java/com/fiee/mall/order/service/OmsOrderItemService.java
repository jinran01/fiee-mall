package com.fiee.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fiee.common.utils.PageUtils;
import com.fiee.mall.order.entity.OmsOrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author Fiee
 * @email 260043270@qq.com
 * @date 2023-04-25 23:18:08
 */
public interface OmsOrderItemService extends IService<OmsOrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

