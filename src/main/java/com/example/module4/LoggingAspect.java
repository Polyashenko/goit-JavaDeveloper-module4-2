package com.example.module4;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger LOGGER = Logger.getLogger(LoggingAspect.class.getName());

    private LoggingControl loggingControl;

    public LoggingAspect(LoggingControl loggingControl) {
        this.loggingControl = loggingControl;
    }

    @Pointcut("execution(public String com.example.module4.TextCaseConverter.convertTextCase(String)) && args(text)")
    private void convertTextCase(String text) {
    }

    @AfterReturning(pointcut = "convertTextCase(text)", returning = "transformedCase")
    public void afterReturningConvertCase(String text, String transformedCase) {
        if (loggingControl.isLoggingEnabled()) {
            LOGGER.info("Initial line: " + text);
            LOGGER.info("Converted string: " + transformedCase);
        }
    }
}


