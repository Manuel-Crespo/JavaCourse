package ejerciciosprimitivos;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        boolean esPar = num % 2 == 0;

        System.out.println("esPar = " + esPar);

    }
}
