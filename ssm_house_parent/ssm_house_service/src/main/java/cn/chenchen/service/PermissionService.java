package cn.chenchen.service;

import cn.chenchen.domain.Permission;

import java.util.List;

public interface PermissionService {
    public List<Permission> findAll() throws Exception;

    void save(Permission permission) throws Exception;
}
