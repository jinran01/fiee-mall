package com.fiee.mall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fiee.common.utils.PageUtils;
import com.fiee.common.utils.Query;

import com.fiee.mall.member.dao.UmsMemberLoginLogDao;
import com.fiee.mall.member.entity.UmsMemberLoginLogEntity;
import com.fiee.mall.member.service.UmsMemberLoginLogService;


@Service("umsMemberLoginLogService")
public class UmsMemberLoginLogServiceImpl extends ServiceImpl<UmsMemberLoginLogDao, UmsMemberLoginLogEntity> implements UmsMemberLoginLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsMemberLoginLogEntity> page = this.page(
                new Query<UmsMemberLoginLogEntity>().getPage(params),
                new QueryWrapper<UmsMemberLoginLogEntity>()
        );

        return new PageUtils(page);
    }

}