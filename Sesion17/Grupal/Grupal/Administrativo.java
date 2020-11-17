package Grupal;



public class Administrativo extends Usuario {
 private String area;
 private String experiencia;
 
 public Administrativo() {}
 
 public Administrativo(String nombre, String fechaNacimiento, int run,String area, String experiencia) {
	super(nombre,fechaNacimiento,run);
	this.area = area;
	this.experiencia = experiencia;
 }

/**
 * @return the area
 */
public String getArea() {
	return area;
}

/**
 * @param area the area to set
 */
public void setArea(String area) {
	this.area = area;
}

/**
 * @return the experiencia
 */
public String getExperiencia() {
	return experiencia;
}

/**
 * @param experiencia the experiencia to set
 */
public void setExperiencia(String experiencia) {
	this.experiencia = experiencia;
}

@Override
public void analizarUsuario() {
	// TODO Auto-generated method stub

	System.out.println("***********  Perfil Administrativo *************");
	super.analizarUsuario();
					   
	System.out.println("Area                    :" + this.area);
	System.out.println("Experiencia previa      :" + this.experiencia);
	System.out.println("************************************************");
	
}
 
 
 
 
 
 
 
}
