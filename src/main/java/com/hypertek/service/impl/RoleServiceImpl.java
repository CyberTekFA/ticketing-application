package com.hypertek.service.impl;

import com.hypertek.dto.RoleDto;
import com.hypertek.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    private final RoleService roleService;

    public RoleServiceImpl(RoleService roleService) {
        this.roleService = roleService;
    }

    @Override
    public RoleDto save(RoleDto roleDto) {
        return roleService.save(roleDto);
    }

    @Override
    public RoleDto findById(Long Id) {
        return roleService.findById(Id);
    }

    @Override
    public RoleDto updateById(Long aLong) {
        return roleService.updateById(aLong);
    }

    @Override
    public List<RoleDto> findAll() {
        return roleService.findAll();
    }

    @Override
    public void delete(RoleDto roleDto) {
        roleService.delete(roleDto);
    }

    @Override
    public void deleteById(Long id) {
        roleService.deleteById(id);
    }
}
