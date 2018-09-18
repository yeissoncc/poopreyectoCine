package proyecto1;

import javax.swing.JOptionPane;

public class lista {
	
	private nodo inicio;
	private nodo fin;
	
	public lista() {
		inicio = null;
		fin = null;
		
				
		
	}
	
	public boolean estaVacia() {
		if (inicio == null) {
			return true;
		}else {
			
			return false;
		}
		
	}

	
	public void insertar(persona Persona) {
		
		nodo actual;
		if(estaVacia()) {
			
			actual = new nodo(Persona,null);
			inicio = actual;
			fin = actual;
		}else {
			actual = new nodo(Persona,null);
			fin.setSiguiente(actual);
			fin = actual;
		}
	}
	
	public void mostrar(){
		
		if(estaVacia()) {
			
			JOptionPane.showMessageDialog(null, "no se  han ingresado cliente");
			return;
		}else {
			
			nodo temporal = inicio;
			while (temporal != null) {
				
				JOptionPane.showMessageDialog(null,temporal.getDato().toString());
				temporal =temporal.getSiguiente();
				
			}
		}
		
	}
	
	public void buscar(int edad) {
		
if(estaVacia()) {
			
			JOptionPane.showMessageDialog(null, "no se  han ingresado cliente");
			return;
		}else {
			
			nodo temporal = inicio;
			while (temporal != null) {
				
				if(edad == temporal.getDato().getaEdad()) {
					JOptionPane.showMessageDialog(null,temporal.getDato().toString());
					break;
					
				}
				
				
				temporal =temporal.getSiguiente();
				
			}
		}
		
		
	}
	

	
	
}
