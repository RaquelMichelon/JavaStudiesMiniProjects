package com.michelon;

public class ReverseString {

    public static void main(String[] args) {
        String newString = reverse("raquel");
        System.out.println(newString);
    }

    public static String reverse(String original) {
        //store any char into an array
        char[] letters = new char[original.length()];

        int letterIndex = 0;

        for (int i = original.length() - 1; i >= 0; i--) {
            letters[letterIndex] = original.charAt(i);
            letterIndex++;

        }
        String reverse = "";
        //store each char into a String
        for (int i = 0; i <= original.length(); i++) {
            reverse = reverse + letters[i];
        }
        return original;
    }
}
