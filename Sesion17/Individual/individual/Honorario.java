package individual;

public class Honorario extends Trabajador{
	
	private String giro;
	private int ano;

	public Honorario() {}
	

	public Honorario(String giro, int ano) {
		super();
		this.giro = giro;
		this.ano = ano;
	}



	@Override
	public String mostrarDatos() {
		// TODO Auto-generated method stub
		//return super.mostrarDatos();
		String resultado = "Giro :" +giro+ " Año :" +ano;
		return resultado;
	}



	@Override
	public String toString() {
		return "honorario [giro=" + giro + ", ano=" + ano + "]";
	}



	/**
	 * @return the giro
	 */
	public String getGiro() {
		return giro;
	}

	/**
	 * @param giro the giro to set
	 */
	public void setGiro(String giro) {
		this.giro = giro;
	}

	/**
	 * @return the ano
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * @param ano the ano to set
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}

	
}
