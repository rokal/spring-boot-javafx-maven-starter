package com.appname.controller;

import org.springframework.stereotype.Component;

import com.appname.controller.FxmlController;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

@Component
public class MainController implements FxmlController{

	@FXML Label helloLabel;

	@Override
	public void initialize() {
		// TODO sky is your limit
		
	}

	@FXML public void sayHello() {
		helloLabel.setText("Hello world");
	}

}
