package Alarmes;

import java.util.TreeSet;


public class Alarmes {

    private String nome;
    private TreeSet<String> listaHorarios;

    public Alarmes(String nome, TreeSet<String> listaHorarios) {
        this.nome = nome;
        this.listaHorarios = listaHorarios;
        listaHorarios = new TreeSet<>();
    }

    public String getNome() {
        return nome;
    }

    public TreeSet<String> getListaHorarios() {
        return listaHorarios;
    }
    
    public void adicionaAlarme(String horario){
        this.listaHorarios.add(horario);
    }
    
    public void removerAlarme(String horario){
        for (int i = 0; i < listaHorarios.size(); i++) {
            if(listaHorarios.equals(horario)){
                listaHorarios.remove(i);
                
            }
        }
    }
    
    public void existeAlarme(String horario){
        for (int i = 0; i < listaHorarios.size(); i++) {
            if(listaHorarios.equals(horario)){
                System.out.println("Existe");
            }
        }
    }
    
    public void limparTodosAlarmes(){
    this.listaHorarios.clear();
    }
}
