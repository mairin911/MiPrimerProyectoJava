public class Ejercicio_tienda 
{
    public static void main(String[] args) {
        float precioCamisa = 25.0f;
        float precioPantalon = 30.0f;
        float descuentoUno = 0.15f;
        float masCamisa = 0.5f;
        
        float totalDescuento = descuentoUno * (precioCamisa + precioPantalon);
        float segundoDescuento = masCamisa * (totalDescuento + precioCamisa);
        System.out.println("Precio total con una camiseta y un pantalón: $" + totalDescuento);
        System.out.println("Precio total con dos camisetas y un pantalón: $" + segundoDescuento);
    }
}