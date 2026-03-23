public class EjemploAutomovil {
    public static void main(String[] args) {

//        Automovil subaru = new Automovil();
//        subaru.setFabricante("Subaru");
//        subaru.setColor("Rojo");
//        subaru.setModelo("Impreza");
//        subaru.setCapacidadTanque(3000);
//        subaru.setCilindraje(2.0);
//        subaru.verDetalle();

//        Automovil mazda = new Automovil();
//        mazda.fabricante = "Mazda";
//        mazda.modelo = "BT-50";
//        mazda.cilindraje = 3.0;
//        mazda.color = "Negro";
//        mazda.verDetalle();
//        System.out.println(mazda.acelerar(3000));
//        System.out.println(mazda.frenar());
//        System.out.println("Kilometraje por litro = " + mazda.calcularConsumo(300, 0.6f));

        Automovil skoda = new Automovil(
                "Skoda",
                "Octavia",
                "Plomo",
                2.0,
                3000
        );

        skoda.verDetalle();
        Automovil.setMatricula(2025);
        System.out.println("Matricula = " + Automovil.getMatricula());

        System.out.println(skoda);

    }
}
