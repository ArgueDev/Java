public class SentenciaSwitchCase {
    public static void main(String[] args) {
        byte num = 2;

        switch (num){
            case 0:
                System.out.println("Es el 0");
                break;
            case 1:
                System.out.println("Es el 1");
                break;
            case 2:
                System.out.println("Es el 2");
                break;
            case 3:
                System.out.println("Es el 3");
                break;
            default:
                System.out.println("Numero desconocido");
        }

        String nombre = "Christian";

        switch (nombre){
            case "admin":
                System.out.println("Hola admin, Bienvenido");
                break;
            case "Christian":
                System.out.println("Hola Christian!");
                break;
            case "Andres":
                System.out.println("Hola Andres!");
                break;
            default:
                System.out.println("Usuario desconocido");
        }

        int mes = 4;
        String nombreMes = null;

        switch (mes){
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Indefinido";
        }

        System.out.println("nombreMes = " + nombreMes);
    }
}
