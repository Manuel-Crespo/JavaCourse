package ejerciciosprimitivos;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        final float gravedad = 9.81f;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su peso en kg: ");
        float masa = sc.nextFloat();

        float peso = masa * gravedad;
        System.out.println("Peso en kg: " + peso);


    }
}
