package Grupal;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Usuario implements IAsesoria {

	private String nombre;
	private String fechaNacimiento;
	private int run;
	private ArrayList<Cliente> cliente;
	private ArrayList<Profesional> profesional;
	private ArrayList<Administrativo> administrativo;
	private ArrayList<Usuario> usuario;
	
	public Usuario() {}
	
	public Usuario(String nombre, String fechaNacimiento, int run) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}	
	
	/**
	 * @return the usuario
	 */
	public ArrayList<Usuario> getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(ArrayList<Usuario> usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the cliente
	 */
	public ArrayList<Cliente> getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(ArrayList<Cliente> cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the profesional
	 */
	public ArrayList<Profesional> getProfesional() {
		return profesional;
	}

	/**
	 * @param profesional the profesional to set
	 */
	public void setProfesional(ArrayList<Profesional> profesional) {
		this.profesional = profesional;
	}

	/**
	 * @return the administrativo
	 */
	public ArrayList<Administrativo> getAdministrativo() {
		return administrativo;
	}

	/**
	 * @param administrativo the administrativo to set
	 */
	public void setAdministrativo(ArrayList<Administrativo> administrativo) {
		this.administrativo = administrativo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", run=" + run + "]";
	}
	
	public String mostrarEdad() {
		String vFechaOK = new SimpleDateFormat("dd/MM/yyyy").format(this.fechaNacimiento);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern(vFechaOK);
		LocalDate fechaNac = LocalDate.parse("15/08/1993", fmt); 
		LocalDate ahora = LocalDate.now();

		Period periodo = Period.between(fechaNac, ahora);
		
		String mensaje = "el usuario tiene : "+ periodo.getYears() + " años";
		return mensaje;
	}
	
	@Override
	public void analizarUsuario() {
		// TODO Auto-generated method stub

		System.out.println("El nombre del usuario es:" + this.nombre);
		System.out.println("el run del usuario es   :" + this.run);
	}

	@Override
	public void analizarUsuario(String tipo) {
		// TODO Auto-generated method stub
		
	}


}
