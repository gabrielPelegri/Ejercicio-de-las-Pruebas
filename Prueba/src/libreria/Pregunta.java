package libreria;

import java.util.Scanner;

import facade.DevuelveIniciales;

public class Pregunta {
    public static ClaseCadena preguntar(Scanner teclado) {
        System.out.println("¿Nombre?");
        String nombre = "";
        while (true) {
            nombre = teclado.next();
            if (nombre.matches("^[a-zA-Z]*$")) {
                break;
            }
        }
        System.out.println("¿Apellido?");
        String apellido = "";
        while (true) {
            apellido = teclado.next();
            if (apellido.matches("^[a-zA-Z]*$")) {
                break;
            }
        }
        ClaseCadena cadena = new ClaseCadena(nombre, apellido);
        return cadena;
        
    }
}
