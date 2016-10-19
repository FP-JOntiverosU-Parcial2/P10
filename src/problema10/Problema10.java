/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema10;
import java.util.*;
/**
 *
 * @author jaime
 */
public class Problema10 {

    private static int i;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,o;                 
        n=solicitarDato(); //pedimos el dato
        o=operacion(n);     //operacion
        mensajeSalida();   //agradecemos y salir
    }
    public static int solicitarDato(){
        int n;
        Scanner teclado= new Scanner (System.in);
        System.out.println("Introduce un numero para mostrar los primeros numeros de la serie de fibonaci de ese numero");
        n=teclado.nextInt();
        return n;
    }
    public static int operacion(int n){
        int numero1= 1, numero2= 1;   
        System.out.println("Los primeros " + n + " numeros de la serie de Fibonacci son: " );
        System.out.println("0 ");
        System.out.println(numero1 + "");
        for(i=2; i<=n-1; i++){             // se introduce la variable y va aumentando mientras no se pase del numero "n"
            System.out.println (numero2 + "");
           numero2= numero1 + numero2;
        numero1= numero2 - numero1;
     
    }
        
       
    return n;
}
    public static void mensajeSalida(){
        System.out.println("Gracias por usar el programa");
        System.exit(0);
    }
}
