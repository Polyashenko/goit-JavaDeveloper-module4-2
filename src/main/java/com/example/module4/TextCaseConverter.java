package com.example.module4;

import org.springframework.stereotype.Component;

@Component
public class TextCaseConverter {
    public String convertTextCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (Character.isLetter(currentChar)) {
                if (i % 2 == 0) {
                    result.append(Character.toUpperCase(currentChar));
                } else {
                    result.append(Character.toLowerCase(currentChar));
                }
            } else {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}

