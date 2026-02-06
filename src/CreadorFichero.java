import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CreadorFichero {
    public static void crearFichero(String archivo, List<Integer> numeros) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            System.out.println("Guardando...");

            String linea = "";

            for (int i = 1; i <= numeros.size(); i++) {
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
