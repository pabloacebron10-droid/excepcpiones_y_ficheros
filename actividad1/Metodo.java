package actividad1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Metodo {

    static Scanner sc = new Scanner(System.in);
    
    static Integer leerEntero(Integer num){
        try {
            num = pedirNumero();
            if(num != -1){
                System.out.println("=== Número: " + num + " guardado correctamente ===\n");
            }

        } catch (InputMismatchException e) {
            System.out.println("Debes introducir un número, prueba otra vez: \n");
            sc.nextLine();
            num = leerEntero(num);
        } 
        return num;
    }

    static private Integer pedirNumero() throws InputMismatchException{
        System.out.print("Introduce un número: ");
        Integer num = sc.nextInt();
        return num;
    }
}
