import java.util.ArrayList;
import java.util.Random;

public interface Jogo {

    Random random = new Random();

    ArrayList<Jogador> iniciarJogo();
    void jogarTurno(Jogador jogador);
    boolean jogoAcabou();

    // (Matheus) retorna um número aleatório entre min e max - 1
    static int criarNumeroAleatorio(int min, int max) {
        return random.nextInt(min, max);
    }

}
