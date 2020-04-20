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
        for (int i = 0; i < plainString.length(); i++) {
            text[i] = plainString.charAt(i);
        }
        //Takes in value to shift by
        System.out.println("Enter key to shift by: ");
        int shift = scanner.nextInt();
        char[] encrypted = caesarEncrypt(text, shift);
        //Prints out encrypted string
        System.out.println(encrypted);

    }

    //Takes in parameters for function
    static char[] caesarEncrypt(char[] text, int shift) {
        //n limits for loop until string has ended
        int n = text.length;
        //creates new char array to input letters from string
        char[] encrypted = new char[n];
        int base = 'a';
        //Shifts values by key
        for (int i = 0; i < n; i++) {
            int offset = (int) text[i] - base;
            int shifted = (offset + shift) % 26;
            encrypted[i] = (char) (base + shifted);
        }
        //Returns encrypted string to method
        return encrypted;
    }
}