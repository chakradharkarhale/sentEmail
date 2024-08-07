package com.example.emailsending.controller;
import com.example.emailsending.dto.EmailRequestDto;
import com.example.emailsending.dto.EmailResponseDto;
import com.example.emailsending.service.SendEmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j

public class EmailController {

    @Autowired
    private SendEmailService sendEmailService;

    @PostMapping("/Email")
    public EmailResponseDto sendEmail(@RequestBody EmailRequestDto emailRequestDto) {

        log.info("Request is {}",emailRequestDto);
        sendEmailService.sendEmail(emailRequestDto);
        log.info("Gmail sent successfully");
        return new EmailResponseDto("Send Successfully");
    }
}


