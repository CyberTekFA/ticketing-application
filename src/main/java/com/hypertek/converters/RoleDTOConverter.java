package com.hypertek.converters;


import com.hypertek.dto.RoleDto;
import com.hypertek.service.RoleService;
import io.micrometer.common.lang.NonNullApi;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
@NonNullApi
public class RoleDTOConverter implements Converter<String, RoleDto> {

   RoleService roleService;

    public RoleDTOConverter(RoleService roleService) {
        this.roleService = roleService;
    }

    @Override
    public RoleDto convert(String input) {
       return this.roleService.findById(Long.parseLong(input));
    }
}
