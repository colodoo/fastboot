package com.zhisan.fastboot.modules.sys.service.impl;

import com.zhisan.fastboot.modules.sys.entity.Org;
import com.zhisan.fastboot.modules.sys.mapper.OrgMapper;
import com.zhisan.fastboot.modules.sys.service.IOrgService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhisan
 * @since 2020-06-02
 */
@Service
public class OrgServiceImpl extends ServiceImpl<OrgMapper, Org> implements IOrgService {

}
