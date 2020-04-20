import java.util.*;
public class crypto2 {
    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What text would you like to encrypt? ");
        //Takes in string
        String plainString = scanner.nextLine();
        //Creates array of string length
        char[] text = new char[plainString.length()];
        //Copies character by character into array
        for(int i=0; i<plainString.length();i++){
            text[i] = plainString.charAt(i);
        }
    int shift = 2;
    char[] encrypted = caesarEncrypt(text, shift);

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