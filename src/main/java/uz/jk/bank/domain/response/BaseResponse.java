package uz.jk.bank.domain.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public abstract class BaseResponse {
    private String id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
