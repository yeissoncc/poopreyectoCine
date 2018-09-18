package proyecto1;

import javax.swing.JOptionPane;

public class listaPelicula {
	
	private nodoPelicula inicio;
	private nodoPelicula fin;
	
	public listaPelicula() {
		inicio = null;
		fin = null;
		
	}


public boolean estaVaciaP() {
	if (inicio == null) {
		return true;
	}else {
		
		return false;
	}
	
}

	public void insertarpelicula(pelicula Pelicula) {
	
		nodoPelicula actual;
			if(estaVaciaP()) {
		
					actual = new nodoPelicula(Pelicula,null);
					inicio = actual;
					fin = actual;
						}else {
					actual = new nodoPelicula(Pelicula,null);
					fin.setSiguiente(actual);
					fin = actual;
				}
	}
	
	public void mostrarPelicula(){
		
			if(estaVaciaP()) {
			
				JOptionPane.showMessageDialog(null, "no se  han ingresado pelicula");
				return;
					}else {
			
						nodoPelicula temporal = inicio;
						while (temporal != null) {
				
					JOptionPane.showMessageDialog(null,temporal.getInformacion().toString());
					temporal =temporal.getSiguiente();
				
			}
		}
		
	}
		
	


}
