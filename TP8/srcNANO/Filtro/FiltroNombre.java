import java.lang.reflect.Array;
import java.util.ArrayList;

public class FiltroNombre implements Filtro {

    private String nombre;

    public FiltroNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public boolean cumple(ElementoSA elem) {
        return elem.getNombre().contains(nombre);
    }
}
