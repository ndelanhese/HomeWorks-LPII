package Playlist;

import java.util.ArrayList;

public class Playlist {

    private String nomePlaylist;
    private ArrayList<String> listaMusicas;
    private int musicaAtual = 0;

    public Playlist(String nomePlaylist, ArrayList<String> listaMusicas) {
        this.nomePlaylist = nomePlaylist;
        this.listaMusicas = listaMusicas;
        listaMusicas = new ArrayList();
    }

    public void adicionarMusica(String musica){
        this.listaMusicas.add(musica);
    }
    
    public String getNomePlaylist() {
        return nomePlaylist;
    }

    public ArrayList<String> getListaMusicas() {
        
    
        return listaMusicas;
    }

    public String mostraMusicaAtual() {
        return listaMusicas.get(musicaAtual);
    }

    public void passaMusica() {
        if (musicaAtual < (this.listaMusicas.size() - 1)) {
            musicaAtual++;
        }
    }
    
    public int musicas(){
        return listaMusicas.size();
    }

}
