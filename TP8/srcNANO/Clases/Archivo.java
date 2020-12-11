import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Archivo extends ElementoSA {
    private double tamanio;

    public Archivo(String nombre, double tamanio) {
        super(nombre);
        this.tamanio = tamanio;
    }


    @Override
    public ArrayList<ElementoSA> buscar(Filtro f) {
        ArrayList<ElementoSA> encontrado = new ArrayList<ElementoSA>();
        if (f.cumple(this))
            encontrado.add(this);
        return encontrado;
    }

    @Override
    public double getTamanio() {
        return tamanio;
    }


    public int compareTo(LocalDate o) {
        return 0;
    }
}
