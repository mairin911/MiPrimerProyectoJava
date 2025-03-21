import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.println( "ingrese primer numero: ");
     int numUno = sc.nextInt();
     System.out.println( "ingrese segundo numero: ");
     int numDos = sc.nextInt();
      sc.close();
     if (numUno > numDos){
       int suma=  numUno+numDos;
       int resta= numUno-numDos;
       System.out.println("la suma es: " + suma);
       System.out.println("la resta es: " + resta);
     }
      else if (numUno < numDos){
        int mult=  numUno*numDos;
        double div= (double) numDos / numUno;
        System.out.println("la multiplicacion es: " + mult);
        System.out.println("la divicion: " + div);
      }
    }
}

