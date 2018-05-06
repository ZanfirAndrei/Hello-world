/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_sem_1;
import java.util.Scanner;
import java.util.AccessControlException;

/**
 *
 * @author andre_000
 */
public class Tema_sem_1 {

    

    /**
     * @param args the command line arguments
     */
    public static String intToString(int number, int groupSize) {
    StringBuilder result = new StringBuilder();

    for(int i = 31; i >= 0 ; i--) {
        int mask = 1 << i;
        result.append((number & mask) != 0 ? "1" : "0");

        if (i % groupSize == 0)
            result.append(" ");
    }
    result.replace(result.length() - 1, result.length(), "");

    return result.toString();
}
    public static boolean isprime(int x){
        int i;
        if(x == 1) return false;
        for( i = 2; i<=x/2; i++)
            if( x % i == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        Scanner tas = new Scanner (System.in );
        /*//palindrom
        System.out.println("Scrie cuvantul dorit:");
        String cuvant = tas.next();
        int i,
            k=0;
        
        if (cuvant.length()%2==1) {
            for( i = 0; i<=cuvant.length()/2 ;i++ ){
                if(cuvant.charAt(i) == cuvant.charAt(cuvant.length()- i -1)) 
                k++;
            }
            if (k == cuvant.length()/2 + 1) 
                System.out.println("Este palindrom");
            else 
                System.out.println("Nu este palindrom");
         }
        else {
            for( i = 0; i<cuvant.length()/2 ;i++ ){
                if(cuvant.charAt(i) == cuvant.charAt(cuvant.length()- i -1)) 
                k++;
            }
            if (k == cuvant.length()/2) 
                System.out.println("Este palindrom");
            else 
                System.out.println("Nu este palindrom");
        }
        */
        /*
        // Verificarea Goldback
        System.out.println("Scrieti intervalul dorit");
        int m= tas.nextInt(),
            n= tas.nextInt();
        for(int i=m; i<=n; i++){
            int ok=0;
            if(i%2 == 0){
                for(int j=2; j<=i/2; j++){
                   if( isprime(j) ==  true && isprime(i-j) == true){
                     System.out.println(i + " Verifica conjunctura lui Goldbach");
                     ok=1;
                     break;
                    }
                   
                }
                if (ok==0)
                    System.out.println(i + " Nu verifica conjunctura "
                            + "lui Goldbach");
            }
            
        }
        */
        
       //int value = 10;
       //for(int i = 1, j = 0; i < 256; i = i << 1, j++)
        //    System.out.println(j + "   " + ((value & i) > 0 ? 1 : 0));
          System.out.println(intToString(5463, 4));

    }
                
    }
    

