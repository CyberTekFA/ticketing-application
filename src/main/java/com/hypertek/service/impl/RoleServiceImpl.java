package com.hypertek.service.impl;

import com.hypertek.dto.RoleDto;
import com.hypertek.dto.UserDto;
import com.hypertek.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl extends AbstractMapService<RoleDto,Long> implements RoleService{

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

    @Override
    public void update(RoleDto object) {
        super.update(object.getId(),object);
    }


}
