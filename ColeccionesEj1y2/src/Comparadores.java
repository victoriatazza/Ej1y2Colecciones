import java.util.Comparator;

public class Comparadores {
    public static Comparator<String> ordenarPorNombreAsc = new Comparator<String>() {
        @Override
        public int compare(String raza1, String raza2) {
            return raza1.compareTo(raza2);
        }
    };
}
