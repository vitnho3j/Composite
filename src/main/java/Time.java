import java.util.ArrayList;
import java.util.List;

public class Time extends Jogador{

    private List<Jogador> jogadores;

    public Time(String jogador){
        super(jogador);
        this.jogadores = new ArrayList<Jogador>();
    }

    public void addJogador(Jogador jogador){
        this.jogadores.add(jogador);
    }

    public String getJogadores(){

        String saida = "";
        saida = "Time: " + this.getNome() + "\n";

        for (Jogador jogador: jogadores){
            saida += "Jogador: " + jogador.getNome() + "\n";
        }
        return saida;
    }


}
