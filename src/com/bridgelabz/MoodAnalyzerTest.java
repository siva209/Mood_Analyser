package com.bridgelabz;
import org.junit.Test;

import com.bridgelabz.MoodAnalyzer;

import org.junit.Assert;


public class MoodAnalyzerTest {

	@Test
	public void givenSadWhileAnalysisMoodShouldReturnSad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
		String result = moodAnalyzer.analyseMood();
		Assert.assertEquals("SAD", result);
	}


	@Test
	public void givenHappyWhileAnalysisMoodShouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
		String result = moodAnalyzer.analyseMood();
		Assert.assertEquals("HAPPY", result);
	} 
	
	@Test
	public void givenNullWhileAnalysisMoodShouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
		String result = moodAnalyzer.analyseMood();
		Assert.assertEquals("HAPPY", result);
	}

}



