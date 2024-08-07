package com.example.emailsending.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class EmailRequestDto {

        @JsonProperty("Mail")
        private String recipients;

        private String body;

        private String subject;

    }

