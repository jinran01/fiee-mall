package com.fiee.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fiee.common.utils.PageUtils;
import com.fiee.mall.order.entity.OmsOrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author Fiee
 * @email 260043270@qq.com
 * @date 2023-04-25 23:18:08
 */
public interface OmsOrderSettingService extends IService<OmsOrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

