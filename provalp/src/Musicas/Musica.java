package Musicas;
public class Musica {
private String nome;
private Double duracao;
private String artista;
private String album;

    public Musica(String nome, Double duracao, String artista, String album) {
        this.nome = nome;
        this.duracao = duracao;
        this.artista = artista;
        this.album = album;
    }

    public String getNome() {
        return nome;
    }

    public Double getDuracao() {
        return duracao;
    }

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }


}
