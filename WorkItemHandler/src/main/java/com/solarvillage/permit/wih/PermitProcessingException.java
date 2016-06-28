package com.solarvillage.permit.wih;

public class PermitProcessingException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public PermitProcessingException() {
        super();
    }

    public PermitProcessingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public PermitProcessingException(String message, Throwable cause) {
        super(message, cause);
    }

    public PermitProcessingException(String message) {
        super(message);
    }

    public PermitProcessingException(Throwable cause) {
        super(cause);
    }
}
