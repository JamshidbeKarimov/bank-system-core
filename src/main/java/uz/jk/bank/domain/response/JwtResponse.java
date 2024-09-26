package uz.jk.bank.domain.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class JwtResponse {
    // full access token
    private String accessToken;
    // only access to get new access token
    private String refreshToken;

    public JwtResponse(String accessToken) {
        this.accessToken = accessToken;
    }
}