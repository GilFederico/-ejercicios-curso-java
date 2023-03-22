package clase3ejercicios;

public class ejer1b {
	public static void main(String [] args) {
		int num1=3;
		int num2 = 89;
		int num3 = 6;
		int[] array = ejercicio2(num1, num2, num3, "asc");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
	}
	public static int[] ejercicio2(int num1, int num2,int num3,String orden) {
		int[] ordenado= new int[3];
		ordenado[0]=num1;
		ordenado[1]=num2;
		ordenado[2]=num3;
		int aux=0;
		if(orden =="asc") {
			for(int i = 0; i<=ordenado.length;i++) {
				for(int j=i+1;j<ordenado.length;j++) {
					if (ordenado[i]>ordenado[j]) {
						aux=ordenado[i];
						ordenado[i]=ordenado[j];
						ordenado[j]=aux;
					}
				}
			}
		}else {
			for(int i = 0; i<=ordenado.length;i++) {
				for(int j=i+1;j<ordenado.length;j++) {
					if (ordenado[i]<ordenado[j]) {
						aux=ordenado[i];
						ordenado[i]=ordenado[j];
						ordenado[j]=aux;
					}
				}
			}
		}
		return ordenado;
	}
}
