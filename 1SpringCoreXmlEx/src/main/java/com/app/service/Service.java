package com.app.service;

import com.app.model.Repository;

public class Service {
	
	private Repository repo;

	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Repository getRepo() {
		return repo;
	}

	public void setRepo(Repository repo) {
		this.repo = repo;
	}

	@Override
	public String toString() {
		return "Service [repo=" + repo + "]";
	}

}
