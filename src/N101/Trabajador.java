package N101;

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
 */

public class Trabajador {

	//Attributes
	private String nombre;
	private String apellido;
	private int precio_hora;
	
	//constructor
	public Trabajador(String nombre, String apellido, int precio_hora) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.precio_hora = precio_hora;
	}

	public Trabajador() {
	}
	

	//setters/getters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getPrecio_hora() {
		return precio_hora;
	}

	public void setPrecio_hora(int precio_hora) {
		this.precio_hora = precio_hora;
	}
	
	//Methods
	public int calcularSueldo(int numHoras) {
		int resultado;
		resultado = this.precio_hora * numHoras;
		return resultado;
	};
	
}
