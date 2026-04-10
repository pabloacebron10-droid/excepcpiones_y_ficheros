package actividad3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        BufferedReader lector = null;

        try {
            lector = new BufferedReader(
                new FileReader("C:\\JAVA\\excepciones_y_ficheros\\src\\main\\java\\actividad1\\Main.java")
            );

            String linea = lector.readLine();

            while (linea != null) {
                System.out.println(linea);
                linea = lector.readLine();
            }

            lector.close();

        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
    }
}
