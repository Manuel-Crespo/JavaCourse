import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int numeroDecimal = 0;

        try {
            numeroDecimal = Integer.parseInt(numeroStr);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numero decimal: " + numeroDecimal);

        String resultadoBinario = "numero binario de: " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        String resultadoOctal = "numero octal de: " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        String resultadoHexa = "numero Hexadecimal de: " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexa);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexa;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
