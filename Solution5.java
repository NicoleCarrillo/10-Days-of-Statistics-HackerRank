import java.text.DecimalFormat;
import java.util.Arrays;

/*Given an array, , of  integers, calculate and print the respective mean, median, and mode 
 * If your array contains more than one modal value, choose the numerically smallest one.*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution5 {

        private static String mean(int tam, int[] arreglo) {
        DecimalFormat formato = new DecimalFormat("#.00");
        int suma=0;
        for(int x=0;x<arreglo.length;x++) {
            suma=suma+arreglo[x];
        }
        return formato.format((float)suma/tam); 
    }
    
    private static String square(float mean_total, int[] arreglo) {
        DecimalFormat formato = new DecimalFormat("#.00");
        float suma=0;
        for(int x=0;x<arreglo.length;x++) {
            suma=(float) (suma+(Math.pow((arreglo[x]-mean_total),2)));
        }
        return formato.format((float)suma);
    }
    
    private static String deviation(int tam, float square_total) {
        DecimalFormat formato = new DecimalFormat("#.0");
        return formato.format(Math.sqrt((square_total/tam)));
    }

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int tam =entrada.nextInt();
        int arreglo[] = new int[tam];
        for(int i = 0; i < tam; i++){
            arreglo[i] = entrada.nextInt();
        }
        
        float mean_total=Float.parseFloat(mean(tam,arreglo));
        float square_total=Float.parseFloat(square(mean_total,arreglo));
        System.out.println(deviation(tam,square_total));

    }
}
