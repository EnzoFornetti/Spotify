package br.com.bec.spotfy.modelos;

public class Musicas extends Audio{

    private String artista;
    private String genero;
    private String album;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public void imprime(){
        System.out.println("""
                %s - %s
                %d minutos e %d segundos
                Album: %s
                Genero: %s
                Curtidas: %d
                Reproducoes: %d
                Classificacao: %.2f
                """.formatted(getTitulo(), getArtista(), getDuracaoEmSegundos()/60, getDuracaoEmSegundos()%60,
                                getAlbum(), getGenero(), getTotalDeCurtidas(), getTotalDeReproducoes(), getClassificacao()));
    }
}
