public class TablasdeDistancias {
    public static void main(String[] args) throws Exception {
    int[][] distancias = {
        {0, 10, 15, 20},
        {10, 0, 35, 25},
        {15, 35, 0, 30},
        {20, 25, 30, 0}
    };
    System.out.println("La distancia entre Ciudad 1 y Ciudad 3 es: " + distancias[0][2]);
}
}
