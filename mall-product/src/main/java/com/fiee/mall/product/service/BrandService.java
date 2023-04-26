package com.fiee.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fiee.common.utils.PageUtils;
import com.fiee.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author Fiee
 * @email 260043270@qq.com
 * @date 2023-04-25 23:02:32
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

