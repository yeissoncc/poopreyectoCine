package proyecto1;

public class nodo {
	private nodo siguiente;
	private persona dato;
	
	
	public nodo(persona dato,nodo siguiente) {
		
		this.siguiente = siguiente;
		this.dato = dato;
		
		
	}


	public nodo getSiguiente() {
		return siguiente;
	}


	public void setSiguiente(nodo siguiente) {
		this.siguiente = siguiente;
	}


	public persona getDato() {
		return dato;
	}


	public void setDato(persona dato) {
		this.dato = dato;
	}
	

}
