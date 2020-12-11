import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Carpeta extends ElementoSA {

    private ArrayList<ElementoSA> elementos;


    public Carpeta(String nombre) {
        super(nombre);
        elementos = new ArrayList<ElementoSA>();
    }

    public void agregarElemento(ElementoSA elem) {
        elementos.add(elem);
    }

    public ArrayList<ElementoSA> getElementos() {
        return new ArrayList<>(elementos);
    }

    @Override
    public ArrayList<ElementoSA> buscar(Filtro f) {
        ArrayList<ElementoSA> elementosMismoNombre = new ArrayList<ElementoSA>();
        for (ElementoSA elem : elementos) {
            elementosMismoNombre.addAll(elem.buscar(f));
        }
        if (f.cumple(this))
            elementosMismoNombre.add(this);
        return elementosMismoNombre;
    }

    public ArrayList<ElementoSA> buscar(Filtro f, Comparator c) {
        ArrayList<ElementoSA> elementosMismoNombre = new ArrayList<ElementoSA>();
        for (ElementoSA elem : elementos) {
            elementosMismoNombre.addAll(elem.buscar(f));
        }
        if (f.cumple(this))
            elementosMismoNombre.add(this);
        Collections.sort(elementosMismoNombre, c);
        return elementosMismoNombre;
    }

    @Override
    public double getTamanio() {
        double tamanio = 0;
        for (ElementoSA elem:elementos) {
            tamanio += elem.getTamanio();
        }
        return tamanio;
    }



}
