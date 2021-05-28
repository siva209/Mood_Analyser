package com.bridgelabz;
import org.junit.Test;

import com.bridgelabz.MoodAnalyzer;

import org.junit.Assert;


public class MoodAnalyzerTest {

	@Test
	public void givenSadWhileAnalysisMoodShouldReturnSad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
		try {
			Assert.assertEquals("SAD", moodAnalyzer.analyseMood());
		} catch (MoodAnalyzerException e) {
		}
	}

	@Test
	public void givenHappyWhileAnalysisMoodShouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
		try {
			Assert.assertEquals("HAPPY", moodAnalyzer.analyseMood());
		} catch (MoodAnalyzerException e) {
		}
	}

	@Test
	public void givenNullMoodReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
		try {
			moodAnalyzer.analyseMood();
		} catch (MoodAnalyzerException e) {
			Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_NULL, e.getType());
		}
	}

	@Test
	public void givenNullMoodShouldThorwException() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
		try {
			moodAnalyzer.analyseMood();
		} catch (MoodAnalyzerException e) {
			Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_EMPTY, e.getType());
		}
	}
}



