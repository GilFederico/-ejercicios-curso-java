package clase5y7carritodecompra;
import java.time.LocalDate;
public class ItemCarrito {
	private int cantidad;
	private Producto producto;
	
	public ItemCarrito(String cant,Producto prod) {
		this.cantidad=Integer.parseInt(cant);
		this.producto=prod;
	}
	
	public int Precio() {
		return cantidad * producto.getPrecio();
	}
}
