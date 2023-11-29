package br.com.bec.spotfy.modelos;

public class Audio {

    private String titulo;
    private int duracaoEmSegundos;
    private int totalDeReproducoes = 0;
    private int totalDeCurtidas = 0;
    private int totalDeAvaliacoes = 0;
    private double somaDasAvaliacoes;

    public void curte(){
        totalDeCurtidas++;
    }

    public void reproduz(){
        totalDeReproducoes++;
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public double getClassificacao() {
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracaoEmSegundos(int duracaoEmSegundos) {
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public void imprime(){
    }
}
