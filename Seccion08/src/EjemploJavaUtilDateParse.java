import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con formato 'yyyy-MM-dd'");
        try {
            Date fecha = formato.parse(sc.next());
            System.out.println("fecha = " + fecha);
            System.out.println("formato = " + formato.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            if (fecha.after(fecha2)){
                System.out.println("Fecha del usuario es despues que fecha2");
            } else if (fecha.before(fecha2)) {
                System.out.println("Fecha es anterior que fecha2");
            } else if (fecha.equals(fecha2)) {
                System.out.println("Fecha es igual a fecha2");
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
