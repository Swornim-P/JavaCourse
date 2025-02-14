package com.week6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExample {
    public static void main(String[] args) {
        Pattern newPattern = Pattern.compile("travelling");
        Matcher newMatcher = newPattern.matcher("I love travelling");

        if (newMatcher.find()){
            System.out.println("Exists");
        }
        else {
            System.out.println("Doesn't Exist");
        }

        String sentence = "College contact no is 1234567";
        String replacedSentence = sentence.replaceAll("\\d", "@");
        System.out.println("new Sentence= "+replacedSentence);

        System.out.println(sentence);
    }
}
