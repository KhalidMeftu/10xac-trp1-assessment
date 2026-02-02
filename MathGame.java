import java.util.Random;
import java.util.Scanner;

public class MathGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int questions = 5;

        System.out.println("Welcome to the Math Game!");
        System.out.println("Answer " + questions + " math questions correctly.");

        for (int i = 0; i < questions; i++) {
            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;
            char[] ops = {'+', '-', '*', '/'};
            char op = ops[random.nextInt(ops.length)];
            int correctAnswer;

            switch (op) {
                case '+':
                    correctAnswer = num1 + num2;
                    break;
                case '-':
                    correctAnswer = num1 - num2;
                    break;
                case '*':
                    correctAnswer = num1 * num2;
                    break;
                case '/':
                    correctAnswer = num1 / num2; // Integer division
                    break;
                default:
                    correctAnswer = 0;
            }

            System.out.print("Question " + (i + 1) + ": " + num1 + " " + op + " " + num2 + " = ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is " + correctAnswer);
            }
        }

        System.out.println("Game over! Your score: " + score + "/" + questions);
        scanner.close();
    }
}