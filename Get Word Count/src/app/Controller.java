package app;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner words = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = words.nextLine();
        int count = 0;
        Scanner wordCount = new Scanner(text);
        while (wordCount.hasNext()) {
            count++;
            wordCount.next();
        }
        System.out.print(count);
    }

}
