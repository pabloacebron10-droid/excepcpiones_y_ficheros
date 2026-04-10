package actividad4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String args[]){
        double suma = 0;
        int contador = 0;

        try {
            BufferedReader lector = new BufferedReader(
                new FileReader("C:\\JAVA\\excepciones_y_ficheros\\NumerosReales.txt")
            );

            String linea = lector.readLine();

            while (linea != null) {

                String[] numeros = linea.split(" ");

                for (String n : numeros) {
                    double valor = Double.parseDouble(n);
                    suma += valor;
                    contador++;
                }

                linea = lector.readLine();
            }

            lector.close();

            double media = suma / contador;

            System.out.println("Suma: " + suma);
            System.out.println("Media: " + media);

        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
    }
}
