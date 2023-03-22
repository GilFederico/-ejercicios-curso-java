package clase5y7carritodecompra;
import java.time.LocalDate;
public class Producto {
	private int precio;
	private String nombre;
	
	public Producto(String p, String nom) {
		this.nombre=nom;
		this.precio=Integer.parseInt(p);
	}
	public int getPrecio() {
		return precio;
	}
}
