package individual;

import java.util.Date;

public class Contratado extends Trabajador {
	
	private Date fechaIngreso;
	private float salarioMensual;
	
	public Contratado() {}

	public Contratado(Date fechaIngreso, float salarioMensual) {
		super();
		this.fechaIngreso = fechaIngreso;
		this.salarioMensual = salarioMensual;
	}

	@Override
	public String mostrarDatos() {
		// TODO Auto-generated method stub
		//return super.mostrarDatos();
		String resultado = "Fecha Ingreso :" +fechaIngreso+ " Salario Mensual :" +salarioMensual;
		return resultado;
	}


	@Override
	public String toString() {
		return "Contratado [fechaIngreso=" + fechaIngreso + ", salarioMensual=" + salarioMensual + "]";
	}

	/**
	 * @return the fechaIngreso
	 */
	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * @return the salarioMensual
	 */
	public float getSalarioMensual() {
		return salarioMensual;
	}

	/**
	 * @param salarioMensual the salarioMensual to set
	 */
	public void setSalarioMensual(float salarioMensual) {
		this.salarioMensual = salarioMensual;
	}

	
}
