public class FiltroAnd implements Filtro {

    private Filtro filtro1, filtro2;

    public FiltroAnd(Filtro f1, Filtro f2) {
        filtro1 = f1;
        filtro2 = f2;
    }


    @Override
    public boolean cumple(ElementoSA elem) {
        return (filtro1.cumple(elem) && filtro2.cumple(elem));
    }
}
