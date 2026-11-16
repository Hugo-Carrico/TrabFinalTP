import java.util.ArrayList;
import java.util.Random;

public class CCC implements Jogo {

    protected int rodadas = 0;
    protected int empates = 0;

    public int getRodadas() {
        return rodadas;
    }

    public boolean setRodadas(int rodadas) {
        if( rodadas > -1 ) {
            this.rodadas = rodadas;
            return true;
        }
        else {
            return false;
        }
    }

    public int getEmpates() {
        return empates;
    }

    public boolean setEmpates(int empates) {
        if( empates > -1 ) {
            this.empates = empates;
            return true;
        }
        else {
            return false;
        }
    }

    // (Matheus) Ainda temos que bolar a gameplay em si
    public ArrayList<Jogador> iniciarJogo() {
        return null;
    }

    public void jogarTurno(Jogador jogador) {

    }

    public boolean jogoAcabou() {
        return false;
    }

    // (Matheus) Usar com estatisticas(), se der, juntar os dois
    public static void pontuacao( Jogador j1, Jogador j2 ){
        System.out.println( "==============================================================================================" );
        System.out.println( "                Personagem:  | Vitórias: | Derrotas: | Venceu Último Turno: | Está Ganhando: |" );
        System.out.printf( "- Jogador 1:     %8s    |    %2d     |    %2d     |          %s         |       %s      |\n"
                , j1.personagem.getNome(), j1.getVitorias(), j1.getDerrotas(), j1.getUltimoTurno(), j1.getGanhando()  );
        System.out.println( "----------------------------------------------------------------------------------------------" );
        System.out.printf( "- Jogador 2:     %8s    |    %2d     |    %2d     |          %s         |       %s      |\n"
                , j2.personagem.getNome(), j2.getVitorias(), j2.getDerrotas(), j2.getUltimoTurno(), j2.getGanhando()  );
        System.out.println( "==============================================================================================" );
    }

    public void estatisticas() {
        System.out.println( "- Partida: " + getRodadas() + " Rodadas e " + getEmpates() + " empates" );
        System.out.println( "==============================================================================================" );
    }
}
