public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 7;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en bytes a: " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a: " + Byte.SIZE);
        System.out.println("Valor máximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte: " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en bytes a: " + Short.BYTES);
        System.out.println("Tipo short corresponde en bites a: " + Short.SIZE);
        System.out.println("Valor máximo de un short: " + Short.MAX_VALUE);
        System.out.println("Valor minimo de un short: " + Short.MIN_VALUE);

        int numeroInt = 32768;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en bytes a: " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a: " + Integer.SIZE);
        System.out.println("Valor máximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un int: " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde en bytes a: " + Long.BYTES);
        System.out.println("Tipo long corresponde en bites a: " + Long.SIZE);
        System.out.println("Valor máximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un long: " + Long.MIN_VALUE);

    }
}
