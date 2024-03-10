package  com.authenticationApp.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserDto {

    @NotBlank(message="email cannot be null")
    private String email;

    @NotBlank(message="firstName cannot be null")
    private String firstName;

    @NotBlank(message="lastName cannot be null")
    private String lastName;

    @NotBlank(message="password cannot be null")
    private String password;

}
