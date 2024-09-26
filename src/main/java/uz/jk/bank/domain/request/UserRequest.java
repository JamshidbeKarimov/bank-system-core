package uz.jk.bank.domain.request;

import lombok.*;
import uz.jk.bank.domain.constants.UserRole;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserRequest {
    private String fullName;
    private String username;
    private String password;
    private String email;
    private LocalDate dateOfBirth;
    private UserRole role;
}
