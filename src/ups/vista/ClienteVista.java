package ups.vista;

import java.util.Scanner;

public class ClienteVista {
	Scanner leer=new Scanner(System.in);
	
	public void mostrarMensaje(String msg) {
		System.out.println(msg);
		
		
	}
	public String obtenerNombre() {
		return  leer.next();
	}
	public int obtenerNumero() {
    int num = leer.nextInt();
    leer.nextLine(); 
    return num;
}

}
