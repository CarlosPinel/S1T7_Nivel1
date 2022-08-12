package N102;

import java.util.ArrayList;

public class Oficina {

	// Methods

	@SuppressWarnings("deprecation")
	public static int gastoTotalDietas(ArrayList<TrabajadorPresencial> lista) {
		int resultado = 0;
		for (TrabajadorPresencial t : lista) {
			resultado += t.dietas(12);
		}
		return resultado;
	}
	
	@SuppressWarnings("deprecation")
	public static int gastoTotalPlus(ArrayList<TrabajadorOnLine> lista) {
		int resultado = 0;
		for (TrabajadorOnLine t : lista) {
			resultado += t.plus(5);
		}
		return resultado;
	}

}
