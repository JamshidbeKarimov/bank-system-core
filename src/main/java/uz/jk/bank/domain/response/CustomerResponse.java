package uz.jk.bank.domain.response;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CustomerResponse extends BaseResponse{
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String passport;
    private String picture;
}
