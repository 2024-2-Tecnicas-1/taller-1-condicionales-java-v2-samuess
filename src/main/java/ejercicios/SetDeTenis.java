package ejercicios;

import java.util.Scanner;
public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasB) {
        if (numVictoriasA == 7 && (numVictoriasB == 5 || numVictoriasB == 6)) {
            System.out.println("Ganó A");
        }else if (numVictoriasB == 7 && (numVictoriasA == 5 || numVictoriasA == 6)){
            System.out.println("Ganó B");
        }else if (numVictoriasA == 6 && numVictoriasB <= 4){
            System.out.println("Ganó A");
        }else if (numVictoriasB == 6 && numVictoriasA <= 4){
            System.out.println("Ganó B");
        }else if (numVictoriasA <= 6 && numVictoriasB <= 6){
            System.out.println("Aún no termina");
        }else if (numVictoriasA > 7 || numVictoriasB > 7 || (numVictoriasA == 7 && numVictoriasB < 5) || (numVictoriasB == 7 && numVictoriasA < 5)){
            System.out.println("Inválido");
        }else {
            System.out.println("Inválido");
        }
        return "";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Los juegos ganador por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganador por B:");
        int numVictoriasB = lector.nextInt();
        
        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}
