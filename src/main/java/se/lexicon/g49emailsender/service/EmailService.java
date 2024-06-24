package se.lexicon.g49emailsender.service;


import se.lexicon.g49emailsender.domain.dto.EmailDTO;

import java.util.List;

public interface EmailService {
    void sendEmail(EmailDTO dto);

}
