import java.util.Scanner;

public class ValidadorNumerosAmigos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el inicio del rango: ");
        int inicio = input.nextInt();
        System.out.print("Ingrese el fin del rango: ");
        int fin = input.nextInt();
        if (inicio > fin) {
            System.out.println("El rango no es válido. El inicio debe ser menor o igual que el fin.");
            input.close();
            return;
        }
        boolean encontrado = false;
        for (int i = Math.max(2,inicio); i < fin; i++) {
            System.out.println(i);
            int contadorDivisores = 0;
            int primerDivisor = 0;
            int segundoDivisor = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    contadorDivisores++;
                    if (contadorDivisores == 1) {
                        primerDivisor++;
                    } else if (contadorDivisores == 2) {
                        segundoDivisor++;
                    }else{
                        break;
                    }
                    }
                }
                if (contadorDivisores == 2 ) {
                    encontrado = true;
                    System.out.println(  i + " es un número amigo con divisores: " + primerDivisor + ", " + segundoDivisor);
                }
            }
          
            if (!encontrado) {
                System.out.println("No se encontraron números amigos en el rango proporcionado.");
            }
            input.close();
        }
    }
