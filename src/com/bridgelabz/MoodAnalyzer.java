package com.bridgelabz;

public class MoodAnalyzer {

	private String message;

	public MoodAnalyzer() {
	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyseMood() {
	  try {
		if (message.contains("I am in Sad Mood")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	} catch (NullPointerException e) {
		return "HAPPY";
    }
  }
	}


