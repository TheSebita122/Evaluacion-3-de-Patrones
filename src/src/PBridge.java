
package src;

public interface PBridge {
    void enviar(String manga);
}

class EnvioCorreo implements MetodoEnvio {
    @Override
    public void enviar(String manga) {
        System.out.println("Enviando " + manga + " por correo.");
    }
}

class EnvioFisico implements MetodoEnvio {
    @Override
    public void enviar(String manga) {
        System.out.println("Enviando " + manga + " físicamente.");
    }
}
