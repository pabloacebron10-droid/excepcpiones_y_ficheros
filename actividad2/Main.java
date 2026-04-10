package actividad2;

import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        FileReader lector = null;
        try {
            lector = new FileReader(
                "C:\\JAVA\\excepciones_y_ficheros\\src\\main\\java\\actividad1\\Main.java"
            );

            int caracter = lector.read();

            while (caracter != -1) {
                System.out.print((char) caracter);
                caracter = lector.read();
            }

            lector.close();

        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
    }
}