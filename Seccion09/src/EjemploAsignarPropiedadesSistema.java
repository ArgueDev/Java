import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesSistema {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizado","Mi valor guardado en el objeto properties");
            System.setProperties(p);
            System.getProperties().list(System.out);
        } catch (Exception e){
            System.out.println("Archivo no encontrado: " + e);
        }
    }
}
