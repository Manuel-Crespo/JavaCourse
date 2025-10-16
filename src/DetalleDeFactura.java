import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la factura: ");
        String nombreFactura = scanner.nextLine();

        System.out.println("Ingrese el precio del producto: ");
        Double producto1 = scanner.nextDouble();

        System.out.println("Ingrese el precio del producto 2: ");
        Double producto2 = scanner.nextDouble();

        double sumaProductos = producto1 + producto2;

        double impuesto = sumaProductos * 0.19;

        double totalMasImpuesto = sumaProductos + impuesto;

        System.out.println("El total de la factura: " + nombreFactura + " tiene un total bruto de: "
                + sumaProductos + " con un impuesto de: " + impuesto+ "\ndando un total con impuestos de: " + totalMasImpuesto);

    }
}
