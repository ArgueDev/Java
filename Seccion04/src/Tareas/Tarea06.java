package Tareas;

/*
* Obtener el nombre más largo de tres personas, según los siguientes requerimientos
* Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos usando la clase JOptionPane y método showInputDialog().
* Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres) (Imprimir solo uno de los tres, el de más caracteres en el nombre.)
* Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y con el índice cero accedemos al nombre de la persona.
* Restricción no usar loops en el desarrollo de la tarea.
* Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."
* */

import javax.swing.*;

public class Tarea06 {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog("Ingrese el primer Nombre Completo");
        String nombre2 = JOptionPane.showInputDialog("Ingrese el segundo Nombre Completo");
        String nombre3 = JOptionPane.showInputDialog("Ingrese el tercer Nombre Completo");

        String[] soloNombre1 = nombre1.split(" ");
        String[] soloNombre2 = nombre2.split(" ");
        String[] soloNombre3 = nombre3.split(" ");

        int longNombre1 = soloNombre1[0].length();
        int longNombre2 = soloNombre2[0].length();
        int longNombre3 = soloNombre3[0].length();

        String nombreLargo;

        if (longNombre1 >= longNombre2 && longNombre1 >= longNombre3) {
            nombreLargo = nombre1;
        } else if (longNombre2 >= longNombre1 && longNombre2 >= longNombre3) {
            nombreLargo = nombre2;
        } else {
            nombreLargo = nombre3;
        }

        JOptionPane.showMessageDialog(null, nombreLargo + ", tiene el nombre mas largo");
    }
}
