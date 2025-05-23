public class U09 {

    public static void main(String[] args) {
        // Crea un objeto Scanner para leer datos desde la entrada estándar (teclado)
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Solicita al usuario que ingrese la primera nota
        System.out.print("Ingrese la primera nota: ");
        // Lee la primera nota como un número decimal (double)
        double nota1 = scanner.nextDouble();

        // Solicita al usuario que ingrese la segunda nota
        System.out.print("Ingrese la segunda nota: ");
        // Lee la segunda nota como un número decimal (double)
        double nota2 = scanner.nextDouble();

        // Solicita al usuario que ingrese la tercera nota
        System.out.print("Ingrese la tercera nota: ");
        // Lee la tercera nota como un número decimal (double)
        double nota3 = scanner.nextDouble();

        // Calcula el promedio de las tres notas
        double promedio = (nota1 + nota2 + nota3) / 3;

        // Si el promedio es mayor o igual a 7, imprime "Promocionado"
        if (promedio >= 7) {
            System.out.println("Promocionado");
        // Si el promedio es mayor o igual a 4 pero menor que 7, imprime "Regular"
        } else if (promedio >= 4) {
            System.out.println("Regular");
        // Si el promedio es menor que 4, imprime "Reprobado"
        } else {
            System.out.println("Reprobado");
        }

        // Cierra el objeto Scanner para liberar recursos
        scanner.close();
    }
}
