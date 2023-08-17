package com.example.module4;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class GoitJavaDeveloperModule4Application {
	private TextCaseRunner textCaseRunner;

	public GoitJavaDeveloperModule4Application(TextCaseRunner textCaseRunner) {
		this.textCaseRunner = textCaseRunner;
	}



	@PostConstruct
	public void doMagic() {
		textCaseRunner.runConvert();
	}

	public static void main(String[] args) {
		SpringApplication.run(GoitJavaDeveloperModule4Application.class, args);
	}

}
