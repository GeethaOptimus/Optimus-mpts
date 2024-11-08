package com.cuplus.mptsClient;

/**
 * @author Geetha
 *
 */
public class RequestFailedException extends Exception {

	private String message;
	
	public RequestFailedException() {
		super();
	}
	
	public RequestFailedException(String msg) {
		super(msg);
		this.message = msg;
	}
	
	public RequestFailedException(Throwable cause) {
		super(cause);
	}
	
	public RequestFailedException(String msg,Throwable cause) {
		super(msg,cause);
		this.message = msg;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
}
