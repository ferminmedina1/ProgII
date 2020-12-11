import java.util.ArrayList;

public class Link extends Archivo {

    private ElementoSA elementoAlQueAPunta;

    public Link(String n, ElementoSA elem) {
        super(n, 1);
        elementoAlQueAPunta = elem;
    }

    public ArrayList<ElementoSA> buscar(Filtro f) {
        ArrayList elemento = new ArrayList<ElementoSA>();
        if (f.cumple(this))
            elemento.add(this);
        return elemento;
    }

    public void setElementoAlQueAPunta(ElementoSA elementoAlQueAPunta) {
        this.elementoAlQueAPunta = elementoAlQueAPunta;
    }
}
