package com.michelon.encryption;

public class Decrypt {

    public static void main(String[] args) {
        int key = 6;
        String text = "Nk2&nu}-y&oz&ngtmotE";

        char[] letters = text.toCharArray();

        for (char c : letters) {
            c -= key; //instead of increment, we need to decrement
            System.out.print("This is the decrypted message: " + c);
        }

    }
}
