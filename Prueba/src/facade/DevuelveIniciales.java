package facade;
import javax.jws.soap.InitParam;

import libreria.ClaseCadena;


public class DevuelveIniciales {
    public static void devolver(ClaseCadena cadena){
        char incialNombre=cadena.getNombre().charAt(0);
        char incialApellido=cadena.getApellido().charAt(0);
        System.out.println(incialNombre + "." + incialApellido);
        

    }
}
