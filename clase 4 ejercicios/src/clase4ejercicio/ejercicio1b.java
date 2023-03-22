package clase4ejercicio;
import java.util.Scanner;
public class ejercicio1b {
	public static void main(String[] args) {
		
		 String[] datos=ingreso();
		 int[] ver=ejerciciob(datos); 
		 for(int i=0;i<ver.length;i++) {
			 System.out.print(ver[i] + " ");
			}
		}
		public static int[] ejerciciob(String[] par) {
			int aux=0;
			System.out.println(par[par.length-1]);
			int[] para= new int[par.length-1];
			for(int x=0;x<para.length;x++) {
				para[x]=Integer.parseInt(par[x]);
			}
			if( par[par.length-1].charAt(0)=='a') {
				for(int i = 0; i<=para.length;i++) {
					for(int j=i+1;j<para.length;j++) {
						if (para[i]>para[j]) {
							aux=para[i];
							para[i]=para[j];
							para[j]=aux;
						}
					}
				}
			}else {
				for(int i = 0; i<=para.length;i++) {
					for(int j=i+1;j<para.length;j++) {
						if (para[i]<para[j]) {
							aux=para[i];
							para[i]=para[j];
							para[j]=aux;
						}
					}
				}
		
			}
			return para;
		}
		public static String[] ingreso() {
			Scanner texto= new Scanner(System.in);
			String[] datos= new String[4];
			for(int i=0;i<datos.length;i++) {
				System.out.println("ingrese los numeros o a(ascendente) o d(descendente)");
				datos[i]=texto.nextLine();
			}
			return datos;
		}
}
