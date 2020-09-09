import java.util.Scanner;

public class Palindrome {
    public static void isPalindrome() {
        Scanner scanner = new Scanner(System.in);
        String inputText = "", reverseText = "";

        do {
            System.out.println("Please input not empty text:");
            inputText = scanner.nextLine();

            char[] charArray = inputText.toCharArray();

            for (int i = charArray.length-1; i>=0; i--) {
                reverseText += charArray[i];
            }

            if (inputText != null && !inputText.isEmpty()) {
                String response = reverseText.equals(inputText) ? "is a palindrome!" : "is not a palindrome!";
                System.out.println(inputText + " " + response);
            } else System.out.println("Text is empty");
        } while (inputText.isEmpty());
    }

    public static void main(String[] args) {
        new Palindrome().isPalindrome();
    }
}
