package com.hypertek.converters;


import com.hypertek.dto.RoleDto;
import com.hypertek.dto.UserDto;
import com.hypertek.service.RoleService;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class UserDtoConverter implements Converter<String, RoleDto> {

   RoleService roleService;

    public UserDtoConverter(RoleService roleService) {
        this.roleService = roleService;
    }

    @Override
    public RoleDto convert(String source) {
        return roleService.findById(Long.parseLong(source));
    }
}
