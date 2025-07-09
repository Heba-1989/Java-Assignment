import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        double first = sc.nextDouble();

        System.out.println("enter second number");
        double second = sc.nextDouble();

        double sum = first + second;
        double difference = first - second;
        double product = first * second;
        double quotient = first / second;
        System.out.println("sum=" + sum);
        System.out.println("difference=" + difference);
        System.out.println("product=" + product);
        System.out.println("quotient=" + quotient);


    }
}
