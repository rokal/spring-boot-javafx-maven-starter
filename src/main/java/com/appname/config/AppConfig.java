package com.appname.config;

import java.io.IOException;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.appname.view.SpringFXMLLoader;
import com.appname.view.StageManager;

import javafx.stage.Stage;

@Configuration
public class AppConfig {

	@Autowired
	SpringFXMLLoader springFXMLLoader;

	@Bean
	public ResourceBundle resourceBundle() {
		return ResourceBundle.getBundle("Bundle");
	}

	@Bean
	@Lazy(value = true) // Stage only created after Spring context bootstap
	public StageManager stageManager(Stage stage) throws IOException {
		return new StageManager(springFXMLLoader, stage);
	}

}