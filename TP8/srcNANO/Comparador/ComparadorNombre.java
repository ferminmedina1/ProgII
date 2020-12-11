import java.util.Comparator;

public class ComparadorNombre implements Comparator<ElementoSA> {
    @Override
    public int compare(ElementoSA elem1, ElementoSA elem2) {
        return elem1.getNombre().compareTo(elem2.getNombre());
    }
}
