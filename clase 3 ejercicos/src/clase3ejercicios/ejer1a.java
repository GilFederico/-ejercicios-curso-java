package clase3ejercicios;

public class ejer1a {
	public static void main(String[] args) {
		int a=0;
		String texto="hola que tal?";
		for(int i=0;i<texto.length();i++) {
			if(texto.charAt(i)=='a') {
				a=a+1;
			}		
		}
		System.out.println("cant de veces que se repite una letra:"+ a);
}
}