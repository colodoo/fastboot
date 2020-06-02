package com.zhisan.fastboot.modules.sys.service.impl;

import com.zhisan.fastboot.modules.sys.entity.Log;
import com.zhisan.fastboot.modules.sys.mapper.LogMapper;
import com.zhisan.fastboot.modules.sys.service.ILogService;
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
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements ILogService {

}
