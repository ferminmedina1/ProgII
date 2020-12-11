package SistemaArchivos;

import java.util.Comparator;

public class ComparatorTamanio implements Comparator<ElementoSA>{

	@Override
	public int compare(ElementoSA e1, ElementoSA e2) {
		// TODO Auto-generated method stub
		return (int) (e1.getTamanio() - e2.getTamanio());
	}

	
	
}
