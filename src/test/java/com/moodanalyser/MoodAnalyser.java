package com.moodanalyser;

public class MoodAnalyser {
    public void analyseMood(String mood){
        System.out.println("Current Mood is:"+mood);
    }
    public static void main(String[] args)
    {
        System.out.println("Mood Analyser to analyze Haappy or Sad Mood.");
        MoodAnalyser obj = new MoodAnalyser();
        obj.analyseMood("Happy");
    }
}
