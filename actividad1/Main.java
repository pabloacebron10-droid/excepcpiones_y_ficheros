package actividad1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Este programa te permite leer tantos números como quieras.\nIntroduce: \"-1\" si deseas salir\n");
        Integer num= 0;
        while(num != -1){
        num = Metodo.leerEntero(num);
        }
        System.out.println("\nSaliendo...");
    }
}