package libreria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClaseCadena {
    String nombre;
    String apellido;

    public ClaseCadena(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return this.nombre;

    }

    public String getApellido() {
        return this.apellido;
    }

    
}
