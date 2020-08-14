import java.text.DecimalFormat;
import java.util.Scanner;

/* Given an array, , of  integers and an array, , representing the respective weights of 's elements, 
 * calculate and print the weighted mean of 's elements. 
 * Your answer should be rounded to a scale of  decimal place (i.e.,  format).*/
public class Solution2 {
	
	
	private static String wmean(int tam, int[] arreglo, int[] weight) {
		DecimalFormat formato = new DecimalFormat("#.0");
		int suma=0;
		int suma1=0;
		for(int x=0;x<arreglo.length;x++) {
			suma=suma+(arreglo[x]*weight[x]);
			suma1=suma1+weight[x];
		}

		return formato.format((float)suma/suma1); 
	}

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int tam =entrada.nextInt();
		int[]weight= {1,2,3,4,5};
		int []arreglo= {10,40,30,50,20};
		
		System.out.println(wmean(tam,arreglo,weight));

	}

}
