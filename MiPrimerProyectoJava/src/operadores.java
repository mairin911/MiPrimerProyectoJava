import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numeroUno = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numeroDos = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int numeroTres = scanner.nextInt();
         scanner.close();

        boolean resultadoUno = (numeroUno > numeroDos) && (numeroTres > numeroUno);
        int a = numeroUno;
        int b = numeroDos;
        int c = numeroTres;
        boolean resultadoDos = (a > b);
        boolean resultadoTres = (c > a);


        System.out.println("el primer numero es mayor que el segundo y menor que el tercero:" + resultadoUno);
        System.out.println("el primer numero es mayor que el segundo :" + resultadoDos);
        System.out.println("el primer numero es menor que el tercero:" + resultadoTres);
}
}