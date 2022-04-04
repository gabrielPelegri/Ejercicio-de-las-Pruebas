import java.util.Scanner;

import facade.DevuelveIniciales;
import libreria.*;
import facade.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        DevuelveIniciales.devolver(Pregunta.preguntar(teclado));
    }
}
