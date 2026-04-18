Métodos Lambdas
Proyecto de práctica que implementa 10 métodos utilitarios en dos clases: metodosInt para enteros y metodosStrings para cadenas. El Main demuestra cada método con casos normales y casos edge.

Métodos
metodosInt

elMultiplicador: multiplica todos los elementos de una lista por un factor dado.
cuadradosUnicos: devuelve un conjunto con el cuadrado de cada elemento, sin duplicados.
topeFrecuencias: limita los valores de un mapa de frecuencias a un máximo dado.

metodosStrings

filtroSelectivo: elimina de la lista los elementos que empiecen con cierta letra o sean más cortos que una longitud mínima.
convertidorAMayusculas: devuelve una nueva lista con todas las cadenas en mayúsculas.
mapaLongitudes: devuelve un mapa con cada palabra y su longitud.
catalogo: imprime cada artículo de un inventario con un 10% de descuento aplicado.
contadorDeFrecuencias: cuenta cuántas veces aparece cada palabra en una lista.
filtradorDeFrecuencias: devuelve las palabras que aparecen al menos un número de veces dado.
deDuplicador: devuelve las palabras únicas de una frase que superen una longitud mínima.


Compilación y ejecución
Requiere Java 21 o superior por el uso de void main() (Ya busqué porque me sugirió InteliJ el main de esa forma). 
javac Main.java metodosInt.java metodosStrings.java
java Main

Ejemplo de salida
elMultiplicador
  Antes : [1, 2, 3, 4, 5]
  Después (x3): [3, 6, 9, 12, 15]

filtroSelectivo (letra='a', longitud=5)
  Antes : [ajolote, hermano, ajo, Diego, sol]
  Después: [hermano]

convertidorAMayusculas
  Entrada : [hermano, Diego, banana]
  Salida  : [HERMANO, DIEGO, BANANA]

cuadradosUnicos
  Entrada: [1, 2, 2, 3, 3, 4, -3]
  Salida : [1, 4, 9, 16]

mapaLongitudes
  Entrada: [hermano, banana, sol]
  Salida : {hermano=7, banana=6, sol=3}

catalogo (precios con 10% de descuento)
Gan 251m Pro
31.491
Weilong V11 8mg
37.791

contadorDeFrecuencias
  Entrada: [ajo, Hermano, Diego, Diego, ajo, Diego, ajo]
  Salida : {ajo=3, Hermano=1, Diego=3}

filtradorDeFrecuencias
  Umbral 1: [ajo, Hermano, Diego]
  Umbral 3: [ajo, Diego]

deDuplicador
  Frase: "hola como estamos flipo flipo chaval" (umbral=5)
  Salida: [estamos, chaval, flipo]

topeFrecuencias
  Antes (maxFreq=3): {ajo=3, Hermano=1, Diego=3}
  Después          : {ajo=3, Hermano=1, Diego=3}
