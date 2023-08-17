package com.example.module4;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class TextCaseRunner {
    private TextCaseConverter textCaseConverter;

    private LoggingControl loggingControl;

    public TextCaseRunner(TextCaseConverter textCaseConverter, LoggingControl loggingControl) {
        this.textCaseConverter = textCaseConverter;
        this.loggingControl = loggingControl;
    }

    public void runConvert() {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean exit = false;
            while (!exit) {
                String input = scanner.nextLine();
                if ("exit".equalsIgnoreCase(input)) {
                    exit = true;
                } else if ("l on".equalsIgnoreCase(input)) {
                    loggingControl.enableLogging();
                } else if ("l off".equalsIgnoreCase(input)) {
                    loggingControl.disableLogging();
                } else {
                    textCaseConverter.convertTextCase(input);
                }
            }
        }
    }
}
