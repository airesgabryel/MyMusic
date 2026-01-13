package br.com.alura.mymusic.principal;
import br.com.alura.mymusic.modelos.Audio;
import br.com.alura.mymusic.modelos.MinhasPreferidas;
import br.com.alura.mymusic.modelos.Musica;
import br.com.alura.mymusic.modelos.Podcast;

public class Principal {
    static void main(String[] args) {
        Musica myMusic = new Musica();
        myMusic.setTitulo("Máquina do Tempo");
        myMusic.setCantor("Matuê");

        for (int i = 0; i < 1000; i++) {
            myMusic.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.curte();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitulo("Bolha Dev");
        myPodcast.setApresentador("Gabryel Aires");

        for (int i = 0; i < 1000; i++) {
            myPodcast.reproduz();
        }

        for (int i = 0; i < 500; i++) {
            myPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(myPodcast);
        preferidas.inclui(myMusic);

    }
}
