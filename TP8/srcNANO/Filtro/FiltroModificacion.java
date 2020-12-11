import java.time.LocalDate;

public class FiltroModificacion implements Filtro {

    private LocalDate fechaMod;

    public FiltroModificacion(LocalDate fecha) {
        fechaMod = fecha;
    }

    @Override
    public boolean cumple(ElementoSA elem) {
        return elem.getFechaModificacion().isAfter(fechaMod);
    }
}
