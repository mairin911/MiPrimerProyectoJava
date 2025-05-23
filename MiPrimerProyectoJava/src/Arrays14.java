public class Arrays14 { // Declaración de la clase principal

    public static void main(String[] args) { // Método principal donde inicia la ejecución
        java.util.Scanner sc = new java.util.Scanner(System.in); // Se crea un objeto Scanner para leer datos desde el teclado

        double[] precios = new double[5]; // Arreglo para almacenar los precios de 5 artículos
        int[][] cantidades = new int[4][5]; // Matriz para almacenar las cantidades vendidas por 4 sucursales y 5 artículos

        // Leer precios de los artículos
        System.out.println("Ingrese los precios de los 5 artículos:"); // Mensaje para el usuario
        for (int i = 0; i < 5; i++) { // Bucle para recorrer los 5 artículos
            System.out.print("Precio del artículo " + (i + 1) + ": "); // Solicita el precio del artículo i+1
            precios[i] = sc.nextDouble(); // Almacena el precio ingresado en el arreglo precios
        }

        // Leer cantidades vendidas por sucursal y artículo
        for (int suc = 0; suc < 4; suc++) { // Bucle para recorrer las 4 sucursales
            System.out.println("Ingrese las cantidades vendidas en la sucursal " + (suc + 1) + ":"); // Mensaje para el usuario
            for (int art = 0; art < 5; art++) { // Bucle para recorrer los 5 artículos
                System.out.print("Cantidad del artículo " + (art + 1) + ": "); // Solicita la cantidad vendida del artículo art+1
                cantidades[suc][art] = sc.nextInt(); // Almacena la cantidad en la matriz cantidades
            }
        }

        // Cantidades totales de cada artículo
        System.out.println("\nCantidades totales de cada artículo:"); // Mensaje para el usuario
        for (int art = 0; art < 5; art++) { // Bucle para recorrer los 5 artículos
            int total = 0; // Inicializa el total de cada artículo
            for (int suc = 0; suc < 4; suc++) { // Bucle para recorrer las 4 sucursales
                total += cantidades[suc][art]; // Suma la cantidad vendida en cada sucursal
            }
            System.out.println("Artículo " + (art + 1) + ": " + total); // Muestra el total vendido del artículo
        }

        // Cantidad de artículos en la sucursal 2
        int totalSucursal2 = 0; // Inicializa el total de la sucursal 2
        for (int art = 0; art < 5; art++) { // Bucle para recorrer los 5 artículos
            totalSucursal2 += cantidades[1][art]; // Suma la cantidad de cada artículo en la sucursal 2 (índice 1)
        }
        System.out.println("\nCantidad total de artículos en la sucursal 2: " + totalSucursal2); // Muestra el total

        // Cantidad del artículo 3 en la sucursal 1
        System.out.println("\nCantidad del artículo 3 en la sucursal 1: " + cantidades[0][2]); // Muestra la cantidad del artículo 3 (índice 2) en la sucursal 1 (índice 0)

        // Recaudación total de cada sucursal
        double[] recaudacionSucursal = new double[4]; // Arreglo para almacenar la recaudación de cada sucursal
        System.out.println("\nRecaudación total de cada sucursal:"); // Mensaje para el usuario
        for (int suc = 0; suc < 4; suc++) { // Bucle para recorrer las 4 sucursales
            double total = 0; // Inicializa el total recaudado por sucursal
            for (int art = 0; art < 5; art++) { // Bucle para recorrer los 5 artículos
                total += cantidades[suc][art] * precios[art]; // Suma el producto de la cantidad vendida por el precio
            }
            recaudacionSucursal[suc] = total; // Almacena el total en el arreglo
            System.out.printf("Sucursal %d: %.2f\n", (suc + 1), total); // Muestra la recaudación de la sucursal
        }

        // Recaudación total de la empresa
        double recaudacionTotal = 0; // Inicializa la recaudación total
        for (double rec : recaudacionSucursal) { // Bucle para recorrer la recaudación de cada sucursal
            recaudacionTotal += rec; // Suma la recaudación de cada sucursal
        }
        System.out.printf("\nRecaudación total de la empresa: %.2f\n", recaudacionTotal); // Muestra la recaudación total

        // Sucursal de mayor recaudación
        int sucMayor = 0; // Inicializa el índice de la sucursal con mayor recaudación
        for (int i = 1; i < 4; i++) { // Bucle para comparar las sucursales
            if (recaudacionSucursal[i] > recaudacionSucursal[sucMayor]) { // Si la sucursal actual tiene mayor recaudación
                sucMayor = i; // Actualiza el índice de la sucursal con mayor recaudación
            }
        }
        System.out.println("\nSucursal de mayor recaudación: " + (sucMayor + 1)); // Muestra la sucursal con mayor recaudación
        sc.close(); // Cierra el Scanner
    }

}
