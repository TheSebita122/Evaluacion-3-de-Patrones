package src;

//se utiliza patron MangaIterator ya que recorrer una colección de elementos, uno a uno

import java.util.List;

public class MangaIterator implements PIterator {
    private List<Manga> Mangas;
    private int position;

    public MangaIterator(List<Manga> mangas) {
        this.Mangas = mangas;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < Mangas.size();
    }

    @Override
    public Manga next() {
        if (hasNext()) {
            return Mangas.get(position++);
        }
        return null; // o lanzar excepción si prefieres
    }
}
