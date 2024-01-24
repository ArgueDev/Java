import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
//        String numeroStr = sc.nextLine();
        int numeroDecimal = 0;

        try{
            numeroDecimal = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Error, debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        String mensajeBinario = "Numero Binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
//        System.out.println("numeroDecimal = " + numeroDecimal);
//        System.out.println(mensajeBinario);
        
        int numeroBinario = 0b111110100;
        String mensajeOctal = "Numero Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
//        System.out.println("numeroBinario = " + numeroBinario);
//        System.out.println(mensajeOctal);
        
        int numeroOctal = 0764;
        String mensajeHex = "Numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
//        System.out.println("numeroOctal = " + numeroOctal);
//        System.out.println(mensajeHex);
        
//        int numeroHex = 0x1f4;
//        System.out.println("numeroHex = " + numeroHex);

        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHex;
        System.out.println(mensaje);
    }
}
