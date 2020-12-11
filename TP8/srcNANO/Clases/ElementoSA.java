import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public abstract class ElementoSA implements Comparable<ElementoSA> {

    private String nombre;
    private LocalDate fechaCreacion, fechaModificacion;

    public ElementoSA(String n) {
        nombre = n;
        fechaCreacion = LocalDate.now();
        fechaModificacion = LocalDate.now();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDate fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }


    public String toString() {
        return this.getNombre();
    }

    public abstract double getTamanio();


    public abstract ArrayList<ElementoSA> buscar(Filtro f);

    public int compareTo(LocalDate fecha) {
        if (getFechaCreacion().isBefore(fecha))
            return -1;
        else if (getFechaCreacion().isAfter(fecha))
            return 1;
        else
            return 0;
    }

    public int compareTo(ElementoSA elem) {
        return this.getNombre().compareTo(elem.getNombre());
    }

}
