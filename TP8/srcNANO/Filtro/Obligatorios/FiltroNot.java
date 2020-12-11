public class FiltroNot implements Filtro {

    private Filtro filtro;

    public FiltroNot(Filtro f) {
        filtro= f;
    }

    @Override
    public boolean cumple(ElementoSA elem) {
        return (!filtro.cumple(elem));
    }
}
