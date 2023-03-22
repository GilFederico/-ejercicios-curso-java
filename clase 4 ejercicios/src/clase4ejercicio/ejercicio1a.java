package clase4ejercicio;

public class ejercicio1a {
	public static void main(String[] args) {
		
	 int[] ver=ejercicio1a(args);
	 for(int i=0;i<ver.length;i++) {
		 System.out.print(ver[i] + " ");
		}
	}
	public static int[] ejercicio1a(String[] par) {
		int aux=0;
		System.out.println(par[par.length-1]);
		int[] para= new int[3];
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
}
