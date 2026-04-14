# Actividad 1: Método `leerEntero()`

## Enunciado original

1. Escribir el método:

**`Integer leerEntero()`**

- Que pida un entero por consola, lo lea del teclado y lo devuelva.  
- Si la cadena introducida por consola no tiene el formato correcto, muestra un mensaje de error y vuelve a pedirlo.  
- Haz una versión donde el método utilice `throws`.  
- ¿Podrías hacerlo de manera recursiva?

---

## Mi solución

Mi versión implementa el método de forma **recursiva** y con **manejo de excepciones**:

- Si el usuario introduce un valor que no es número, se captura la excepción (`InputMismatchException`) y se muestra un mensaje de error.  
- El método se llama a sí mismo hasta que el usuario introduzca un número válido.  
- Se imprime un mensaje de confirmación por cada número válido.  
- Permite leer tantos números como se desee ,terminando la lectura usando `-1` como valor de salida.

---

## Código principal

Main.java

```java
Integer num = 0;
while(num != -1){ 
    num = Metodo.leerEntero(num);
}
System.out.println("\nSaliendo...");
