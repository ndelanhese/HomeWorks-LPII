package Notas;
import java.util.ArrayList;

public class Index {
    public static void main(String[] args) {

        String nome = "Turma";
        ArrayList<Double> listaNotas = new ArrayList();
        
        listaNotas.add(44.1);
        listaNotas.add(34.1);
        listaNotas.add(24.1);
        listaNotas.add(14.1);
        listaNotas.add(4.1);
        
        Notas notas = new Notas(nome, listaNotas);
        
        notas.addNota(90.0);
        System.out.println(notas.mediaNotas());
        System.out.println(notas.acimaMedia());
        notas.limparNotas();

    }
    
}
