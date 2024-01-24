import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog("Ingrese un numero entero: ");
        int numeroDecimal = 0;

        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        String mensajeBinario = "Numero Binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println(mensajeBinario);
        
        int numeroBinario = 0b111110100;
        String mensajeOctal = "Numero Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println("numeroBinario = " + numeroBinario);
        System.out.println(mensajeOctal);
        
        int numeroOctal = 0764;
        String mensajeHex = "Numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println("numeroOctal = " + numeroOctal);
        System.out.println(mensajeHex);
        
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHex;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
