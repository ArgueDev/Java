public class Automovil {

    private String fabricante;
    private String modelo;
    private String color = "Gris";
    private double cilindraje;
    private int capacidadTanque = 40;

    private static int matricula;

    public static int getMatricula() {
        return matricula;
    }

    public static void setMatricula(int matricula) {
        Automovil.matricula = matricula;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindraje, int capacidadTanque) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindraje = cilindraje;
        this.capacidadTanque = capacidadTanque;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindraje=" + cilindraje +
                ", capacidadTanque=" + capacidadTanque +
                '}';
    }

    public void verDetalle() {
        System.out.println("Fabricante = " + this.fabricante);
        System.out.println("Modelo = " + this.modelo);
        System.out.println("Color = " + this.color);
        System.out.println("Cilindraje = " + this.cilindraje);
        System.out.println("Capacidad de Tanque = " + this.capacidadTanque);
    }

    public String acelerar(int rpm) {
        return "El auto " + this.fabricante + " acelerando a " + rpm + " rpm";
    }

    public String frenar() {
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    public float calcularConsumo(int km, float porcentaje) {
        return km / (porcentaje * this.capacidadTanque);
    }

}
