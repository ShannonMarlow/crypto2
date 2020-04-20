import java.util.*;
public class crypto2 {
    public static void main(String[] argv) {
    char[] plain =
            {'h','e','l','l','o'};
    int shift = 2;
    char[] encrypted = caesarEncrypt(plain, shift);
    System.out.println(encrypted);

    }
    static char[] caesarEncrypt(char[] text, int shift){
        int n = text.length;
        char[] encrypted = new char [n];
        int base = 'a';
        for (int i=0; i<n; i++){
            int offset = (int) text[i] - base;
            int shifted = (offset+shift) % 26;
            encrypted[i] = (char)(base+shifted);
        }
        return encrypted;
    }
}