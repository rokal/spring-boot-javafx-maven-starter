package com.appname.view;

import java.util.ResourceBundle;

public enum FxmlView {

	MAIN {
		@Override
		public String getTitle() {
			return getStringFromResourceBundle("app.window.title");
		}

		@Override
		public String getFxmlFile() {
			return "/fxml/Main.fxml";
		}
	};

	public abstract String getTitle();

	public abstract String getFxmlFile();

	String getStringFromResourceBundle(String key) {
		return ResourceBundle.getBundle("Bundle").getString(key);
	}

	String emptyString() {
		return "";
	}
}
