public class Ejercicio_banco
 
{
    public static void main(String[] args) {
        int dineroInicial = 1000;
        int retirosSemana = 200;
        byte totalSemanas = 4;
        int totalDinero = dineroInicial - (retirosSemana * totalSemanas);
        System.out.println("total en cuenta un mes despues: $" + totalDinero);
    }
}