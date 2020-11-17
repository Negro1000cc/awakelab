package Grupal;

public class Revision {
	
	private int idenRevision;
	private int idenViterreno;
	private String nomAluRevision;
	private String detalle;
	private int estado;
	private Revision revision;
	
	
	
	public Revision() {}
	
	public Revision(int idenRevision, int idenViterreno, String nomAluRevision, String detalle, int estado) {
		super();
		this.idenRevision = idenRevision;
		this.idenViterreno = idenViterreno;
		this.nomAluRevision = nomAluRevision;
		this.detalle = detalle;
		this.estado = estado;
	}
	/**
	 * @return the idenRevision
	 */
	public int getIdenRevision() {
		return idenRevision;
	}
	/**
	 * @param idenRevision the idenRevision to set
	 */
	public void setIdenRevision(int idenRevision) {
		this.idenRevision = idenRevision;
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
	 * @return the nomAluRevision
	 */
	public String getNomAluRevision() {
		return nomAluRevision;
	}
	/**
	 * @param nomAluRevision the nomAluRevision to set
	 */
	public void setNomAluRevision(String nomAluRevision) {
		this.nomAluRevision = nomAluRevision;
	}
	/**
	 * @return the detalle
	 */
	public String getDetalle() {
		return detalle;
	}
	/**
	 * @param detalle the detalle to set
	 */
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	/**
	 * @return the estado
	 */
	public int getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "revision [idenRevision=" + idenRevision + ", idenViterreno=" + idenViterreno + ", nomAluRevision="
				+ nomAluRevision + ", detalle=" + detalle + ", estado=" + estado + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
