package ejerciciosprimitivos;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();

        System.out.println("Ingresa tu altura en metros: ");
        double altura = sc.nextDouble();

        String datosUsuario = nombre + " " + edad + " " + altura;
        System.out.println(datosUsuario);
    }
}
