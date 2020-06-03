package com.zhisan.fastboot.modules.sys.service.impl;

import com.zhisan.fastboot.modules.sys.entity.User;
import com.zhisan.fastboot.modules.sys.mapper.UserMapper;
import com.zhisan.fastboot.modules.sys.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
