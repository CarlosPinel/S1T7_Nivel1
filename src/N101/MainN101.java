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

public class MainN101 {

	public static void main(String[] args) {

		TrabajadorOnLine tol1 = new TrabajadorOnLine("Jose", "Alvarez", 10);
		int numHoras_mes = 200; 
		TrabajadorPresencial tp1 = new TrabajadorPresencial("Marta", "Torne", 10);
		
		int sueldoTol1 = tol1.calcularSueldo(numHoras_mes);
		System.out.println("El sueldo mensual de " + tol1.getNombre() + " " + tol1.getApellido() + " es de " + sueldoTol1);
		
		int sueldoTp1 = tp1.calcularSueldo(numHoras_mes);
		System.out.println("El sueldo mensual de " + tp1.getNombre() + " " + tp1.getApellido() + " es de " + sueldoTp1);
		
		TrabajadorPresencial.setCombustible(80);
		int sueldoTp1Inflacion = tp1.calcularSueldo(numHoras_mes);
		System.out.println("El sueldo mensual de " + tp1.getNombre() + " " + tp1.getApellido() + " es de " + sueldoTp1Inflacion);
	}

}
