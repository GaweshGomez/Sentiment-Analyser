//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.File;
import java.util.Scanner;

public class Main {
    public static MyLinkedList positiveList = new MyLinkedList();
    public static MyLinkedList negativeList = new MyLinkedList();

    public static MyLinkedList negationList = new MyLinkedList();

    public Main() {
    }

    public static void main(String[] args) {
        try {
            File positiveFile = new File("Positive.txt");
            Scanner positiveCheck = new Scanner(positiveFile);

            String word;
            while(positiveCheck.hasNextLine()) {
                word = positiveCheck.nextLine().trim();
                if (!word.isEmpty()) {
                    MyLinkedList.insert(positiveList, word);
                }
            }

            File negativeFile = new File("Negative.txt");
            Scanner negativeCheck = new Scanner(negativeFile);

            while(negativeCheck.hasNextLine()) {
                word = negativeCheck.nextLine().trim();
                if (!word.isEmpty()) {
                    MyLinkedList.insert(negativeList, word);
                }
            }

            File negationFile = new File("Negation.txt");
            Scanner negationChecker = new Scanner(negationFile);

            while(negationChecker.hasNextLine()) {
                word = negationChecker.nextLine().trim();
                if (!word.isEmpty()) {
                    MyLinkedList.insert(negationList, word);
                }
            }
        } catch (Exception var8) {
            System.out.println("Invalid input...");
            var8.printStackTrace();
        }

        while(true) {
            MyLinkedList.getChecker = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Type 'Exit' to exit the program.\nPlease Provide an Input Statement: ");
            String userInput = scanner.nextLine();
            userInput = userInput.toLowerCase();
            if (userInput.equals("exit")) {
                return;
            }

            String[] list = userInput.split(" ");

            int i;
            for(i = 0; i < list.length; ++i) {
                MyLinkedList.PositiveView(positiveList, list[i]);
                MyLinkedList.NegativeView(negativeList, list[i]);
            }

            for(i = 0; i < list.length; ++i) {
                MyLinkedList.NegationView(negationList, list[i]);
            }

            if (MyLinkedList.getChecker == 2) {
                System.out.println("Sentiment: Positive.\n");
            } else if (MyLinkedList.getChecker == 4) {
                System.out.println("Sentiment: Negative.\n");
            } else if (MyLinkedList.getChecker == 3) {
                System.out.println("Sentiment: Negative.\n");
            } else if (MyLinkedList.getChecker == 5) {
                System.out.println("Sentiment: Positive.\n");
            } else if (MyLinkedList.getChecker == 1) {
                System.out.println("Sentiment: Negative");
            } else {
                System.out.println("Sentiment: Neutral.\n");
            }
        }
    }
}
