package src;

public class Singleton {
    private static Singleton instancia;

    private Singleton() {
        // Constructor privado para evitar instanciación externa
    }

    public static Singleton obtenerInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    public void mostrarMensaje() {
        System.out.println("Bienvenido a la Tienda de Manga!");
    }
}
