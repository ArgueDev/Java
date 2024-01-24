public class Variables {
    public static void main(String[] args) {
        String saludar = "Hola Mundo";
        System.out.println("saludar = " + saludar.toUpperCase());

        int numero = 10;
        boolean valor = true;
        int numero2 = 1;

        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }

        System.out.println("numero2 = " + numero2);
        var numero3 = "15";

        String nombre;
        nombre = "Andres";

        if(numero > 11){
            nombre = "Juan";
        }

        /* System.out.println("nombre = " + nombre); */

        // int edadPersona = 5;
    }
}
