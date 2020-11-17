package individual;

public class Eventual extends Trabajador {
	private boolean disponibilidad;
	private String correo;

	
	public Eventual() {}

	public Eventual(boolean disponibilidad, String correo) {
		super();
		this.disponibilidad = disponibilidad;
		this.correo = correo;
	}

	@Override
	public String mostrarDatos() {
		// TODO Auto-generated method stub
		//return super.mostrarDatos();
		String resultado = "Disponibilidad :" +disponibilidad+ " Correo :" +correo;
		return resultado;
	}


	@Override
	public String toString() {
		return "Eventual [disponibilidad=" + disponibilidad + ", correo=" + correo + "]";
	}



	/**
	 * @return the disponibilidad
	 */
	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	/**
	 * @param disponibilidad the disponibilidad to set
	 */
	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	
	
}
