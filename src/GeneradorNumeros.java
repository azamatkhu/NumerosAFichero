import java.util.ArrayList;
import java.util.List;

public class GeneradorNumeros {
    public static List<Integer> generarNumeros(int numero) {
        List<Integer> numeros = new ArrayList<Integer>();

        for (int i = 1; i <= numero; i++) {
            numeros.add(i);
        }

        return numeros;
    }
}
