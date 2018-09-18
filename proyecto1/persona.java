package proyecto1;

public class persona {
	
	private String aNombre, aApellido;
	private int aEdad;
	
	
	@Override
	public String toString() {
		return "cliente " 
				+"\nNombre: "+ getaNombre() 
				+"\nApellido: "+getaApellido()
				+"\nC.C: "+getaEdad() ;
	}


	public persona(String aNombre,int aEdad) {
		this.aNombre = aNombre;
		this.aApellido = aApellido;
		this.aEdad = aEdad;
	}
	
	
	public String getaNombre() {
		return aNombre;
	}
	public void setaNombre(String aNombre) {
		this.aNombre = aNombre;
	}
	public String getaApellido() {
		return aApellido;
	}
	public void setaApellido(String aApellido) {
		this.aApellido = aApellido;
	}
	public int getaEdad() {
		return aEdad;
	}
	public void setaEdad(int aEdad) {
		this.aEdad = aEdad;
	}
	
	
	

}
