package com.zhisan.fastboot.modules.sys.service.impl;

import com.zhisan.fastboot.modules.sys.entity.Role;
import com.zhisan.fastboot.modules.sys.mapper.RoleMapper;
import com.zhisan.fastboot.modules.sys.service.IRoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
