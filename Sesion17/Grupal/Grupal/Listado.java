package Grupal;


import java.util.ArrayList;
import java.util.List;



public class Listado implements IAsesoria {

	 private List<Usuario> usuarios = new ArrayList<Usuario>();
	
	 public void agregarElemento(Usuario u)
	 {	 
		 usuarios.add(u);
	 }
	 
	
	@Override
	public void analizarUsuario() {
		// TODO Auto-generated method stub
		for(IAsesoria ia : usuarios) {
			ia.analizarUsuario();
		}		
	}


	@Override
	public void analizarUsuario(String tipo) {
		// TODO Auto-generated method stub
		
	}

}
