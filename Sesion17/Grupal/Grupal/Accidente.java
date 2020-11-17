package Grupal;

public class Accidente {

	private int idenAccidente;
	private int rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String origen;
	private String consecuencia;
	private Cliente cliente;
	
	public Accidente() {}
	
	public Accidente(int idenAccidente, int rutCliente, String dia, String hora, String lugar, String origen,
			String consecuencia) {
		super();
		this.idenAccidente = idenAccidente;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencia = consecuencia;
	}

	/**
	 * @return the idenAccidente
	 */
	public int getIdenAccidente() {
		return idenAccidente;
	}

	/**
	 * @param idenAccidente the idenAccidente to set
	 */
	public void setIdenAccidente(int idenAccidente) {
		this.idenAccidente = idenAccidente;
	}

	/**
	 * @return the rutCliente
	 */
	public int getRutCliente() {
		return rutCliente;
	}

	/**
	 * @param rutCliente the rutCliente to set
	 */
	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}

	/**
	 * @return the dia
	 */
	public String getDia() {
		return dia;
	}

	/**
	 * @param dia the dia to set
	 */
	public void setDia(String dia) {
		this.dia = dia;
	}

	/**
	 * @return the hora
	 */
	public String getHora() {
		return hora;
	}

	/**
	 * @param hora the hora to set
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}

	/**
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * @return the consecuencia
	 */
	public String getConsecuencia() {
		return consecuencia;
	}

	/**
	 * @param consecuencia the consecuencia to set
	 */
	public void setConsecuencia(String consecuencia) {
		this.consecuencia = consecuencia;
	}

	@Override
	public String toString() {
		return "Accidente [idenAccidente=" + idenAccidente + ", rutCliente=" + rutCliente + ", dia=" + dia + ", hora="
				+ hora + ", lugar=" + lugar + ", origen=" + origen + ", consecuencia=" + consecuencia + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
