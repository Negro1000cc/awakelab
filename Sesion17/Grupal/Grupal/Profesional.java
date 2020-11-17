package Grupal;


public class Profesional extends Usuario {
 private String titulo;
 private String fechaIngreso;
 
 
 public Profesional() {}
 
 public Profesional(String nombre, String fechaNacimiento,int run,String titulo, String fechaIngreso) {
	super(nombre,fechaNacimiento,run);
	this.titulo = titulo;
	this.fechaIngreso = fechaIngreso;
 }

/**
 * @return the titulo
 */
public String getTitulo() {
	return titulo;
}

/**
 * @param titulo the titulo to set
 */
public void setTitulo(String titulo) {
	this.titulo = titulo;
}

/**
 * @return the fechaIngreso
 */
public String getFechaIngreso() {
	return fechaIngreso;
}

/**
 * @param fechaIngreso the fechaIngreso to set
 */
public void setFechaIngreso(String fechaIngreso) {
	this.fechaIngreso = fechaIngreso;
}

@Override
public void analizarUsuario() {
	// TODO Auto-generated method stub

	
	System.out.println("*************  Perfil Profesional **************");
	super.analizarUsuario();

	System.out.println("Titulo                  :" + this.titulo);
	System.out.println("Fecha de ingreso        :" + this.fechaIngreso);
	System.out.println("************************************************");
}
 
 
 
 
}
