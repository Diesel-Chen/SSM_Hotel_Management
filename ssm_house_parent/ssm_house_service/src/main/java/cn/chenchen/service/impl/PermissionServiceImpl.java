package cn.chenchen.service.impl;

import cn.chenchen.dao.PermissionDao;
import cn.chenchen.domain.Permission;
import cn.chenchen.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionDao permissionDao;

    @Override
    public void save(Permission permission) throws Exception{
        permissionDao.save(permission);
    }

    @Override
    public List<Permission> findAll() throws Exception{
        return permissionDao.findAll();
    }
}
