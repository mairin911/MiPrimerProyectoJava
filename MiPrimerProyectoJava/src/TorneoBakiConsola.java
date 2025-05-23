import java.util.*;

class Luchador {
    private String nombre;
    private int vida;
    private int fuerza;
    private int velocidad;
    private List<String> tecnicas;
    private List<Integer> danios;
    private int experiencia;
    private boolean espaldaOgroActivada;
    private boolean invencible;

    public Luchador(String nombre, int fuerza, int velocidad, List<String> tecnicas, List<Integer> danios, boolean invencible) {
        this.nombre = nombre;
        this.vida = invencible ? Integer.MAX_VALUE : 100;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.tecnicas = new ArrayList<>(tecnicas);
        this.danios = new ArrayList<>(danios);
        this.experiencia = 0;
        this.espaldaOgroActivada = false;
        this.invencible = invencible;
    }

    public String getNombre() { return nombre; }
    public int getVida() { return vida; }
    public int getFuerza() { return fuerza; }
    public int getVelocidad() { return velocidad; }
    public List<String> getTecnicas() { return tecnicas; }
    public List<Integer> getDanios() { return danios; }
    public int getExperiencia() { return experiencia; }
    public boolean esInvencible() { return invencible; }

    public void activarEspaldaDelOgro() {
        if (!espaldaOgroActivada) {
            System.out.println("\n¡" + nombre + " activa la ESPALDA DEL OGRO! Daño aumentado.");
            for (int i = 0; i < danios.size(); i++) {
                danios.set(i, danios.get(i) + 10);
            }
            espaldaOgroActivada = true;
        } else {
            System.out.println("La Espalda del Ogro ya fue activada.");
        }
    }

    public void ganarExperiencia() {
        experiencia += 10;
        fuerza += 2;
        velocidad += 2;
    }

    public void recibirDanio(int danio) {
        if (!invencible) {
            vida -= danio;
            if (vida < 0) vida = 0;
        }
    }

    public boolean estaVivo() {
        return vida > 0 || invencible;
    }

    @Override
    public String toString() {
        return nombre + " (Vida: " + (invencible ? "∞" : vida) + ", Fuerza: " + fuerza +
               ", Velocidad: " + velocidad + ", Técnicas: " + tecnicas + ", Exp: " + experiencia + ")";
    }
}

public class TorneoBakiConsola {
    private static final Scanner sc = new Scanner(System.in);
    private static final Random random = new Random();

    public static void main(String[] args) {
        List<Luchador> luchadores = Arrays.asList(
            new Luchador("Baki", 95, 100,
                    Arrays.asList("Mach Punch", "Koroshite Yaru", "Rear Naked Choke", "Espalda del Ogro"),
                    Arrays.asList(25, 28, 22, 0), false),
            new Luchador("Hanayama", 95, 70,
                    Arrays.asList("Yakuza Punch", "Bear Hug", "One Arm Grab", "Neck Breaker"),
                    Arrays.asList(25, 22, 18, 30), false),
            new Luchador("Katsumi", 80, 60,
                    Arrays.asList("Mach Elbow", "Seiken Tsuki", "Kaiten Geri", "Martelo"),
                    Arrays.asList(20, 18, 22, 15), false),
            new Luchador("Doppo", 80, 85,
                    Arrays.asList("Tiger Bite Fist", "Mawashi Geri", "Uppercut Karateka", "Sweep Kick"),
                    Arrays.asList(15, 18, 20, 10), false),
            new Luchador("Yujiro Hanma", 9999, 9999,
                    Arrays.asList("Demon Back", "Earthquake Punch", "Flash Elbow", "Finger Snap"),
                    Arrays.asList(999, 999, 999, 999), true),
            new Luchador("Jack Hanma", 100, 75,
                    Arrays.asList("Titan Punch", "Jaw Breaker", "Bite Attack", "Berserker Rush"),
                    Arrays.asList(28, 25, 20, 22), false),
            new Luchador("Retsu Kaioh", 85, 95,
                    Arrays.asList("Shaolin Barrage", "Qigong Palm", "Flying Kick", "Iron Fist"),
                    Arrays.asList(20, 15, 22, 25), false),
            new Luchador("Oliva Biscuit", 110, 50,
                    Arrays.asList("Muscle Slam", "Bear Grip", "Power Bomb", "Chest Crush"),
                    Arrays.asList(30, 28, 35, 25), false),
            new Luchador("Shibukawa Goki", 70, 100,
                    Arrays.asList("Redirect Throw", "Aiki Grip", "Joint Lock", "Energy Redirection"),
                    Arrays.asList(18, 22, 20, 15), false),
            new Luchador("Pickle", 120, 60,
                    Arrays.asList("Dinosaur Slam", "Primitive Roar", "Bite Takedown", "Wild Charge"),
                    Arrays.asList(35, 25, 30, 28), false)
        );

        System.out.println("Escoge tu luchador:");
        for (int i = 0; i < luchadores.size(); i++) {
            System.out.println((i + 1) + ". " + luchadores.get(i).getNombre());
        }

        int elegido;
        while (true) {
            System.out.print("Ingresa un número del 1 al " + luchadores.size() + ": ");
            elegido = sc.nextInt();
            if (elegido >= 1 && elegido <= luchadores.size()) break;
            System.out.println("Número inválido, intenta de nuevo.");
        }

        Luchador miLuchador = luchadores.get(elegido - 1);

        Luchador contrincante;
        do {
            contrincante = luchadores.get(random.nextInt(luchadores.size()));
        } while (contrincante == miLuchador);

        System.out.println("\nTu luchador es: " + miLuchador);
        System.out.println("Tu oponente es: " + contrincante);

        boolean turnoJugador = true;

        while (miLuchador.estaVivo() && contrincante.estaVivo()) {
            if (turnoJugador) {
                System.out.println("\nEs tu turno. Escoge tu técnica:");
                List<String> tecnicas = miLuchador.getTecnicas();
                for (int i = 0; i < tecnicas.size(); i++) {
                    System.out.println((i + 1) + ". " + tecnicas.get(i));
                }

                int tecnicaElegida;
                while (true) {
                    System.out.print("Ingresa un número del 1 al " + tecnicas.size() + ": ");
                    tecnicaElegida = sc.nextInt();
                    if (tecnicaElegida >= 1 && tecnicaElegida <= tecnicas.size()) break;
                    System.out.println("Número inválido, intenta de nuevo.");
                }

                String tecnica = tecnicas.get(tecnicaElegida - 1);

                if (miLuchador.getNombre().equals("Baki") && tecnica.equals("Espalda del Ogro")) {
                    miLuchador.activarEspaldaDelOgro();
                } else {
                    int danio = miLuchador.getDanios().get(tecnicaElegida - 1);
                    System.out.println("Usaste la técnica: " + tecnica + " causando " + danio + " de daño.");
                    contrincante.recibirDanio(danio);
                }

            } else {
                List<String> tecnicas = contrincante.getTecnicas();
                int indice = random.nextInt(tecnicas.size());
                String tecnica = tecnicas.get(indice);
                int danio = contrincante.getDanios().get(indice);
                System.out.println("\nTurno del contrincante " + contrincante.getNombre());
                System.out.println("El contrincante usó la técnica: " + tecnica + " causando " + danio + " de daño.");
                miLuchador.recibirDanio(danio);
            }

            System.out.println("\nEstado actual:");
            System.out.println(miLuchador.getNombre() + " - Vida: " + (miLuchador.esInvencible() ? "∞" : miLuchador.getVida()));
            System.out.println(contrincante.getNombre() + " - Vida: " + (contrincante.esInvencible() ? "∞" : contrincante.getVida()));

            turnoJugador = !turnoJugador;
        }

        System.out.println("\n--- Resultado del combate ---");
        if (miLuchador.estaVivo()) {
            System.out.println("¡Ganaste el combate!");
            miLuchador.ganarExperiencia();
        } else {
            System.out.println("Perdiste el combate. Mejor suerte la próxima vez.");
        }

        System.out.println("Estado final de tu luchador:");
        System.out.println(miLuchador);
    }
}