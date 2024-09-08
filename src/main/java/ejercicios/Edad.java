
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;

import java.time.Period;
import java.util.Scanner;
import java.time.LocalDate;

public class Edad {
    public static String evaluar(int dia, int mes, int anno) {
        String respuesta = "";
        LocalDate fechaNacimiento = LocalDate.of(anno, mes, dia);
        LocalDate fechaActual = LocalDate.now();
        Period period = Period.between(fechaNacimiento, fechaActual); //Explicación: Se usa metodo period para obtener la cantidad de años, con la finalidad de simplificar el proceso.
        int edad = period.getYears();
        respuesta = "Usted tiene " + edad + " años";
        return respuesta;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Día:");
        int dia = lector.nextInt();
        System.out.print("Mes:");
        int mes = lector.nextInt();
        System.out.print("Año:");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(dia, mes, anno);
        System.out.println(respuesta);
    }
}
