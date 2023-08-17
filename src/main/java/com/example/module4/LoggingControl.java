package com.example.module4;

import org.springframework.stereotype.Component;

@Component
public class LoggingControl {
    private boolean loggingEnabled = true;

    public void enableLogging() {
        loggingEnabled = true;
    }

    public void disableLogging() {
        loggingEnabled = false;
    }

    public boolean isLoggingEnabled() {
        return loggingEnabled;
    }
}
