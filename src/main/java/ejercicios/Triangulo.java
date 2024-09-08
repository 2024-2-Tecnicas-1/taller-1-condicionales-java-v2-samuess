package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Triangulo {
    public static String evaluar(double a, double b, double c) {
        String respuesta = "";
        if (a == b && b == c){
            respuesta = "equilátero";
        }else if ((a + b > c) && (a + c > b) && (b + c > a)){
            respuesta = "No es un triángulo válido";
        }else if (a == b || b == c || a == c){
            respuesta = "isósceles";
        }else{
            respuesta = "escaleno";
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
