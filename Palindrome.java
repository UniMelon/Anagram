package task1;

import java.util.Scanner;

public class Anagram {
    private void reverseSeparateWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter some text:");
        String inputText = scanner.nextLine();
        String[] words = inputText.split(" "); //разделить текст на слова
        String result = "";
        for (int i = 0; i < words.length; i++) { // обработать каждое слово по отдельности для сохр.порядка
            String temp = words[i];
            char sentencePart[] = temp.toCharArray(); // слово на массив символов

            int prevIndex = 0;
            int nextIndex = sentencePart.length - 1;

            for (int j = 0; j < sentencePart.length; j++) {
                char symbolToBeSwapped = sentencePart[nextIndex];

                if (prevIndex < nextIndex) {
                    if (!Character.isLetter(sentencePart[prevIndex])) {
                        prevIndex++;
                    } else {
                        if (!Character.isLetter(symbolToBeSwapped)) {
                            nextIndex--;
                        } else {
                            sentencePart[nextIndex] = sentencePart[prevIndex];
                            sentencePart[prevIndex] = symbolToBeSwapped;
                            prevIndex++;
                            nextIndex--;
                        }
                    }
                }
            }
            result+=new String(sentencePart)+" "; // конкатенировать все слова обратно
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        new Anagram().reverseSeparateWord();
    }
}
