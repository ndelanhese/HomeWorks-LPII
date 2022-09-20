package Playlist;
import java.util.ArrayList;
public class Index {
    public static void main(String[] args) {

        String nomePlaylist = "Meus révi metaú";
        
        ArrayList musicasLista = new ArrayList<String>();
        musicasLista.add("Highway to Hell");
        musicasLista.add("Vai lacraia");
        musicasLista.add("Segura o tchan");
        musicasLista.add("Thacabun");
        musicasLista.add("Quem vai querer a minha periquita");
        

        Playlist playlist = new Playlist(nomePlaylist, musicasLista);
        playlist.adicionarMusica("Era só mais um silva");
        playlist.passaMusica();
        System.out.println(playlist.mostraMusicaAtual());
        System.out.println(playlist.getListaMusicas());
        System.out.println(playlist.musicas());
        
    }
    
}
