package br.com.bec.spotfy.modelos;

import java.util.ArrayList;

public class MinhasPreferidas {

    private int totalDeAudios = 0;
    ArrayList<Audio> listaPreferidos = new ArrayList<>(5);

    public void inserirPreferida(Audio audio){

        listaPreferidos.add(audio);
        totalDeAudios++;

        if(audio.getClassificacao() >= 8){
            System.out.println("Otima escolha, todos estão ouvindo " + audio.getTitulo() + " no momento");
        } else if (audio.getClassificacao() >= 6) {
            System.out.println("Boa escolha");
        }
    }

    public void imprimirTitulos(){
        for (int i = 0; i < totalDeAudios; i++){
            System.out.println("\n");
            listaPreferidos.get(i).imprime();
        }
    }
}
