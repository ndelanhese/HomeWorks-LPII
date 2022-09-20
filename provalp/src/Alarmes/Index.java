package Alarmes;
import java.util.TreeSet;
public class Index {
    public static void main(String[] args) {

        String nome = "teste";
        TreeSet<String> horarios = new TreeSet();
        horarios.add("10:05");
        horarios.add("08:50");

        Alarmes alarmes = new Alarmes(nome, horarios);
        
        alarmes.adicionaAlarme("15:40");
        alarmes.removerAlarme("15:40");
        alarmes.existeAlarme("10:05");
        alarmes.limparTodosAlarmes();
        
    }
    
}
