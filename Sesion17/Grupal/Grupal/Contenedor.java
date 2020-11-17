package Grupal;

import java.util.ArrayList;
import java.util.List;

public class Contenedor implements IAsesoria {

	private List<IAsesoria> lisAsesoria  = new ArrayList<IAsesoria>();
	private List<Capacitacion> lisCapacitacion = new ArrayList<Capacitacion>();
	private Capacitacion capa = new Capacitacion();
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	//private List<Capacitacion> cap = new ArrayList<Capacitacion>();
	private List<Usuario> lisToRemove = new ArrayList<Usuario>();
	
	public void almacenarCliente(Usuario u) {	
		 usuarios.add(u);		
	}
	
	public void almacenarProfesional(Usuario u) {
		usuarios.add(u);
	}
	
	public void almacenarAdministrativo(Usuario u) {
		usuarios.add(u);
	}
	
	public void almacenarCapacitacion(Capacitacion ca) {
		lisCapacitacion.add(ca);
	}
	
	public void eliminarUsuario(int rut) {	
		for(int i = 0; i < usuarios.size(); i++) {
			if(rut == usuarios.get(0).getRun()) {
				lisToRemove.add(usuarios.get(i));
				usuarios.removeAll(lisToRemove);
				System.out.println("registro borrado : " + lisToRemove);
			}			
		}	
	}
		
	public void listarUsuarios() {
		analizarUsuario();
	}
	
	public void listarUsuariosXTipo(int tipo) {
		switch (tipo) {
		case 1: {
			
			analizarUsuario("Administrativo");
			break;
		}
		case 2: {			
			analizarUsuario("Profesional");
			break;
		}
		case 3: {			
			analizarUsuario("Cliente");
			break;
		}
		default:
			throw new IllegalArgumentException("opcion no valida: " + tipo);
		}
		
	}
	
	public void listarCapacitaciones() {
		for (Capacitacion lis : lisCapacitacion ) {
			System.out.println(lis.toString() + " " + lis.mostrarDetalle() );
		}
		
	}

	@Override
	public void analizarUsuario(String tipo) {
		// TODO Auto-generated method stub
		
		switch (tipo){
			case "Administrativo":
				for(IAsesoria ia : usuarios) {
					if(ia.getClass().getSimpleName().equals(tipo)) {
						ia.analizarUsuario();
					}					
				}	
				break;	
			case "Profesional":
				for(IAsesoria ia : usuarios) {
					if(ia.getClass().getSimpleName().equals(tipo)) {
						ia.analizarUsuario();
					}	
				}	
				break;
			case "Cliente":
				for(IAsesoria ia : usuarios) {
					if(ia.getClass().getSimpleName().equals(tipo)) {
						ia.analizarUsuario();
					}	
				}	
				break;
			default:
		}


	}

	@Override
	public void analizarUsuario() {
		// TODO Auto-generated method stub
		for(IAsesoria ia : usuarios) {
			ia.analizarUsuario();
		}	
	}
	
	
}
