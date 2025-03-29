public class FiltrarDatos {
    public static void main(String[] args) throws Exception {
        int[] numeros = {5, 8, 13, 22, 35, 42};

System.out.println("Números pares:");
for (int numero : numeros) {
    if (numero % 2 == 0) {
        System.out.println(numero);
    }
}
    }
}
