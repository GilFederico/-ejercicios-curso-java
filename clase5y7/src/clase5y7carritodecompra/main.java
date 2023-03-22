package clase5y7carritodecompra;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class main {

	public static void main(String[] args) throws IOException {;
		String[] producto=new String[3];
		ItemCarrito[] items= new ItemCarrito[3];
		int fecha=0;
		for(int i=0;i<producto.length;i++) {
			producto= archivo(i);
			if(i==0) {
				Producto chocolate= new Producto(producto[1],producto[2]);
				items[0]= new ItemCarrito(producto[0],chocolate);
			}
			if(i==1) {
				Producto mandarina= new Producto(producto[1],producto[2]);
				items[1]= new ItemCarrito(producto[0],mandarina);
			}
			if(i==2) {
				Producto manazana= new Producto(producto[1],producto[2]);
				items[2]= new ItemCarrito(producto[0],manazana);
			}
		}
		Carrito car= new Carrito(fecha,items);
		car.precio();
	}
	public static String[] archivo( int f) throws IOException {
		String[] info= new String[3];
		int i=0;
		for(String linea:Files.readAllLines(Paths.get("C:\\Users\\fegil\\OneDrive\\Desktop\\productos.txt"))){
			if(i==f) {
				info=linea.split("\t");
				break;
			}
			i++;
		}
		return info;
	}
}
