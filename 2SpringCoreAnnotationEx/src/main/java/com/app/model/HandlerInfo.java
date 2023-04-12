package com.app.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hob")
public class HandlerInfo {
	
	@Value("data")
	private String resolverCode;
	
	@Value("temp")
	private String pathToStore;

	public HandlerInfo() {
		super();
	}

	public String getResolverCode() {
		return resolverCode;
	}

	public void setResolverCode(String resolverCode) {
		this.resolverCode = resolverCode;
	}

	public String getPathToStore() {
		return pathToStore;
	}

	public void setPathToStore(String pathToStore) {
		this.pathToStore = pathToStore;
	}

	@Override
	public String toString() {
		return "HandlerInfo [resolverCode=" + resolverCode + ", pathToStore=" + pathToStore + "]";
	}
}
