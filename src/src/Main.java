package src;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       
       
        //se hace uso patron de diseño singleton
        Singleton tiendaManga = Singleton.obtenerInstancia();
        tiendaManga.mostrarMensaje();

        // se hace uso patron de adapter iterator
        SistemaPago sistemaPago = new PAdapter(new PagoExterno());
        sistemaPago.pagar(150.000);

        // se hace uso patron de diseño iterator
        Manga[] mangas = {
            new Manga("Dragon Ball", "Autor", "Genero"),
            new Manga("Kaoru Hana", "Autor", "Genero"),
            new Manga("Sailor Moon", "Autor", "Genero")
        };
        MangaIterator iterator = new MangaIterator(Arrays.asList(mangas));
        while (iterator.hasNext()) {
            Manga manga = iterator.next();
            System.out.println("Manga available: " + manga.getTitulo());
        }

        // se hace uso patron de diseño bridge
        Cliente cliente = new ClienteRegular(new EnvioCorreo());
        cliente.comprar("Sword Art Online");
    }
}
