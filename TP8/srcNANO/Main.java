import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {

        Carpeta raiz = new Carpeta("Raiz");
        Comprimido c1 = new Comprimido("pepeCompresor 1", 0.5);
        Carpeta c2 = new Carpeta("pepa 1");
        Carpeta c3 = new Carpeta("depe paso");
        Carpeta c4 = new Carpeta("pepa 1");
        Archivo a1 = new Archivo("aepe 1", 41);
        Archivo a2 = new Archivo("gggg 2",41);
        Archivo a3 = new Archivo("ete sech 3", 652);
        Archivo a4 = new Archivo("bapa 4",654);
        Link l1 = new Link("p", a2);

        c3.agregarElemento(l1);
        c1.agregarElemento(a2);
        c4.agregarElemento(a3);
        c1.agregarElemento(c4);
        c2.agregarElemento(a1);
        c3.agregarElemento(a4);
        c2.agregarElemento(c3);
        raiz.agregarElemento(c1);
        raiz.agregarElemento(c2);
        //FiltroNombre filtroNombre = new FiltroNombre("ggg");
        a3.setFechaModificacion(LocalDate.of(2020, 10, 26));
        ComparadorNombre c = new ComparadorNombre();
        FiltroModificacion filtroModificacion = new FiltroModificacion(LocalDate.of(2020, 10,22));
        /*FiltroNot filtroNot = new FiltroNot(filtroModificacion);
        FiltroAnd filtroAnd = new FiltroAnd(filtroNombre, filtroNot);*/
        System.out.println(raiz.buscar(filtroModificacion, c));

        System.out.println(raiz.getTamanio());
    }
}
