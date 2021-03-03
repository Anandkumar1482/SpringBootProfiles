package com.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProfileEnvironment {

	@Value("${app.server.name}")
	private String appServer;

	// @Value("${user.fb.name}")

	@Value("${app.message}")
	private String appMessage;

	@Value("${spring.datasource.url}")
	private String datasource;

	@Value("${spring.datasource.username}")
	private String username;

	@Value("${spring.datasource.password}")
	private String pass;

	@Value("${spring.datasource.driverClassName}")
	private String driverName;

	@Override
	public String toString() {
		return "ProfileEnvironment [appServer=" + appServer + ", appMessage=" + appMessage + ", datasource="
				+ datasource + ", username=" + username + ", pass=" + pass + ", driverName=" + driverName + "]";
	}

}
