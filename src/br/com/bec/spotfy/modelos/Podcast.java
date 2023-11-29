package br.com.bec.spotfy.modelos;

public class Podcast extends Audio {

    private String autor;
    private String descricao;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void imprime(){
        System.out.println("""
                %s - %s
                %d minutos e %d segundos
                Descricao: %s
                Curtidas: %d
                Reproducoes: %d
                Classificacao: %.2f
                """.formatted(getTitulo(), getAutor(), getDuracaoEmSegundos()/60, getDuracaoEmSegundos()%60,
                                 getDescricao(), getTotalDeCurtidas(), getTotalDeReproducoes(), getClassificacao()));
    }
}
