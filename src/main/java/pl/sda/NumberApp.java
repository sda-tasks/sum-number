package pl.sda;

import java.util.Scanner;

public class NumberApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj ile liczb chcesz zsumować: ");
        int numbers = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < numbers; i++) {
            System.out.println("Podaj kolejną liczbę: ");
            sum = sum + sc.nextInt();
        }

        System.out.println("Suma wszystkich podanych liczb to: " + sum);
        sc.close();
    }
}
