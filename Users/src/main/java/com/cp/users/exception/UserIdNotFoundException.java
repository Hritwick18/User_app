package com.cp.users.exception;

/**
 * 
 * UserIdNotFoundException Class
 *
 */
@SuppressWarnings("serial")
public class UserIdNotFoundException extends RuntimeException{
	public UserIdNotFoundException(String message) {
		super(message);
	}
}
