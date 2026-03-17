package ups.dao;

import java.util.ArrayList;
import java.util.List;
import ups.modelo.Cliente;

public class ClienteDAO {
	private List<Cliente>clientes;
	

	public ClienteDAO() {
    this.clientes = new ArrayList<>(); 
}

	public ClienteDAO(List<Cliente> clientes) {
		super();
		this.clientes = new ArrayList<>();
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	public void agregar(Cliente cli) {
		clientes.add(cli);
	}
	public boolean eliminar(String nom) {
		return clientes.removeIf(x->x.getNombre().equalsIgnoreCase(nom));
	}
	public List<Cliente>listar(){
		return new ArrayList<>(clientes);
	}
}
