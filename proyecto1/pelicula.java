package proyecto1;

public class pelicula {
	
	private String aPelicula,genero;





	@Override
	public String toString() {
		return  "nombre de la pelicula: " + getaPelicula()+
				"genero de la pelicula" + getGenero();
	}


	


	public pelicula(String aPelicula, String nGenero) {
		this.aPelicula = aPelicula;
	
	}


	public String getaPelicula() {
		return aPelicula;
	}


	public void setaPelicula(String aPelicula) {
		this.aPelicula = aPelicula;
	}
	
	public String getGenero() {
		return genero;
	}
}