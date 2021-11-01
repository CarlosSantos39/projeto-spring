package com.carloscursomvc.services.exceptions;

public class DataInterityException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DataInterityException(String msg) {
		super(msg);
	}
	
	public DataInterityException(String msg, Throwable cause) {
		super(msg, cause);
	}
}