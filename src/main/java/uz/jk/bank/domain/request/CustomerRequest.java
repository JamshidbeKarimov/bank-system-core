package uz.jk.bank.domain.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CustomerRequest {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String secret;
    private String passport;
    private String picture;
}

