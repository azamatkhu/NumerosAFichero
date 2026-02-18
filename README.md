# Ejercicio NumerosAFichero

**NÚMEROS A FICHERO (NAF)**
**Dado un número entero positivo N. 

**Utilizando el principio SOLID SRP, generar un fichero de texto llamado salida.txt
En dicho fichero deben aparecer N líneas.**

**En la línea i (siendo i desde 1 hasta N) deben escribirse los números desde 1 hasta i, en la 
misma línea, sin separadores adicionales excepto un espacio entre números.**

**Ejemplo:
Si se introduce el número 3**

**El contenido del fichero será:
**1**
**1 2**
**1 2 3**

Primero, he creado la claseCreadorFichero, que sirve para crear el fichero. En ello aplico la logica de creacion de lineas con los numeros.
Con un metodo de _crearFichero(String archivo, List<Integer> numeros)_, en cual voy a pasar un nombre de archivo y la lista con numeros, puedo guardar estos numeros.
Para que sea la estructura como se pida, uso un bucle for y despues de cada iteracion se añade los numeros a la linea con espacio:

_linea += i;_

_linea += " ";_

Otra clase GeneradorNumeros me sirve para generar los numeros pidiendo al usuario. No es algo especial, es solo un ArrayList de tipo Integer, en que con un bucle for guardo los numeros.

En clase MainNumerosAFichero, solo solicito al usuario que escribe el nombre del fichero y el numero que quiere.

