package proyecto1;

public class nodoPelicula {
	
	private nodoPelicula siguiente;
	private pelicula informacion;
	
	
public nodoPelicula(pelicula informacion,nodoPelicula siguiente) {
		
		this.siguiente = siguiente;
		this.informacion = informacion;
		
		
	}


public nodoPelicula getSiguiente() {
	return siguiente;
}


public void setSiguiente(nodoPelicula siguiente) {
	this.siguiente = siguiente;
}


public pelicula getInformacion() {
	return informacion;
}


public void setInformacion(pelicula informacion) {
	this.informacion = informacion;
}





}
