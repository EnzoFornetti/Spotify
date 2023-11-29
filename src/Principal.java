import br.com.bec.spotfy.modelos.MinhasPreferidas;
import br.com.bec.spotfy.modelos.Musicas;
import br.com.bec.spotfy.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Musicas fn = new Musicas();
        fn.setArtista("Dua Lipa");
        fn.setGenero("Pop");
        fn.setAlbum("Future Nostalgia");
        fn.setTitulo("Levitating");
        fn.setDuracaoEmSegundos(200);
        fn.avalia(9);
        fn.avalia(8);
        for (int i = 0; i < 1050; i++){
            fn.curte();
        }
        for (int i = 0; i < 6550; i++){
            fn.reproduz();
        }

        Musicas mn = new Musicas();
        mn.setArtista("Lil Nas X");
        mn.setGenero("Pop/Rap");
        mn.setAlbum("Montero");
        mn.setTitulo("Montero");
        mn.setDuracaoEmSegundos(160);
        mn.avalia(5);
        mn.avalia(8);
        for (int i = 0; i < 1430; i++){
            mn.curte();
        }
        for (int i = 0; i < 3950; i++){
            mn.reproduz();
        }

        Musicas abc = new Musicas();
        abc.setArtista("Olivia Rodrigo");
        abc.setGenero("Pop");
        abc.setAlbum("PopArt");
        abc.setTitulo("ABCDEFU");
        abc.setDuracaoEmSegundos(120);
        abc.avalia(3);
        abc.avalia(2);
        for (int i = 0; i < 290; i++){
            abc.curte();
        }
        for (int i = 0; i < 13950; i++){
            abc.reproduz();
        }

        Podcast pdp = new Podcast();
        pdp.setAutor("Pode Pah");
        pdp.setTitulo("Entrevista Renato Augusto");
        pdp.setDuracaoEmSegundos(9000);
        pdp.setDescricao("Chamamos o RA8 para o estúdio");
        for (int i = 0; i < 1290; i++){
            pdp.curte();
        }
        for (int i = 0; i < 1350; i++){
            pdp.reproduz();
        }

        MinhasPreferidas prediletas = new MinhasPreferidas();

        prediletas.inserirPreferida(fn);
        prediletas.inserirPreferida(fn);

        fn.avalia(0);
        fn.avalia(8);

        prediletas.inserirPreferida(fn);
        prediletas.inserirPreferida(fn);
        prediletas.inserirPreferida(fn);

        abc.imprime();

        prediletas.inserirPreferida(fn);
        prediletas.inserirPreferida(fn);
        prediletas.inserirPreferida(mn);
        prediletas.inserirPreferida(pdp);

        prediletas.imprimirTitulos();
    }
}
