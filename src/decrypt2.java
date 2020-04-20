import java.util.*;
public class decrypt2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the encrypted text? ");
        //Take in encrypted string
        String encryptedText = scanner.nextLine();
        System.out.print("What is the key? ");
        //Take in key
        int key = scanner.nextInt();
        //Create char array same length as string
        char[] inputText = new char[encryptedText.length()];
        //Copies each character from string into array
        for (int i = 0; i < encryptedText.length(); i++) {
            inputText[i] = encryptedText.charAt(i);
        }
        char[] decrypted = caesarDecrypt(inputText, key);
        //prints out decrypted string
        System.out.println(decrypted);
    }
    static char[] caesarDecrypt(char[] inputText, int key) {
        //n limits for loop until string has ended
        int n = inputText.length;
        //creates new char array to input letters from string
        char[] decrypted = new char[n];
        int base = 'a';
        //Shifts values by key
        for (int i = 0; i < n; i++) {
            int offset = (int) inputText[i] - base;
            int shifted = (offset - key) % 26;
            decrypted[i] = (char) (base + shifted);
        }
        //Returns encrypted string to method
        return decrypted;
    }
}
