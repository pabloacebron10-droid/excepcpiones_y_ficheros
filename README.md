# Unidad: Excepciones y Ficheros de Texto

## Descripción general

Esta unidad aborda la gestión de errores y la manipulación de datos mediante **excepciones** y **ficheros de texto** en Java. Las actividades están diseñadas para que el estudiante:

- Aprenda a manejar situaciones inesperadas en tiempo de ejecución usando `try-catch`, `throw` y `throws`.
- Comprenda la diferencia entre **excepciones verificadas** (checked) y **no verificadas** (unchecked).
- Interactúe con ficheros de texto para **leer, escribir y modificar datos** de manera segura.

---

## Objetivos de la unidad

- Comprender la importancia del manejo de errores en programas robustos.  
- Aplicar estructuras `try-catch-finally` para controlar excepciones.  
- Crear métodos que lancen excepciones personalizadas y manejar entradas inválidas.  
- Leer y escribir información en **ficheros de texto**, utilizando `FileReader`, `FileWriter`, `BufferedReader` y `BufferedWriter`.  
- Garantizar la correcta liberación de recursos mediante `try-with-resources`.

---

## Conceptos clave

1. **Excepciones en Java**
   - **Checked:** Deben ser declaradas o manejadas (`IOException`, `FileNotFoundException`).  
   - **Unchecked:** No requieren declaración (`ArithmeticException`, `InputMismatchException`).  
   - Uso de `throw` para lanzar excepciones personalizadas.  
   - Uso de `throws` para declarar excepciones que un método puede generar.

2. **Entrada por teclado y validación**
   - Manejo de entradas inválidas mediante `InputMismatchException`.  
   - Recursión o bucles para solicitar entradas válidas.  
   - Uso correcto de `Scanner` para evitar bloqueos.

3. **Ficheros de texto**
   - Lectura: `FileReader` y `BufferedReader`.  
   - Escritura: `FileWriter` y `BufferedWriter`.  
   - Apertura y cierre seguro de ficheros (`try-with-resources`).  
   - Formato de texto simple para almacenamiento y recuperación de datos.

---

## Buenas prácticas

- Declarar un **Scanner único y global** cuando se use en múltiples métodos.  
- Limpiar buffer con `nextLine()` después de `InputMismatchException`.  
- Preferir bucles iterativos sobre recursión para entradas muy largas.  
- Declarar excepciones con `throws` cuando un método puede generar errores de lectura/escritura.  
- Usar `try-with-resources` para asegurar el cierre de ficheros.

---

## Estructura típica de las actividades

1. **Lectura de datos del usuario**  
   - Métodos que solicitan números o cadenas con validación.  

2. **Procesamiento de datos**  
   - Cálculos, filtrado o transformación de los datos leídos.  

3. **Persistencia en ficheros**  
   - Escritura de datos en archivos de texto.  
   - Lectura de datos previamente guardados.  

4. **Control de excepciones**  
   - Bloques `try-catch` para capturar errores de entrada y ficheros.  
   - Uso de `finally` o `try-with-resources` para liberar recursos automáticamente.

---

## Instalación

1. Clonar el repositorio:

```bash
git clone https://github.com/tuusuario/ectepciones-ficheros.git