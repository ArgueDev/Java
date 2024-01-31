import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "ChristianArgue";
        usernames[1] = "MarioA";
        usernames[2] = "Pepe";

        passwords[0] = "093153Sam";
        passwords[1] = "091285Sam";
        passwords[2] = "pepe123";*/

        String[] usernames = {
                "ChristianArgue",
                "MarioA",
                "Pepe"
        };

        String[] passwords = {
                "093153Sam",
                "091285Sam",
                "pepe123"
        };

        System.out.println("Ingrese el Usuario");
        System.out.print("--> : ");
        String user = sc.next();

        System.out.println("Ingrese el Password");
        System.out.print("--> : ");
        String pass = sc.next();

        boolean esAutenticado = false;

        for(int i = 0; i < usernames.length; i++){
            if(usernames[i].equals(user) && passwords[i].equals(pass)){
                esAutenticado = true;
                break;
            }
        }

        if(esAutenticado){
            System.out.println("Ingreso de Usuario exitoso!");
            System.out.println("Bienvenido, ".concat(user));
        }else {
            System.out.println("Username o Password incorrectos!");
            System.out.println("Ingreso de Usuario Fallido");
        }
    }
}
