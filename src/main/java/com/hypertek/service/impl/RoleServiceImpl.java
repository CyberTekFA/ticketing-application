package com.hypertek.service.impl;

import com.hypertek.dto.RoleDto;
import com.hypertek.service.RoleService;
import java.util.List;

public class RoleServiceImpl extends AbstractMapService<Long,RoleDto> implements RoleService{

    @Override
    public RoleDto save(RoleDto roleDto) {
        return super.save(roleDto.getId(),roleDto);
    }

    @Override
    public RoleDto findById(Long id) {
        return super.findById(id);
    }

    @Override
    public List<RoleDto> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
