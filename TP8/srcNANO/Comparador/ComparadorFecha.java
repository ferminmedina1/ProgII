import java.util.Comparator;

public class ComparadorFecha implements Comparator<ElementoSA> {


    @Override
    public int compare(ElementoSA elem1, ElementoSA elem2) {
        return (elem1.getFechaCreacion().compareTo(elem2.getFechaCreacion()));
    }
}
