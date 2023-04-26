package com.fiee.mall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fiee.common.utils.PageUtils;
import com.fiee.common.utils.Query;

import com.fiee.mall.coupon.dao.SmsHomeSubjectSpuDao;
import com.fiee.mall.coupon.entity.SmsHomeSubjectSpuEntity;
import com.fiee.mall.coupon.service.SmsHomeSubjectSpuService;


@Service("smsHomeSubjectSpuService")
public class SmsHomeSubjectSpuServiceImpl extends ServiceImpl<SmsHomeSubjectSpuDao, SmsHomeSubjectSpuEntity> implements SmsHomeSubjectSpuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsHomeSubjectSpuEntity> page = this.page(
                new Query<SmsHomeSubjectSpuEntity>().getPage(params),
                new QueryWrapper<SmsHomeSubjectSpuEntity>()
        );

        return new PageUtils(page);
    }

}