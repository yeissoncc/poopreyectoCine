package proyecto1;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lista l = new lista();
		listaPelicula lp = new listaPelicula();
		int op = 0;
		do {
			String opcion = JOptionPane.showInputDialog(null," menu Cinema \n 1.ingresar cliente"
					+" \n 2.mostrar \n 3.buscar cliente cliente "
					+"\n 4.ingresar pelicula \n 5.mostrar pelicula"
					+ "\n 6.imprimir boleta \n 0.salir");
			op = Integer.parseInt(opcion);
			
			
			switch (op) {
			
			case 1:{
				String nombre,apellido,annos;
				int edad;
				nombre = JOptionPane.showInputDialog(null,"ingresar nombre");
				apellido = JOptionPane.showInputDialog(null,"ingresar apellido");
				annos = JOptionPane.showInputDialog(null,"ingresar cededula");
				edad = Integer.parseInt(annos);
				l.insertar(new persona(nombre,edad));
				break;
			}
			
			case 2:{
				l.mostrar();
				break;
			}
			case 3:{
				String edad = JOptionPane.showInputDialog(null,"ingrese  la ceduala a buscar");
				int edad2= Integer.parseInt(edad);
				l.buscar(edad2);
			}
			case 4:{
				String nPelicula,nGenero;
				nPelicula = JOptionPane.showInputDialog(null,"ingresar nombre de la pelicula");
				nGenero = JOptionPane.showInputDialog(null,"ingresar genero pelicula");
				lp.insertarpelicula(new pelicula(nPelicula,nGenero));
				break;
				
			
			}
			
			case 5:{
				lp.mostrarPelicula();
				
			}
			
			case 6:{
				l.mostrar();
				lp.mostrarPelicula();
			}
		}
		
		}while(op!=0);
			
	}

}
