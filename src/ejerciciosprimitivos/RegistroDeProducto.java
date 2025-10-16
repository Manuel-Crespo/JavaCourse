package ejerciciosprimitivos;

import java.util.Scanner;

public class RegistroDeProducto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el nombre del producto: ");
        String nombreProducto = sc.nextLine();

        System.out.println("Ingresa la cantidad en stock del producto: ");
        int cantidadStock = sc.nextInt();

        System.out.println("Ingresa el precio unitario del producto: ");
        double precioUnitario = sc.nextDouble();

        System.out.println("Ingresa el descuento del producto: ");
        float descuento = sc.nextFloat();

        System.out.println("Ingresa el codigo de categoria del producto: ");
        byte codigoCategoria = sc.nextByte();

        System.out.println("Ingresa el codigo del producto: ");
        long codigoProducto = sc.nextLong();

        System.out.println("Ingresa el estado del producto: ");
        boolean estadoProducto = sc.nextBoolean();

        double totalBruto = cantidadStock * precioUnitario;

        double valorDescuento = totalBruto * descuento / 100;

        double totalNeto = totalBruto - valorDescuento;

        char castCodigoCategoria = (char) codigoCategoria;

        String mensajeFinal = "El producto " + nombreProducto + " con cantidad de: " + cantidadStock + " precio de: "
                + precioUnitario + " total bruto de: " + totalBruto + " con descuento de: "  + descuento +
                " da un total neto de: " + totalNeto + " tiene el codigo de categoria como: " + castCodigoCategoria
                + " el codigo de producto de: " +  codigoProducto + " y se encuentra con el estado: " + estadoProducto;
        System.out.println(mensajeFinal);
    }
}
