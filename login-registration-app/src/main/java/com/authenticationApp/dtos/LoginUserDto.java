package  com.authenticationApp.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginUserDto {

    @NotBlank(message="email cannot be null")
    private String email;

    @NotBlank(message = "password cannot be null")
    private String password;
}
