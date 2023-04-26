package com.fiee.mall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fiee.common.utils.PageUtils;
import com.fiee.common.utils.Query;

import com.fiee.mall.coupon.dao.SmsSpuBoundsDao;
import com.fiee.mall.coupon.entity.SmsSpuBoundsEntity;
import com.fiee.mall.coupon.service.SmsSpuBoundsService;


@Service("smsSpuBoundsService")
public class SmsSpuBoundsServiceImpl extends ServiceImpl<SmsSpuBoundsDao, SmsSpuBoundsEntity> implements SmsSpuBoundsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsSpuBoundsEntity> page = this.page(
                new Query<SmsSpuBoundsEntity>().getPage(params),
                new QueryWrapper<SmsSpuBoundsEntity>()
        );

        return new PageUtils(page);
    }

}