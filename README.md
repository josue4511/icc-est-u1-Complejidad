# Universida Politecnica Salesiana 
# Estructura de datos
## Estudinate: Jordan sagbay 
## TEORIA DE LA COMPLEJIDAD 
### Fecha: 26/04/2026
### Que es la notacion Big O
a notación Big O es el lenguaje que usamos en la computación para describir el rendimiento o la complejidad de un algoritmo.

En lugar de medir el tiempo exacto en segundos que depende del procesador o la memoria, la Big O mide cómo aumenta el tiempo de ejecución o el uso de memoria a medida que crece el tamaño de los datos de entrada denominado n.
### Tipos de notaciones
### 1. Big O (O): El Techo (Peor Caso)
Es la cota superior. Nos dice que el algoritmo nunca será más lento que esta función 
enfocando garantia en su rendmiento un ejemplo puede ser que exite 30 min en limite de timpo para realizar una activada podria ser 10, 20 pero nunca mas de 30 
### 2. Big Omega (Ω): El Suelo (Mejor caso)
Representa el mejor de los casos. Nos dice cuál es la velocidad máxima teórica que el algoritmo puede alcanzar con los mejores datos posibles. Para saber qué tan rápido puede llegar a ser un algoritmo si todo sale perfecto.un ejemplo de analogia  "Llegaré a tu casa en al menos 10 minutos es imposible que llegue antes, aunque no haya tráfico".
### 3. Big Theta (Θ): El Rango Exacto (Caso Promedio)
Es la cota ajustada. Ocurre cuando el límite superior y el inferior son el mismo. Encierra a la función por ambos lados.

Enfoque: Comportamiento preciso.

Ejemplo: Si un algoritmo es Θ(nlogn), significa que su tiempo de ejecución crece exactamente a ese ritmo, sin importar si los datos son favorables o no.

Comparación con una analogía de viaje

Imagina que vas de una ciudad a otra en auto:

Omega (Ω): "Llegaré en al menos 2 horas". Es imposible llegar antes por los límites de velocidad.

Big O (O): "Llegaré en máximo 5 horas". (Aun si hay tráfico o un accidente, no tardaré más de eso).

Theta (Θ): "El viaje dura exactamente entre 3 y 3.5 horas". (Es una estimación precisa del comportamiento real).

### Mejor Caso (Best Case)
Es el escenario donde el algoritmo realiza la mínima cantidad de trabajo posible. Ocurre cuando los datos de entrada tienen la estructura ideal para el código.

•	En la búsqueda lineal: El número que buscas es el primero de la lista.

•	Complejidad: Ω(1) (Constante).

•	Utilidad: En la práctica, se usa poco porque no puedes confiar en que los datos siempre vendrán "perfectos".
#### 2. Peor Caso (Worst Case)
Es el escenario donde el algoritmo realiza la máxima cantidad de trabajo. Es el más importante en computación porque define el límite de seguridad.

•	En la búsqueda lineal: El número que buscas es el último de la lista o ni siquiera existe. Tienes que recorrer los n elementos.

•	Complejidad: O(n) (Lineal).
•	Utilidad: Es el estándar de la industria. Si sabes que tu peor caso es aceptable, garantizas que tu programa nunca será más lento que eso.
### 3. Caso Promedio (Average Case)
Es lo que sucede en el "mundo real". Se calcula asumiendo que los datos de entrada están distribuidos de forma aleatoria. Requiere un análisis matemático más complejo.

•	En la búsqueda lineal: En promedio, encontrarías el número cerca de la mitad de la lista (n/2).

•	Complejidad: Θ(n) (Sigue siendo lineal, ya que en notación asintótica ignoramos la división por 2).

•	Utilidad: Ayuda a predecir el rendimiento diario del software bajo condiciones normales.

### 1. O(1) - Constante (El acceso directo)


Definición: El tiempo de ejecución es independiente del tamaño del conjunto de datos.

En el código: Al hacer return arr[0], el equipo solo realiza una operación de lectura en memoria. No importa si el arreglo tiene diez elementos o diez billones, la dirección de memoria del primer índice se calcula instantáneamente.
### 2. O(logn) - Complejidad Logarítmica

Definición: En cada paso, el algoritmo reduce el tamaño de los datos a procesar (generalmente a la mitad).

En el código: La Búsqueda Binaria divide el arreglo por la mitad. Si el valor no está en el medio, descarta la mitad donde sabe que no puede estar.

Escalabilidad: Es extremadamente eficiente. Para buscar en 1,000,000 de elementos, solo necesita unos 20 pasos (2^20 ≈1,000,000).
### 3. O(n) - Complejidad Lineal

Definición: El tiempo de ejecución crece en proporción directa al tamaño de la entrada.

En el código: Un bucle for que recorre el arreglo de inicio a fin. Si duplicas el número de elementos, el tiempo de ejecución se duplica exactamente.
### 4. O(nlogn) - Linearithmic 

Definición: Es el resultado de ejecutar un algoritmo logarítmico n veces.

En el código: Algoritmos de ordenamiento como Arrays.sort() (basados en Quicksort o Mergesort). Dividen el problema (log n) y procesan cada elemento (n). Es el estándar de oro para ordenar datos de forma eficiente.
### 5. O(n^2) - Complejidad Cuadrática

Definición: El tiempo de ejecución es proporcional al cuadrado del tamaño de la entrada.

En el código: El Bubble Sort. Tiene un bucle anidado. Por cada elemento del arreglo (n), vuelve a recorrer el arreglo completo (n).

Impacto: Si n=1,000, realizas 1,000,000 de operaciones. Se vuelve ineficiente muy rápido.
### 6. O(n 3) - Complejidad Cúbica

Definición: El tiempo crece al cubo de la entrada.

En el código: Tres bucles anidados. Es común en multiplicaciones de matrices básicas o en la búsqueda de combinaciones de tres elementos.
Impacto: Si n=1,000, el procesador debe hacer 1,000,000,000 (mil millones) de operaciones.
### 7. O(2n) - Complejidad Exponencial

Definición: El crecimiento se duplica con cada unidad adicional en n.

En el código: El cálculo de Fibonacci recursivo. Cada llamada a la función genera dos llamadas adicionales. Esto crea un árbol de llamadas que crece masivamente.

Riesgo: Un n=40 ya puede tardar varios segundos o minutos, dependiendo de la potencia del procesador.

### 8. O(n!) - Complejidad Factorial

Definición: El tiempo crece según el producto de todos los números enteros hasta n.

En el código: Generar permutaciones. Para encontrar todas las formas de ordenar una cadena, el algoritmo debe explorar cada ruta posible.

Riesgo: Es la complejidad más costosa. Solo es viable para valores de n muy pequeños (menores a 12 o 13 habitualmente).
## Conluciones.
### ¿Qué complejidad es más costosa y por qué?
### ¿Qué aprendieron del análisis?
### ¿Qué les sorprendió más al ver el código?
### Lo que ustedes crean conveniente
