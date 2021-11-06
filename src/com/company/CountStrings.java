package com.company;

public class CountStrings {
    public static void main(String[] args) {
        // initialize the target variable
        String targetString = "have";
        // Get the value of the count from our method below.
        int count = countStrings(new String[]{"uo", "oo", "oo", "ou", "you", "you", "apple", "orange"}, targetString);
        // Output the necessary interactive output.
        System.out.println("The string '" + targetString + "' appears " + count + ((count==1) ? " time" : " times"));
    }

    public static int countStrings(String[] strings, String targetString) {
        // Initialize a counter
        int counter = 0;

        // Loop through the array, compare each element,
        // and increase the counter each time a match is found.
        for (String word : strings) {
            if (word.equals(targetString)) counter++;
        }
        return counter;
    }
}
