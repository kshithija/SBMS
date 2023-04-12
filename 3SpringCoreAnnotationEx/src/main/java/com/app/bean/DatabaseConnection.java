package com.app.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("con")
public class DatabaseConnection {

	@Value("${my.grade.id}")
	private int code;
	
	@Value("${my.db.driver}")
	private String driver;
	@Value("${my.db-url}")
	private String url;
	@Value("${my.db_user}")
	private String userName;
	@Value("${my.db-pwd}")
	private String userPwd;
	
	
	public DatabaseConnection() {
		super();
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getDriver() {
		return driver;
	}


	public void setDriver(String driver) {
		this.driver = driver;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserPwd() {
		return userPwd;
	}


	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}


	@Override
	public String toString() {
		return "DatabaseConnection [code=" + code + ", driver=" + driver + ", url=" + url + ", userName=" + userName
				+ ", userPwd=" + userPwd + "]";
	}
	
	
	
}
