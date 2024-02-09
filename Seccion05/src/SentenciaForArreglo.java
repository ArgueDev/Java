import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {
//        String[] nombres = new String[6];
        String[] nombres = {"Christian", "Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        int count = nombres.length;
        
        for(int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase("Christian") || nombres[i].equalsIgnoreCase("pepa")){
                continue;
            }
            System.out.println(i + " - " + nombres[i]);
        }
        
        String buscar = JOptionPane.showInputDialog("Ingrese un Nombre, ejemplo 'Pepe' o 'Maria'");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for(int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }

        if (encontrado){
            JOptionPane.showMessageDialog(null, "Fue encontrado: " + buscar);
        }else {
            JOptionPane.showMessageDialog(null, "No existe: " + buscar);
        }
    }

}
