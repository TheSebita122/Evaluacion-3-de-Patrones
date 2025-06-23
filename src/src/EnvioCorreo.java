package src;

public class EnvioCorreo implements MetodoEnvio {
    @Override
    public void enviar(String manga) {
        System.out.println("Enviando " + manga + " por correo.");
    }
}
