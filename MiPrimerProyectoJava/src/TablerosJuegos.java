// Clase que representa un tablero de juego y lo imprime en consola
public class TablerosJuegos {
    
    public static void main(String[] args) throws Exception {
        // Declaración e inicialización del tablero de juego
        char[][] tablero = {
            {'X', 'O', 'X'},
            {'O', 'X', 'O'},
            {' ', ' ', 'X'} // espacios vacíos
        };
        
        // Bucle para imprimir el tablero en consola
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
