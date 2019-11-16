package com.company;

public class Encryptor {
    private String alph;
    private String key;
    public void setKey(String key) {
        this.key = key;
    }
    public void setAlph(String alph) {
        this.alph = alph;
    }

    Encryptor(String alph, String key){
        this.key = key;
        this.alph = alph;
    }

    public String encrypting(String message){
//        System.out.println(key);
        char[] messageInChar = message.toCharArray();
        int messageLetter;
        for (int i = 0;i < messageInChar.length;i++){
            messageLetter = alph.indexOf(messageInChar[i]);
            //Наличие символа в алфавите
            if (messageLetter != -1){
                messageInChar[i] = alph.charAt((alph.indexOf(key.charAt(i % key.length())) + messageLetter)% alph.length());
            }
            else{
                return "Символ '" + messageInChar[i] + "' не поддерживается выбраным алфавитом";
            }
        }
        return String.valueOf(messageInChar);
    }

    public String decrypting(String message){
        char[] messageInChar = message.toCharArray();
        int messageLetter;
        int ans;
        for (int i = 0;i < message.length();i++){
            messageLetter = alph.indexOf(messageInChar[i]);
            if (messageLetter != -1){
                ans = messageLetter - alph.indexOf(key.charAt(i% key.length()));
                if (ans >= 0) messageInChar[i] = alph.charAt(ans);
                else messageInChar[i] = alph.charAt(alph.length() + ans);
            }
            else {
                return "Символ '" + messageInChar[i] + "' не поддерживается выбраным алфавитом";
            }
        }
        return String.valueOf(messageInChar);
    }
}
