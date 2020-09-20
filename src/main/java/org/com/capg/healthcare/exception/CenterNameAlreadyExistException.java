package org.com.capg.healthcare.exception;

public class CenterNameAlreadyExistException extends RuntimeException{

	public CenterNameAlreadyExistException(String msg) {
		super(msg);
	}
}
