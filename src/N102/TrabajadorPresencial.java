package N102;

/**
 * Crea una jerarquia d’objectes amb tres classes: Treballador,
 * TreballadorOnline i TreballadorPresencial.
 * 
 * La classe Treballador té els atributs nom, cognom, preu/hora, i el mètode
 * calcularSou() que rep per paràmetre el nombre d'hores treballades i el
 * multiplica pel preu/hora. Les classes filles l'han de sobreescriure,
 * emprant @Override.
 * 
 * Des del main() de la classe Principal, fes les invocacions necessàries per
 * demostrar el funcionament de l’anotació @Override.
 * 
 * En els treballadors presencials, el mètode per calcular el seu sou, rebrà per
 * paràmetre el nombre d’hores treballades al mes. A l’hora de calcular el sou
 * es multiplicarà el nombre d’hores treballades pel preu/hora, més el valor
 * d'un atribut static anomenat benzina que afegirem en aquesta classe.
 * 
 * En els treballadors online, el mètode per calcular el seu sou rebrà per
 * paràmetre el nombre d'hores treballades al mes. A l'hora de calcular el sou
 * es multiplicarà el nombre d'hores treballades pel preu/hora i se li sumarà el
 * preu de la tarifa plana d'Internet, que serà una constant de la classe
 * TreballadorOnline.
 *
 * Afegeix a les classes filles alguns mètodes obsolets (deprecated), i utilitza
 * l’anotació corresponent. Invoca des d'una classe externa els mètodes
 * obsolets, suprimint mitjançant l'anotació corresponent els “warnings” per ser
 * obsolets.
 *
 */

public class TrabajadorPresencial extends Trabajador {

	// Attributes
	private static int combustible = 50;
	
	// constructor
	public TrabajadorPresencial(String nombre, String apellido, int precio_hora) {
		super(nombre, apellido, precio_hora);
	}
	
	//setters/getters
	
	public static int getCombustible() {
		return combustible;
	}

	public static void setCombustible(int combustible) {
		TrabajadorPresencial.combustible = combustible;
	}

	// Methods
	@Override
	public int calcularSueldo(int numHoras) {
		int resultado;
		resultado = super.getPrecio_hora() * numHoras + TrabajadorPresencial.combustible;
		return resultado;
	};
	
	@Deprecated
	public int dietas(int diasJornadaCompleta) {
		int precioMenu = 12;
		int suplementoDietas = diasJornadaCompleta * precioMenu;
		return suplementoDietas;
	}

}
