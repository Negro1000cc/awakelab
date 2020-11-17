package Grupal;

public class Capacitacion {

	private int idenCapacitacion;
	private int rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private int cantAsistentes;
	private Cliente cliente;
	
	
	public Capacitacion() {}
	
	public Capacitacion(int idenCapacitacion, int rutCliente, String dia, String hora, String lugar, String duracion,int cantAsistentes) {
		super();
		this.idenCapacitacion = idenCapacitacion;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantAsistentes = cantAsistentes;
	}
	
	/**
	 * @return the idenCapacitacion
	 */
	public int getIdenCapacitacion() {
		return idenCapacitacion;
	}
	/**
	 * @param idenCapacitacion the idenCapacitacion to set
	 */
	public void setIdenCapacitacion(int idenCapacitacion) {
		this.idenCapacitacion = idenCapacitacion;
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
	 * @return the duracion
	 */
	public String getDuracion() {
		return duracion;
	}
	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	/**
	 * @return the cantAsistentes
	 */
	public int getCantAsistentes() {
		return cantAsistentes;
	}
	/**
	 * @param cantAsistentes the cantAsistentes to set
	 */
	public void setCantAsistentes(int cantAsistentes) {
		this.cantAsistentes = cantAsistentes;
	}
	@Override
	public String toString() {
		return "Capacitacion [idenCapacitacion=" + idenCapacitacion + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantAsistentes="
				+ cantAsistentes + ", toString()=" + super.toString() + "]";
	}
	
	public String mostrarDetalle() {
		//System.out.printf("La capacitación será en s%  a las s%  del día s%  dudará s%  minutos ", this.lugar,this.hora,this.dia,this.duracion);
		String resultado = "La capacitación será en " +this.lugar +" a las "+this.hora+"  del día "+this.dia+"  dudará "+this.duracion+"  minutos ";
		return resultado;
	}
	

}
