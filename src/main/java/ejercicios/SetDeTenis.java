package ejercicios;

import java.util.Scanner;
public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasB) {
        String respuesta;
        if (numVictoriasA == 7 && (numVictoriasB == 5 || numVictoriasB == 6)) {
            respuesta = "Ganó A";
        }else if (numVictoriasB == 7 && (numVictoriasA == 5 || numVictoriasA == 6)){
            respuesta = "Ganó B";
        }else if (numVictoriasA == 6 && numVictoriasB <= 4){
            respuesta = "Ganó A";
        }else if (numVictoriasB == 6 && numVictoriasA <= 4){
            respuesta = "Ganó B";
        }else if (numVictoriasA <= 6 && numVictoriasB <= 6){
            respuesta = "Aún no termina";
        }else if (numVictoriasA > 7 || numVictoriasB > 7 || (numVictoriasA == 7 && numVictoriasB < 5) || (numVictoriasB == 7 && numVictoriasA < 5)){
            respuesta = "Inválido";
        }else {
            respuesta = "Inválido";
        }
        return respuesta;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Los juegos ganados por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganados por B:");
        int numVictoriasB = lector.nextInt();
        
        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}
