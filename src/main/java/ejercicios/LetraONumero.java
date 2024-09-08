
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class LetraONumero {
    public static String evaluar(char caracter) {
        String respuesta = "";
        if (Character.isDigit(caracter)){
            respuesta = "Es número";
        }else if (Character.isLetter(caracter)){
            if (Character.isUpperCase(caracter)){
                respuesta = "Es letra mayúscula";
            }else {
                respuesta = "Es letra minúscula";
            }
        }else {
            respuesta = "No es letra ni número";
        }
        return respuesta;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Caracter:");
        char caracter = lector.next().charAt(0);
        
        String respuesta = evaluar(caracter);
        System.out.println(respuesta);
    }
}
