package N102;

import java.util.ArrayList;


/**
 * Afegeix a les classes filles alguns mètodes obsolets (deprecated), i utilitza
 * l’anotació corresponent. Invoca des d'una classe externa els mètodes
 * obsolets, suprimint mitjançant l'anotació corresponent els “warnings” per ser
 * obsolets.
 *
 */

public class MainN102 {

	public static void main(String[] args) {

		ArrayList<TrabajadorPresencial> listaPresencial = new ArrayList<TrabajadorPresencial>();
		TrabajadorPresencial tp1 = new TrabajadorPresencial("Marcos", "Perez", 12);
		TrabajadorPresencial tp2 = new TrabajadorPresencial("Maria", "Diaz", 13);
		listaPresencial.add(tp1);
		listaPresencial.add(tp2);

		ArrayList<TrabajadorOnLine> listaOnLine = new ArrayList<TrabajadorOnLine>();
		TrabajadorOnLine tol1 = new TrabajadorOnLine("Laura", "Duch", 11);
		TrabajadorOnLine tol2 = new TrabajadorOnLine("Aida", "Navarro", 11);
		listaOnLine.add(tol1);
		listaOnLine.add(tol2);
		
		int gastoTotalDietas = Oficina.gastoTotalDietas(listaPresencial);
		System.out.println(gastoTotalDietas);
		
		int gastoTotalPlus = Oficina.gastoTotalPlus(listaOnLine);
		System.out.println(gastoTotalPlus);
		
		
	}
}
