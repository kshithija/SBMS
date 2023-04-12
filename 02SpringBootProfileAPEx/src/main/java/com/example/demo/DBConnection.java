package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties("my.app")
public class DBConnection {

	private String host;
	private Integer port;
	private String username;
	private String password;
}
