import java.text.DecimalFormat;
import java.util.Arrays;

public class Solucion4 {
	
	private static int[] prepArreglo(int[] arreglo,int[]frecuencias) {
		int tam=0;
		int controlador=0;
		for(int x=0;x<frecuencias.length;x++) {
			tam+=frecuencias[x];
		}
		int[]arregloFinal=new int[tam];
		for(int x=0;x<arreglo.length;x++) {
			int frec=frecuencias[x];
			int contador=0;
			while(contador<frec) {
				arregloFinal[controlador]=arreglo[x];
				controlador++;
				contador++;
			}
		}
		Arrays.sort(arregloFinal);
		return arregloFinal;
	}
	
	private static String quartile(int[] arreglo) {
		DecimalFormat formato = new DecimalFormat("#");
		if(arreglo.length%2==0) { //es par
			return formato.format((float)(arreglo[(arreglo.length/2)-1]+arreglo[(arreglo.length/2)])/2);
		}else {
			return formato.format((float)arreglo[(int)(arreglo.length/2)]);
		}
	}

	public static void main(String[]args) {
		int[] arreglo= {6, 12, 8, 10, 20, 16};
		int[] frecuencias= {5, 4 ,3 ,2, 1, 5};
		int[]arregloFinal=prepArreglo(arreglo,frecuencias);
		int arreglo2[] = null;
        int arreglo3[] = null;
        int pos=0;
        
        if(arreglo.length%2==0) { //es par
        	pos=arregloFinal.length/2;
        }else {
        	pos=arregloFinal.length/2+1;
        }
        arreglo2 = new int[(arregloFinal.length/2)];
    	arreglo3 = new int[(arregloFinal.length/2)];
    	for(int x=0;x<arreglo3.length;x++) {
    		arreglo2[x]=arregloFinal[x];
    		arreglo3[x]=arregloFinal[pos];
    		pos++;
    	}
    	System.out.println(Float.parseFloat(quartile(arreglo3))-Float.parseFloat(quartile(arreglo2)));
		
	}

	
}
