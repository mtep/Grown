package com.TT;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.TT.View.MainWindow;

@SpringBootApplication 
@Configuration
public class GrownApplication {

	public static void main(String[] args) {
		
		new SpringApplicationBuilder(GrownApplication.class)
        .headless(false)
        .web(false) 
        .run(args);
	}
	
	@Bean
    public MainWindow frame() {
        return new MainWindow();
    }
}	
