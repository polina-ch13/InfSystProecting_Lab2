package ua.hpi.archit.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ua.hpi.archit.service")
public class dataConfig {
	@Bean("studentData")
	Data datastdt() {
		return new Data();
	}
}
