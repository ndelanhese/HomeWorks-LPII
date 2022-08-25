package Main;

import bean.AnimaisDeEstimacao;

public class Index {

    public static void main(String[] args) {

        AnimaisDeEstimacao animalDeEstimacao = new AnimaisDeEstimacao("Cachorro", "Vira Lata", "Feminino");
        animalDeEstimacao.fazAniversario();
        animalDeEstimacao.adicionarVacina("Covid");
        System.out.println(animalDeEstimacao.toString());
    }

}
