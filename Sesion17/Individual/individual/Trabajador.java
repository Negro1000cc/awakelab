package individual;


public class Trabajador  {
	private String nombres;
	private String apellidos;
	private int run;
	private int telefono;
	private int edad;
	
	
	
	public Trabajador() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Trabajador(String nombres, String apellidos, int run, int telefono, int edad) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.run = run;
		this.telefono = telefono;
		this.edad = edad;
	}
	
	
	public String mostrarDatos()
	{
		String resultado = "Telefono : " + telefono + " Edad :" +edad;
		return resultado;
	}



	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}



	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}



	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}



	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	/**
	 * @return the run
	 */
	public int getRun() {
		return run;
	}



	/**
	 * @param run the run to set
	 */
	public void setRun(int run) {
		this.run = run;
	}



	/**
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}



	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}



	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}



	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}



	

}
