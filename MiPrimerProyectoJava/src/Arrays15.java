public class Arrays15 { // Define la clase principal llamada Arrays15

    public static void main(String[] args) { // Método principal donde inicia la ejecución del programa
        String[][] equipos = { // Declara y define un arreglo bidimensional de Strings llamado 'equipos'
            {"Real Madrid", "Barcelona"}, // Cada elemento es un arreglo con dos equipos de fútbol
            {"Atletico", "Sevilla"},
            {"Valencia", "Villarreal"},
            {"Betis", "Espanyol"},
            {"Athletic", "Real Sociedad"},
            {"Celta", "Granada"},
            {"Osasuna", "Mallorca"},
            {"Levante", "Alaves"},
            {"Getafe", "Elche"},
            {"Cadiz", "Rayo Vallecano"},
            {"Girona", "Zaragoza"},
            {"Tenerife", "Las Palmas"},
            {"Sporting", "Oviedo"},
            {"Eibar", "Leganes"},
            {"Huesca", "Mirandes"}
        };

        int[][] resultados = { // Declara y define un arreglo bidimensional de enteros llamado 'resultados'
            {2, 1}, // Cada elemento representa los goles de cada equipo en el partido correspondiente
            {1, 1},
            {0, 2},
            {3, 0},
            {2, 2},
            {1, 0},
            {0, 1},
            {1, 3},
            {2, 2},
            {0, 0},
            {1, 2},
            {2, 1},
            {0, 0},
            {3, 2},
            {1, 1}
        };

        System.out.println("Resultados de la Quiniela:"); // Imprime el título antes de mostrar los resultados

        for (int i = 0; i < equipos.length; i++) { // Bucle que recorre todos los partidos (filas del arreglo)
            System.out.println( // Imprime el resultado de cada partido en formato legible
                (i + 1) + ". " + // Imprime el número de partido (empezando desde 1)
                equipos[i][0] + " " + resultados[i][0] + // Imprime el nombre del primer equipo y sus goles
                " - " + // Imprime un guion separador
                resultados[i][1] + " " + equipos[i][1] // Imprime los goles y el nombre del segundo equipo
            );
        }
    }
}
