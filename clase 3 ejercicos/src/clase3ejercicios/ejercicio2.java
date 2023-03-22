package clase3ejercicios;
import java.util.Scanner;
public class ejercicio2 {
	public static void main(String[] args) {
		Scanner texto= new Scanner(System.in);
		System.out.print("ingrese el texto para codificar o decodificar:");
		String texto1=texto.nextLine();
		System.out.print("@ingrese c(codificar) o d(decodificar):");
		String opcion=texto.nextLine();
		System.out.print("ingrese el desplazamiento");
		String resultado=new String();
		int desp=texto.nextInt();
		switch(opcion){
			case "c":{
				 resultado=codificar(texto1,desp);	
			}break;
			case "d":{
				 resultado=decodificar(texto1,desp);
			}break;
				
		}
		System.out.println(resultado);		
	}
	public static String codificar(String txt,int desp) {
		String res=new String();
		for (int i=0;i<txt.length();i++) {
			res+=(char)(txt.charAt(i)+desp);
		}
		return res;
	}
	public static String decodificar(String txt,int desp) {
		String res=new String();
		for (int i=0;i<txt.length();i++) {
			res+=(char)(txt.charAt(i)-desp);
		}
		return res;
	}
}