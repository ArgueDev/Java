public class Caracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal == caracter));

        char simbolo = '@';
        char espacio = ' ';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        System.out.println("Tipo char corresponde a byte a: " + retornoCarro + Character.BYTES);
        System.out.println("Tipo char corresponde a bites a: " + Character.SIZE);
        System.out.println("Valor maximo de un char: " + Character.MAX_VALUE);
        System.out.println("Valor minimo de un char: " + Character.MIN_VALUE);
    }
}
