package Tarea;
/*
* Para esta tarea se pide ingresar una fecha de nacimiento en formato string, convertirla a una fecha del tipo
* java.util.Date y calcular la edad de la persona de acuerdo a la fecha actual.
* Intentar usar solo lo visto hasta el momento, no el api de java 8 que lo veremos más adelante, también se pueden
* apoyar de google que hay varios ejemplos.
* */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CalcularEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese su fecha de nacimiento utilizando este formato 'yyyy-MM-dd'");
        System.out.print("--> : ");

        try {
            Date fechaNacimiento = formato.parse(sc.next());

            long diferencia = fechaActual.getTime() - fechaNacimiento.getTime();
            TimeUnit time = TimeUnit.MILLISECONDS;
            long edad = time.toDays(diferencia) / 365;

            System.out.println("Su edad es: " + edad + " años");

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
