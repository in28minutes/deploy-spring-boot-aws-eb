package com.in28minutes.rest.webservices.restfulwebservices.task;

public class TaskDetails {

	private String id;
	
	private String message;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "TaskDetails [id=" + id + ", message=" + message + "]";
	}

	
}
