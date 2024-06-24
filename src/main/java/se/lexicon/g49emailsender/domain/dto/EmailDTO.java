package se.lexicon.g49emailsender.domain.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class EmailDTO {
    @NotBlank(message = "To field cannot be blank.")
    @Email(message = "To field should be a valid email.")
    private String to;
    @NotBlank(message = "Subject field cannot be blank.")
    private String subject;
    @NotBlank(message = "HTML field cannot be blank.")
    private String html;
    @Positive(message = "Type should be a positive number.")
    private Integer type;
}
