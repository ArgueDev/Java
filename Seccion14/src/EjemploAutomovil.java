public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil();
        subaru.fabricante = "Subaru";
        subaru.modelo = "Impresa";
        subaru.cilindraje = 2.0;
        subaru.color = "Rojo";
        subaru.detalle();

        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-50";
        mazda.cilindraje = 3.0;
        mazda.color = "Negro";
        mazda.detalle();

    }
}
