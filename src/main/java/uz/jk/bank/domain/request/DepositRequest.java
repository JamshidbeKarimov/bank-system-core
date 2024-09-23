package uz.jk.bank.domain.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DepositRequest {
    private UUID depositTypeId;

    private UUID customerId;

    private LocalDate date;
}
