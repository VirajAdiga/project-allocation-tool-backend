package com.project.emailservice.mappers;

import com.project.emailservice.exception.EmailCodeNotAvailableException;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class EmailCodeToMessageMapper {

    private final Map<String, String> emailCodeToMessageMap = new HashMap<>();
    public EmailCodeToMessageMapper(){
        this.emailCodeToMessageMap.put("EMAIL_CODE_001", "Hi, \nYou have created a project successfully!");
    }

    public String getEmailBody(String emailCode){
        if (this.emailCodeToMessageMap.containsKey(emailCode)) {
            return this.emailCodeToMessageMap.get(emailCode);
        }
        throw new EmailCodeNotAvailableException("Email code " + emailCode + " not found");
    }
}
