package com.moodanalyser;

public class MoodAnalyser {
    String mood_swing ;
    MoodAnalyser(String mood_swing){
        this.mood_swing = mood_swing;
    }
    public void analyseMood(String mood){
        System.out.println("Current Mood is:"+mood);
    }
    public static void main(String[] args)
    {
        System.out.println("Mood Analyser to analyze Haappy or Sad Mood.");
        MoodAnalyser obj = new MoodAnalyser();
        obj.analyseMood("Happy");
        MoodAnalyser obj_swing = new MoodAnalyser("Sad");
        System.out.println("My Mood is:"+obj_swing);
    }
}
