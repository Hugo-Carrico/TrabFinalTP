import java.util.ArrayList;

public class Escudo extends Personagem {

    public Escudo(){
        super("O Escudo", "Sagrado Paladino com foco na defesa.\nHabilidade: Defesa Impenetrável, " +
                "Todas as cartas do oponente sofrem redução de 1 ponto em seu valor.\n");
    }

    public static void modificaRegra( ArrayList<Carta> baralho) { // -1 pra todos os valores do baralho inimigo
        for( int i = 0; i < baralho.size(); i++ ) {
            baralho.get(i).setValor(baralho.get(i).getValor() - 1);
        }
    }

}
