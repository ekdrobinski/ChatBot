import java.util.Scanner;
public class ChatBot {
    public static void main(String[] args) {
        getGreeting();
        String name = getName();
        repeatName();
        int age = getAge(name);
        countToNumber();
        getQuestion();
    }
    public static void getGreeting() {
        System.out.println("¡Hola! ¡Mucho gusto!");
    }
    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
    public static String repeatName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sorry, what was your name again?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!... Again...");
        return name;
    }

    public static int getAge(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Time to guess your age! Tell me a number and I'll try a guess.");
        int number = scanner.nextInt();
        int ageGuess = number * 8 / 2;
        System.out.println(name + ", I think you are " + ageGuess + " years old.");
        return ageGuess;
    }

    public static void countToNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Counting to " + number + "...");
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void getQuestion() {
        Scanner scanner = new Scanner(System.in);
        String userAnswer;
        System.out.println("What do you use to compare the value of a String in Java?");
        System.out.println("A. Coffee. An Americano, specifically");
        System.out.println("B. .equals()");
        System.out.println("C. ==");
        System.out.println("D. ===");

        do {
            System.out.print("Enter the answer A, B, C, or D");
            userAnswer = scanner.nextLine().toUpperCase(); //makes sure user input is not case sensitive
        } while (!userAnswer.equals("B"));

        System.out.println("Finally! You got it right!");
    }
}
