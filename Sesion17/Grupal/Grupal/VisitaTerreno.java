package Grupal;

import java.util.HashSet;

public class VisitaTerreno {
	private int idenViterreno;
	private int rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String comentarios;
	private Cliente cliente;
	private HashSet<Revision> revision = new HashSet<Revision>();
	
	
	
	public VisitaTerreno() {}
	
	public VisitaTerreno(int idenViterreno, int rutCliente, String dia, String hora, String lugar, String comentarios) {
		super();
		this.idenViterreno = idenViterreno;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
	}
	/**
	 * @return the idenViterreno
	 */
	public int getIdenViterreno() {
		return idenViterreno;
	}
	/**
	 * @param idenViterreno the idenViterreno to set
	 */
	public void setIdenViterreno(int idenViterreno) {
		this.idenViterreno = idenViterreno;
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
	 * @return the comentarios
	 */
	public String getComentarios() {
		return comentarios;
	}
	/**
	 * @param comentarios the comentarios to set
	 */
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	@Override
	public String toString() {
		return "VisitaTerreno [idenViterreno=" + idenViterreno + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", comentarios=" + comentarios + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
