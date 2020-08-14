import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/*Given an array, , of  integers, calculate the respective first quartile (), second quartile (), 
 * and third quartile (). It is guaranteed that , , and  are integers.*/
public class Solution3 {
	

	private static String quartile(int[] arreglo) {
		DecimalFormat formato = new DecimalFormat("#");
		if(arreglo.length%2==0) { //es par
			return formato.format((float)(arreglo[(arreglo.length/2)-1]+arreglo[(arreglo.length/2)])/2);
		}else {
			return formato.format((float)arreglo[(int)(arreglo.length/2)]);
		}
	}

	
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
        int tam =12;
        int[] arreglo= {4, 17 ,7 ,14 ,18 ,12 ,3 ,16 ,10 ,4 ,4 ,12};
        int arreglo2[] = null;
        int arreglo3[] = null;
        int pos=0;
        if(arreglo.length%2==0) { //es par
        	pos=arreglo.length/2;
        }else {
        	pos=arreglo.length/2+1;
        }
        arreglo2 = new int[(arreglo.length/2)];
    	arreglo3 = new int[(arreglo.length/2)];
    	Arrays.sort(arreglo);
    	for(int x=0;x<arreglo3.length;x++) {
    		arreglo2[x]=arreglo[x];
    		arreglo3[x]=arreglo[pos];
    		pos++;
    	}

        System.out.println(quartile(arreglo2));
        System.out.println(quartile(arreglo));
        System.out.println(quartile(arreglo3)); 
	}
}
