package com.bridgelabz;

public class MoodAnalyzerException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	enum ExceptionType {
		ENTERED_NULL, ENTERED_EMPTY
	}

	private ExceptionType type;

	public ExceptionType getType() {
		return this.type;
	}

	public MoodAnalyzerException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}

}
