package com.mobileshop.util;

import java.util.ResourceBundle;

import org.springframework.stereotype.Component;

@Component
public class MessageUtil {

	public String getMessage(String message) {
		ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
		return resourceBundle.getString(message);
	}
}
