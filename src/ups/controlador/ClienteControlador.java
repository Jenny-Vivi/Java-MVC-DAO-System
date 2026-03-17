package ups.controlador;

import java.util.List;
import java.util.ArrayList;

import ups.dao.ClienteDAO;
import ups.modelo.Cliente;
import ups.vista.ClienteVista;

public class ClienteControlador {
	private ClienteDAO dao;
	private ClienteVista vista;
	public ClienteControlador(ClienteDAO dao, ClienteVista vista) {
		super();
		this.dao = dao;
		this.vista = vista;
	}
	public ClienteDAO getDao() {
		return dao;
	}
	public void setDao(ClienteDAO dao) {
		this.dao = dao;
	}
	public ClienteVista getVista() {
		return vista;
	}
	public void setVista(ClienteVista vista) {
		this.vista = vista;
	}

	public void agregarCliente(String nomb, int eda) {
		Cliente cli2=new Cliente(nomb,eda);
		dao.agregar(cli2);
		vista.mostrarMensaje("Cliente agregado correctamiente: "+nomb+"que tiene"+ eda+"años");
	}
	public void eliminarCliente(String nom) {
		boolean bandera=dao.eliminar(nom);
		if(bandera) {
			vista.mostrarMensaje("Cliente "+nom+"eliminado correctamente");
		}else {
			vista.mostrarMensaje("Cliente"+nom+"no existe. ");
		}
	}
	public  void listarClientes() {
		List<Cliente>listcli2=dao.listar();
		for(Cliente x: listcli2) {
			vista.mostrarMensaje("Nombre= "+x.getNombre()+"Edad= "+x.getEdad());
			
		}
	}
}
