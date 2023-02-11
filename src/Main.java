import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner strangersQ = new Scanner(System.in);
        System.out.print("Введите количество незнакомцев: "); //Write a program, asks for a number - amount of strangers to meet.
        int inputStrangersQuantity = strangersQ.nextInt();
        String StrangersName = null;
        System.out.println("Введите имена незнакомцев!"); //Then reads stranger names line by line and prints line by line "Hello, ...".
        if (inputStrangersQuantity == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else if (inputStrangersQuantity > 0) {
            for (int i = inputStrangersQuantity; i > 0; i--) {
                StrangersName = strangersQ.next();
                System.out.println("Hello, " + StrangersName);
            }
        } else {
            System.out.println("Seriously? Why so negative?");
        }
    }
}