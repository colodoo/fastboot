package com.zhisan.fastboot.modules.sys.service.impl;

import com.zhisan.fastboot.modules.sys.entity.Config;
import com.zhisan.fastboot.modules.sys.mapper.ConfigMapper;
import com.zhisan.fastboot.modules.sys.service.IConfigService;
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
public class ConfigServiceImpl extends ServiceImpl<ConfigMapper, Config> implements IConfigService {

}
