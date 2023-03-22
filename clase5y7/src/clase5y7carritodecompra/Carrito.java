package clase5y7carritodecompra;
import java.time.LocalDate;
public class Carrito {
	private int fecha;
	private ItemCarrito[] items= new ItemCarrito[3];
	
	public Carrito(int fecha, ItemCarrito[] item) {
		this.fecha= fecha;
		this.items= item;
	}
	public int precio() {
		int total=0;
		for (int i=0;i<items.length;i++) {
			total=total+items[i].Precio();
		}
		System.out.println(total);
		return total;
	}
}
