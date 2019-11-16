package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите сообщение: ");
        String message = input.nextLine();
        String alph = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789?,.:!;-()*+=";
        String key = "ICENOVA";
	    Encryptor crypt = new Encryptor(alph, key);
        char[] messageInChar = message.toCharArray();
	    System.out.println(crypt.encrypting(message));
        System.out.println(crypt.decrypting(crypt.encrypting(message)));
    }
}
