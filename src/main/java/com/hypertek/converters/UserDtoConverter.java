package com.hypertek.converters;

import com.hypertek.dto.UserDto;
import com.hypertek.service.UserService;
import io.micrometer.common.lang.NonNullApi;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
@NonNullApi
public class UserDtoConverter implements Converter<String, UserDto> {

    UserService userService;

    public UserDtoConverter(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDto convert(String source) {
        return userService.findById(source);
    }

}