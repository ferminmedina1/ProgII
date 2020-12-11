import java.util.ArrayList;

public class Comprimido extends Carpeta {

    private double tasaCompresion;

    public Comprimido(String nombre, double tasa) {
        super(nombre);
        tasaCompresion = tasa;
    }

    public double getTamanio() {
        double tamanio = 0;
        for (ElementoSA elem: super.getElementos()) {
            tamanio += elem.getTamanio();
        }
        return tamanio * tasaCompresion;
    }

    public void setTasaCompresion(double tasa) {
        tasaCompresion = tasa;
    }

    public ArrayList<ElementoSA> buscar(Filtro f) {
        ArrayList<ElementoSA> elementosMismoNombre = new ArrayList<ElementoSA>();
        for (ElementoSA elem : getElementos()) {
            elementosMismoNombre.addAll(elem.buscar(f));
        }
        if (!elementosMismoNombre.isEmpty()) {
            elementosMismoNombre.clear();
            elementosMismoNombre.add(this);
        }
        return elementosMismoNombre;
    }


}
