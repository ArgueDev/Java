public class Automovil {

    String fabricante;
    String modelo;
    String color = "Gris";
    double cilindraje;

    public void detalle() {
        System.out.println("Fabricante = " + this.fabricante);
        System.out.println("Modelo = " + this.modelo);
        System.out.println("Color = " + this.color);
        System.out.println("Cilindraje = " + this.cilindraje);
    }

}
