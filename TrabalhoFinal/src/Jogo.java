import java.util.ArrayList;
import java.util.Random;

public interface Jogo {

    Random random = new Random();

    ArrayList<Jogador> iniciarJogo();
    void jogarTurno(Jogador jogador);
    boolean jogoAcabou();

    static int criarNumeroAleatorio() {
        return random.nextInt(1, 11);
    }

}
