package actividad7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class actividad7 {
    public static void main(String[] args) {
        final String RUTA = "C:\\JAVA\\excepciones_y_ficheros\\src\\main\\java\\actividad7";
        String nombreArchivo = "";
        String nombreCopia = "";

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduce el nombre del archivo que quieres copiar: ");
            nombreArchivo = sc.nextLine();
            nombreCopia = "copia_de_" + nombreArchivo;

            try(BufferedReader lector = new BufferedReader(new FileReader(RUTA + "\\" + nombreArchivo));
                BufferedWriter escritor = new BufferedWriter(new FileWriter(RUTA + "\\"+ nombreCopia))){
                    String linea;
                    while ((linea = lector.readLine()) != null){
                        escritor.write(linea);
                        escritor.newLine();
                    }   
            
            System.out.println("Copia guardada correctamente " + nombreCopia);

            } catch (IOException e){
                System.out.println("Error: " + e.getMessage());
            }

        }
    }
}
