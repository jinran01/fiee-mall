package com.fiee.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fiee.common.utils.PageUtils;
import com.fiee.mall.ware.entity.WmsWareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author Fiee
 * @email 260043270@qq.com
 * @date 2023-04-25 23:20:22
 */
public interface WmsWareOrderTaskDetailService extends IService<WmsWareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

