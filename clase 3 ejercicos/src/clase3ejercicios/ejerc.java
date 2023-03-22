package clase3ejercicios;

public class ejerc {
	public static void main(String[] args) {
		int[] vector = {4,6,9,3,8};
		int x=5;
		int suma=ejercicioc(vector,x);
		System.out.print("la suma de todos los numeros mayores a"+ x + "es:"+ suma);
	}
	public static int ejercicioc(int[] vector,int x) {
		int suma=0;
		for(int i=0;i<vector.length;i++) {
			if(vector[i]>x) {
				suma+=vector[i];
			}
		}
		return suma;
	}
}
