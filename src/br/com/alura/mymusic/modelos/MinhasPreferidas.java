package br.com.alura.mymusic.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao()>=8) {
            System.out.println(audio.getTitulo() + " é considerado sucesso e preferido! ");
        } else {
            System.out.println(audio.getTitulo()+" também está sendo curtido!");
        }
    }
}
