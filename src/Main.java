package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a;
        double b;

        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        System.out.print("skriv første tal: ");
        a = scanner.nextDouble();
        System.out.print("skriv andet tal: ");
        b = scanner.nextDouble();
        System.out.println("vælg operator");

        switch (scanner.next()) {
            case "+":
                System.out.println(calculator.add(a, b));
                break;
            case "-":
                System.out.println(calculator.subtract(a, b));
                break;
            case "*":
                System.out.println(calculator.multiply(a, b));
                break;
            case "/":
                System.out.println(calculator.divide(a, b));
                break;
        }


    }
}
