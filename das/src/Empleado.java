/**
 * <h2>Clase Empleado, se utiliza para crear y leer empleados de una BD</h2>
 * 
 * Busca información de javadoc en <a href="https://es.wikipedia.org/wiki/Javadoc">Wikipedia</a>
 * @see <a href="https://www.oracle.com/es/technical-resources/articles/java/javadoc-tool.html">Tutorial Javadoc</a>
 * @version 1-2021
 * @author MADM
 * @since 7-4-2021
 */
public class Empleado {
	/**
	 * Atributo Nombre del empleado
	 */
	private String nombre;
	/**
	 * Atributo Apellido del empleado
	 */
	private String apellido;
	/**
	 * Atributo Salario del empleado
	 */
	private double salario;
	
	/**
	 * Constructor con 3 parámetros.
	 * Crea objetos empleado con nombre, apellido y salario.
	 * @param nombre <i>Nombre del empleado</i>
	 * @param apellido <i>Apellido del empleado</i>
	 * @param salario <i>Salario del empleado</i>
	 */
	public Empleado (String nombre, String apellido, double salario) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.salario=salario;
	}
	//Métodos públicos
	
	/**
	 * Sube el salario al empleado
	 * @see Empleado
	 * @param subida <i>Subida a aplicar al salario</i>
	 */
	public void subidasalario (double subida) {
		salario=salario+subida;
	}
	// Métodos privados
	/**
	 * Comprueba que el nombre no esté vacío
	 * @return <ul>
	 * 				<li>true: el nombre NO es una cadena vacía </li>
	 * 				<li>false: el nombre es una cadena vacía </li>
	 * 		   </ul>
	 */
	private boolean comprobar() {
		if (nombre.equals("")) {
			return false;
		}
		return true;
	}
}
