package com.hypertek.converters;


import com.hypertek.dto.ProjectDTO;
import com.hypertek.dto.RoleDto;
import com.hypertek.dto.UserDto;
import com.hypertek.service.ProjectService;
import com.hypertek.service.RoleService;
import com.hypertek.service.UserService;
import io.micrometer.common.lang.NonNullApi;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
@NonNullApi
public class ProjectDTOConverter implements Converter<String, UserDto> {

   UserService userService;

    public ProjectDTOConverter(UserService Service) {
        this.userService = Service;
    }

    @Override
    public UserDto convert(String input) {
       return this.userService.findById(input);
    }
}
