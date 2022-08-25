package bean;

import java.util.ArrayList;

public class AnimaisDeEstimacao {

    private String nome;
    private Integer idade = 3;
    private String especie;
    private String raca;
    private String sexo;
    private String tutor;
    private ArrayList<String> listaVacinas;

    public AnimaisDeEstimacao(String especie, String raca, String sexo) {
        this.especie = especie;
        this.raca = raca;
        this.sexo = sexo;
        listaVacinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public ArrayList<String> getListaVacinas() {
        return listaVacinas;
    }

    public void setListaVacinas(ArrayList<String> listaVacinas) {
        this.listaVacinas = listaVacinas;
    }

    public void fazAniversario() {
        this.idade += 1;
    }

    public void adicionarVacina(String vacina) {
        this.listaVacinas.add(vacina);
    }

    public Integer getQuantidadeDeVacinas() {
        return this.listaVacinas.size();
    }

    @Override
    public String toString() {
        return "AnimaisDeEstimacao{" + "nome=" + nome + ", idade=" + idade + ", especie=" + especie + ", raca=" + raca + ", sexo=" + sexo + ", tutor=" + tutor + ", listaVacinas=" + listaVacinas.size() + '}';
    }

}
