package src;

//Utiliza patron adapter porque se esta viendo el metodo de envio

public class Cliente {
    protected MetodoEnvio metodoEnvio;

    public Cliente(MetodoEnvio metodoEnvio) {
        this.metodoEnvio = metodoEnvio;
    }

    public void comprar(String manga) {
        System.out.println("Comprando manga: " + manga);
        metodoEnvio.enviar(manga);
    }
}
