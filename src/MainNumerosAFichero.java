import java.util.*;
import java.io.*;

public class MainNumerosAFichero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el nombre del archivo: ");
        String nombreArchivo = sc.nextLine();

        System.out.println("Escribe el numero: ");
        int numero = sc.nextInt();

        List<Integer> numeros = GeneradorNumeros.generarNumeros(numero);
        CreadorFichero.crearFichero(nombreArchivo, numeros);
    }
}