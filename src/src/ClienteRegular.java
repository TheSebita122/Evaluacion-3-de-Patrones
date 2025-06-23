package src;

public class ClienteRegular extends Cliente {

    public ClienteRegular(MetodoEnvio metodoEnvio) {
        super(metodoEnvio);
    }

    @Override
    public void comprar(String manga) {
        System.out.println("Cliente regular comprando manga: " + manga);
        metodoEnvio.enviar(manga);
    }
}
