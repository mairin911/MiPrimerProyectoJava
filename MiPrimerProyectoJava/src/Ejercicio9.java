import java.util.Scanner;

public class Ejercicio9 {
        public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.println("ingrese nota uno");
     int Nota1 = sc.nextInt();
     System.out.println("ingrese nota dos");
     int Nota2 = sc.nextInt();
     System.out.println("ingrese nota tres");
     int Nota3 = sc.nextInt();
     sc.close();
     
     double promedio = (Nota1 + Nota2 + Nota3) / 3.0;
      if (promedio >=7){
            System.out.println("Promocionado");
        } else if (promedio >=4 && promedio <7){
            System.out.println("Regular");
        } else {
            System.out.println("Reprobado");
      }
        }
    }