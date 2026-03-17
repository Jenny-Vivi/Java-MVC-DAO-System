package ups.controlador;

import ups.dao.ClienteDAO;
import ups.vista.ClienteVista;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteDAO dao=new ClienteDAO();
		ClienteVista vista=new ClienteVista();
		ClienteControlador controlador=new ClienteControlador(dao, vista);
		boolean continuar=true;
		
		while(continuar) {
			vista.mostrarMensaje("MENU PRINCIPAL \n 1.Ingrese Cliente \n  2.Eliminar Cliente \n"+
					"3.Listar Cliente\n 4. Salir\n Ingrese su opcion");
			int opcion=vista.obtenerNumero();
				
			switch(opcion){
			case 1:
				vista.mostrarMensaje("Ingrese el nombre del cliente: ");
				String nomb=vista.obtenerNombre();
				vista.mostrarMensaje("Ingrese la edad de "+nomb);
				int ed=vista.obtenerNumero();
				controlador.agregarCliente(nomb, ed);
				break;
			case 2:
				vista.mostrarMensaje("INgrese el nombre del cliente a eliminar: ");
				nomb=vista.obtenerNombre();
				controlador.eliminarCliente(nomb);
				break;
			case 3:
				controlador.listarClientes();
				break;
				
			case 4:
				vista.mostrarMensaje("Gracias por utilizar el sistema correctamente...");
				continuar=false;
				break;
			default:
				vista.mostrarMensaje("Opcion invalida, porfavor ingrese un numero del 1 al 4");
				
			}
		}
		
	}

}
