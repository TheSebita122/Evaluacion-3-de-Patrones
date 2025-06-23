package src;

public class EnvioFisico implements MetodoEnvio {
    @Override
    public void enviar(String manga) {
        System.out.println("Enviando " + manga + " físicamente.");
    }
}