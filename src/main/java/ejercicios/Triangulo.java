package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

public class Triangulo {
    public static String evaluar(double a, double b, double c) {
        String respuesta = "";
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            if (a == b && b == c) {
                respuesta = "El triángulo es equilátero";
            }else if (a == b || b == c || a == c) {
                respuesta = "El triángulo es isósceles";
            }else {
                respuesta = "El triángulo es escaleno";
            }
        }else {
            respuesta = "No es un triángulo válido";
        }
        return respuesta;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("a:");
        double a = lector.nextDouble();
        System.out.print("b:");
        double b = lector.nextDouble();
        System.out.print("c:");
        double c = lector.nextDouble();
        
        String respuesta = evaluar(a, b, c);
        System.out.println(respuesta);
    }
}
