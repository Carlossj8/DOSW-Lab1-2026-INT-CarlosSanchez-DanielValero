# Evidencias Laboratorio #01 - DOSW Company

**Integrantes:**
- Carlos Sanchez
- Daniel Valero


---

## Parte 3: Hackathon Express

## Reto 1 — La Bienvenida

**Solución:** Se creó la clase `Estudiante` como modelo (POO) con los atributos nombre, edad, semestre y correo. La clase `MensajeBienvenida` recibe la lista de estudiantes y usa `stream().map().collect(Collectors.joining(...))` para construir el texto de presentación y la lista de correos, uniendo todo en un único mensaje impreso desde `Reto1`. Los datos de cada estudiante se leen por consola con `Scanner`.

**Evidencia:**
  ![Evidencia Reto 1](./Laboratorio1/evidencias/fotosEvidencias/Reto1.png)

## Reto 2 — Carrera en Paralelo

**Solución:** Se calculó el mínimo y la cantidad de datos con expresiones lambda (`stream().min()`, `stream().count()`), y el máximo con `reduce()`. Luego se combinaron los resultados para mostrar máximo, mínimo, cantidad, si el máximo es múltiplo o divisor de 2, y si la cantidad es par o impar.

**Nota:** Todavia no sabiamos bien trabajar con merge, y, hicimos el codigo de formas diferentes. Pero aprendimos de esto para los siguientes retos

**Merge:** El conflicto principal ocurrió en `Reto2.java`, ya que ambos integrantes aportaban lógica al mismo archivo. Se resolvió integrando manualmente el cálculo del mínimo/cantidad de un integrante con el cálculo del máximo (`Carril1`) del otro, dentro del método `procesarLista()`.

**Evidencia:**
![Evidencia Reto 2](./Laboratorio1/evidencias/fotosEvidencias/Reto2.png)

## Reto 3 — La Máquina de los Códigos Secretos

**Solución:** Se crearon dos clases independientes: `CanalA`, que usa `StringBuilder` para amplificar el mensaje (repetirlo 3 veces), procesando las repeticiones con `stream()` y `Collectors.joining(" ")`; y `CanalB`, que usa `StringBuffer` para invertir el mensaje. En `Reto3`, ambos canales se combinan con una lambda que primero amplifica y luego invierte el mensaje, ejecutada dentro de un `stream()`.

**Merge:** Cada integrante trabajó en su propio archivo (`CanalA.java` y `CanalB.java` por separado), por lo que no hubo conflicto en esas clases. El conflicto se dio únicamente en `Reto3.java`, donde cada uno tenía su propio `main()` de prueba; se resolvió combinando ambos flujos en un solo `main()` que usa los dos canales y aplica la función de descifrado combinada.

**Evidencia:**
![Evidencia Reto 3](./Laboratorio1/evidencias/fotosEvidencias/Reto3.png)

## Reto 4 — El Tesoro de las Llaves Duplicadas

**Solución:** `EstudianteA` almacena los pares (clave, valor) ingresados por consola en un `HashMap`, usando `putIfAbsent()` para conservar el primer valor en caso de claves repetidas. `EstudianteB` hace lo mismo con un `Hashtable`. En `Reto4`, se combinan ambos mapas con `putAll()` (el `Hashtable` sobrescribe en caso de conflicto de clave), y el resultado se imprime ordenado alfabéticamente y en mayúsculas usando `stream()`, `sorted(Map.Entry.comparingByKey())` y `map()`.

**Merge:** `EstudianteA.java` y `EstudianteB.java` no tuvieron conflicto al ser archivos separados. El conflicto en `Reto4.java` (cada integrante tenía su propia versión del `main()`) se resolvió construyendo un único flujo: primero se piden los datos de ambos estudiantes por `Scanner`, luego se combinan los mapas y se imprime el resultado final ordenado.

**Evidencia:**
![Evidencia Reto 4](./Laboratorio1/evidencias/fotosEvidencias/Reto4.png)


## Reto 5 — Batalla de Conjuntos

**Solución:** `EstudianteA` almacena números en un `HashSet` y filtra los múltiplos de 3 con `stream().filter()`. `EstudianteB` hace lo mismo con un `TreeSet`, filtrando los múltiplos de 5. En `Reto5`, ambos conjuntos filtrados se combinan en un `TreeSet` final (que garantiza orden ascendente y ausencia de duplicados), y se imprime cada número con una lambda (`forEach`).

**Merge:** Cada integrante mantuvo su propia clase (`EstudianteA.java`, `EstudianteB.java`) sin conflicto. El único punto de integración fue `Reto5.java`, donde se resolvió el conflicto uniendo ambos conjuntos filtrados en un `TreeSet` combinado y dejando un único bloque de impresión final.

**Evidencia:**
![Evidencia Reto 5](./Laboratorio1/evidencias/fotosEvidencias/Reto5.png)


## Reto 6 — La Máquina de Decisiones

**Solución:** `EstudianteA` implementa con `switch-case` los comandos SALUDAR, DESPEDIR, CANTAR y DANZAR; `EstudianteB` implementa BROMEAR, GRITAR, SUSURRAR y ANALIZAR. Cada comando, en vez de imprimir directamente, retorna un `Runnable` (lambda) con la acción a ejecutar. En `Reto6`, se construye un único `Map<String, Runnable>` uniendo los comandos de ambos estudiantes (usando `Stream.of().forEach()` para poblarlo), y se leen por `Scanner` los comandos a ejecutar, usando `getOrDefault()` para manejar comandos no reconocidos.

**Merge:** `EstudianteA.java` y `EstudianteB.java` no tuvieron conflicto. El conflicto en `Reto6.java` (ambos tenían su propio `main()`) se resolvió combinando los comandos de ambos fragmentos en el mismo `Map<String, Runnable>`, dejando un único bucle de lectura y ejecución por consola.

**Evidencia:**
![Evidencia Reto 6](./Laboratorio1/evidencias/fotosEvidencias/Reto6.png)

## Reto 7 — El Juego del Calamar

**Solución:** Se creó primero la clase compartida `Jugador` (POO), con los atributos número, nombre, deuda, premio y estado. `EstudianteA` implementa la Prueba 1 (Luz Roja Luz Verde), eliminando con `stream().filter().collect()` —sin bucle `for`— a los jugadores con deuda mayor a 170.000.000. `EstudianteB` implementa la Prueba 2 (Los Dados), asignando un dado aleatorio a cada jugador y dejando avanzar solo a los que sacan número par. La Prueba 3 (Puente de Cristal) se resolvió en conjunto en `Reto7`, usando solo lambdas para filtrar por longitud del nombre. Finalmente, se calcula el premio acumulado (+50.000.000 por cada eliminado en pruebas 1 y 2, +100.000.000 por eliminado en prueba 3) y se reparte entre los ganadores si hay más de uno.

**Merge:** Se acordó crear primero `Jugador.java` en conjunto para que ambos partieran de la misma clase base y evitar conflictos ahí. `EstudianteA.java` y `EstudianteB.java` se desarrollaron en paralelo sin conflicto al ser archivos independientes. El conflicto principal se dio en `Reto7.java`, donde ambos tenían su propia versión del flujo completo; se resolvió integrando las tres pruebas en secuencia (Prueba 1 → Prueba 2 → Prueba 3), imprimiendo en cada una tanto los jugadores que pasan como los eliminados, y unificando el cálculo final del premio.

**Evidencia:**
![Evidencia Reto 7](./Laboratorio1/evidencias/fotosEvidencias/Reto7.png)