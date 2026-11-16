import java.util.ArrayList;

public class Cajado extends Personagem {

    public Cajado() {
        super("O Cajado", "Ancião Arcano com foco na magia.\nHabilidade: Transmutatio Elementorum: " +
                "Qualquer carta jogada não obedece a regra dos elementos.\n ");
    }

    public static void modificaRegra( ArrayList<Carta> baralho ) { // todas as cartas ignoram o elemento
        for( int i = 0; i < baralho.size(); i++ ) {
            baralho.get(i).setElemento("X");
        }
    }

}
