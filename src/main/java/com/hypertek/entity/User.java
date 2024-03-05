package com.hypertek.entity;



import com.hypertek.enums.Gender;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;



@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
public class User extends BaseEntity{
    public User(Long id, LocalDateTime insertDateTime, Long insertUserId, LocalDateTime lastUpdateDateTime, Long lastUpdateUserId, Long id1, String firstname, String lastname, String username, String password, boolean enabled, String phone, Role role, Gender gender) {
        super(id, insertDateTime, insertUserId, lastUpdateDateTime, lastUpdateUserId);
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.phone = phone;
        this.role = role;
        this.gender = gender;
    }

    private Long id;
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private boolean enabled;
    private String phone;
    private Role role;
    private Gender gender;

}
