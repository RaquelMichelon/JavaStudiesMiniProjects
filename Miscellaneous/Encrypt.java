package com.michelon.encryption;

public class Encrypt {

    public static void main(String[] args) {
        int key = 12;
        String text = "Hi! This is my first encryption.";

        char[] letters = text.toCharArray();

        for (char c : letters) {
            c += key;
            System.out.print("This is the encrypted message: " + c);
        }

    }
}
