import java.util.*;
import java.io.*;

public class MainNumerosAFichero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el nombre del archivo: ");
        String nombreArchivo = sc.nextLine();

        System.out.println("Escribe el numero: ");
        int numero = sc.nextInt();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            System.out.println("Guardando...");

            String linea = "";

            for (int i = 1; i <= numero; i++) {
                linea += i;
                linea += " ";
                writer.write(linea);
                writer.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("El archivo se ha creado!");
    }
}