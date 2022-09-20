package Notas;
import java.util.ArrayList;
public class Notas {
private String notaTurma;
private ArrayList<Double> listaNotas;

    public Notas(String notaTurma, ArrayList<Double> listaNotas) {
        this.notaTurma = notaTurma;
        this.listaNotas = listaNotas;
        listaNotas = new ArrayList<>();
    }

    public void addNota(Double nota){
        listaNotas.add(nota);
    }
    
    public void limparNotas(){
        listaNotas.clear();
    }
    public Double mediaNotas(){
        Double soma = 0.0;
        for (int i = 0; i < listaNotas.size(); i++) {
            soma += listaNotas.get(i);
        }
        return soma / listaNotas.size();
 
    }
    
    public int acimaMedia(){
        int acimaDaMedia = 0;
        for (int i = 0; i < listaNotas.size(); i++) {
            if(listaNotas.get(i) > mediaNotas()){
                acimaDaMedia++;
            }
        }
        return acimaDaMedia;
    }


}
