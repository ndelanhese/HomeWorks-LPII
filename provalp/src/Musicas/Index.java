package Musicas;
public class Index {
    public static void main(String[] args) {
String musica = "Highway to Hell";
Double duracao = 3.52;
String artista = "AC/DC";
String album = "Highway to Hell";

Musica musicaClass = new Musica(musica, duracao, artista, album);

        System.out.println(musicaClass.getNome());
        System.out.println(musicaClass.getDuracao());
        System.out.println(musicaClass.getArtista());
        System.out.println(musicaClass.getAlbum());

    }
    
}
