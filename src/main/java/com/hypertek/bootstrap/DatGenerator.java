package com.hypertek.bootstrap;

import com.hypertek.dto.ProjectDTO;
import com.hypertek.dto.RoleDto;
import com.hypertek.dto.UserDto;
import com.hypertek.enums.Gender;
import com.hypertek.enums.STATUS;
import com.hypertek.mappers.UserMapper;
import com.hypertek.service.ProjectService;
import com.hypertek.service.RoleService;
import com.hypertek.service.UserService;
import net.datafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DatGenerator implements CommandLineRunner {

    private final RoleService roleService;
    private final UserService userService;
    private final ProjectService projectService;


    public DatGenerator(RoleService roleService, UserService userService, ProjectService projectService) {
        this.roleService = roleService;
        this.userService = userService;
        this.projectService = projectService;
    }

    @Override
    public void run(String... args) throws Exception {
        RoleDto admin = new RoleDto(1L, "Admin");
        RoleDto manager = new RoleDto(2L, "Manager");
        RoleDto employee = new RoleDto(3L, "Employee");
        roleService.save(admin);
        roleService.save(manager);
        roleService.save(employee);

        Faker faker = new Faker();
        UserDto userDto1 = new UserDto(faker.name().femaleFirstName(),faker.name().lastName(),faker.internet().username()+"@gmail.com", faker.internet().password(),
                true,faker.phoneNumber().cellPhone(),admin, Gender.FEMALE);
        UserDto userDto2 = new UserDto(faker.name().femaleFirstName(),faker.name().lastName(),faker.internet().username()+"@gmail.com", faker.internet().password(),
                true,faker.phoneNumber().cellPhone(),manager, Gender.FEMALE);
        UserDto userDto3 = new UserDto(faker.name().femaleFirstName(),faker.name().lastName(),faker.internet().username()+"@gmail.com", faker.internet().password(),
                true,faker.phoneNumber().cellPhone(),admin, Gender.FEMALE);
        UserDto userDto4 = new UserDto(faker.name().malefirstName(),faker.name().lastName(),faker.internet().username()+"@gmail.com", faker.internet().password(),
                true,faker.phoneNumber().cellPhone(),employee, Gender.MALE);
        UserDto userDto5 = new UserDto(faker.name().malefirstName(),faker.name().lastName(),faker.internet().username()+"@gmail.com", faker.internet().password(),
                true,faker.phoneNumber().cellPhone(),employee, Gender.MALE);
        UserDto userDto6 = new UserDto(faker.name().femaleFirstName(),faker.name().lastName(),faker.internet().username()+"@gmail.com", faker.internet().password(),
                true,faker.phoneNumber().cellPhone(),employee, Gender.FEMALE);
        UserDto userDto7 = new UserDto(faker.name().malefirstName(),faker.name().lastName(),faker.internet().username()+"@gmail.com", faker.internet().password(),
                true,faker.phoneNumber().cellPhone(),admin, Gender.MALE);
        UserDto userDto8 = new UserDto(faker.name().femaleFirstName(),faker.name().lastName(),faker.internet().username()+"@gmail.com", faker.internet().password(),
                true,faker.phoneNumber().cellPhone(),manager, Gender.MALE);



        userService.save(userDto1);
        userService.save(userDto2);
        userService.save(userDto3);
        userService.save(userDto4);
        userService.save(userDto5);
        userService.save(userDto6);
        userService.save(userDto7);
        userService.save(userDto8);

        ProjectDTO project1 = new ProjectDTO("Spring-boot MVC","12342",userDto1, LocalDate.now().plusDays(1L),LocalDate.now().plusDays(3L),"spring boot mvc", STATUS.IN_PROGRESS);
        ProjectDTO project2 = new ProjectDTO("Spring-boot ORM","12453",userDto2, LocalDate.now().plusDays(1L),LocalDate.now().plusDays(3L),"spring boot mvc", STATUS.COMPLETE);
        ProjectDTO project3 = new ProjectDTO("Spring container","1442",userDto3, LocalDate.now().plusDays(1L),LocalDate.now().plusDays(3L),"spring boot mvc", STATUS.IN_PROGRESS);
        projectService.save(project1);
        projectService.save(project2);
        projectService.save(project3);
    }
}
