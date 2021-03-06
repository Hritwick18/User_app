package com.cp.users.controller;

/**
 * 
 * ResponseInfo class
 * @author hritwick
 *
 */

public class ResponseInfo {

//	variables
	private int statusCode;
	private String status;
	private String message;
	private String path;

	// getters and setters
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	
	public void setMessage(String message) {
		this.message = message;
	}

	// field constructor
	public ResponseInfo(int statusCode, String status, String message, String path) {
		super();
		this.statusCode = statusCode;
		this.status = status;
		this.message = message;
		this.path = path;
	}

	// Default constructor
	public ResponseInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Overriding toString method
	@Override
	public String toString() {
		return "ResponseInfo [statusCode=" + statusCode + ", status=" + status + ", message=" + message + ", path="
				+ path + "]";
	}

}
