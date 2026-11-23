import java.util.ArrayList;
import java.lang.Exception;
import java.util.InputMismatchException;
import java.util.Scanner;
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

    // (Matheus) Mostra regras, personagens e habilidades. Jogadores escolhem seu personagem e cria o baralho deles
    public ArrayList<Jogador> iniciarJogo() {
        Scanner teclado = new Scanner(System.in);
        Jogador P1 = new Jogador();
        Jogador P2 = new Jogador();
        ArrayList<Jogador> Jogadores = new ArrayList<>();
        int escolha;
        String confirmacao = "N";

        // (Matheus) !!! Depois escreve aqui as regras do jogo e dos personagens !!!
        // (Matheus) Se possível, deixar dentro de caixinhas ou estilizar nossos printlns
        System.out.println("=======================================");
        System.out.println(" | Regras do Jogo: |");
        System.out.println(" | Personagens: |");
        System.out.println("=======================================");

        // (Matheus) Jogador 1 escolhe seu personagem
        while( confirmacao.equals("N") ) {
            try {
                System.out.print(" Jogador 1, escolha seu personagem: ");
                escolha = teclado.nextInt();
                teclado.nextLine();
            }
            catch( InputMismatchException e1) {
                teclado.nextLine();
                System.out.println("      Escolha apenas 1, 2 ou 3!");
                continue;
            }

            if (P1.setPersonagem(escolha) == false) {
                System.out.println("      Escolha apenas 1, 2 ou 3!");
                continue;
            }

            System.out.println(" Jogador 1 escolheu personagem " + P1.getPersonagem().nome + ".\n Confirmar escolha?" +
                    " [Digite 'S'(Sim) ou 'N'(Não)]");
            confirmacao = teclado.nextLine();

            while( !confirmacao.equals("S") && !confirmacao.equals("N") ) {
                System.out.println("Digite 'S'(Sim) ou 'N'(Não)");
                confirmacao = teclado.nextLine();
            }

            if( confirmacao.equals("S") ) {
                System.out.println( " Jogador 1: " + P1.getPersonagem().nome + " escolhido" );
            }
        }
        System.out.println("=======================================");
        confirmacao = "N";

        // (Matheus) Jogador 2 escolhe seu personagem
        while( confirmacao.equals("N") ) {
            try {
                System.out.print(" Jogador 2, escolha seu personagem: ");
                escolha = teclado.nextInt();
                teclado.nextLine();
            }
            catch(InputMismatchException e1) {
                teclado.nextLine();
                System.out.println("      Escolha apenas 1, 2 ou 3!");
                continue;
            }

            if (P2.setPersonagem(escolha) == false) {
                System.out.println("      Escolha apenas 1, 2 ou 3!");
                continue;
            }

            if ( P2.getPersonagem().getNome().equals( P1.getPersonagem().getNome() ) ) {
                System.out.println( " Escolha um personagem diferente do Jogador 1!" );
                continue;
            }

            System.out.println(" Jogador 2 escolheu personagem " + P2.getPersonagem().nome + ".\n Confirmar escolha?" +
                    " [Digite 'S'(Sim) ou 'N'(Não)]");
            confirmacao = teclado.nextLine();

            while( !confirmacao.equals("S") && !confirmacao.equals("N") ) {
                System.out.println(" Digite 'S'(Sim) ou 'N'(Não)");
                confirmacao = teclado.nextLine();
            }

            if( confirmacao.equals("S") ) {
                System.out.println(" Jogador 2: " + P2.getPersonagem().nome + " escolhido");
            }
        }
        System.out.println("=======================================");

        // (Matheus) Cria o baralho e adiciona os 2 jogadores pra lista de jogadores.
        P1.setBaralho(criarBaralho());
        Jogadores.add(P1);
        P2.setBaralho(criarBaralho());
        Jogadores.add(P2);
        return Jogadores;
    }

    // (Matheus) Método interno, usar dentro de IniciarJogo(). Cria as cartas dos jogadores
    public ArrayList<Carta> criarBaralho() {
        ArrayList<Carta> baralho = new ArrayList<>();

        for( int i = 0; i < 10; i++ ) {
            int elemento = Jogo.criarNumeroAleatorio(1, 4);
            switch(elemento) {
                case 1:
                    baralho.add( new Carta(Jogo.criarNumeroAleatorio(1, 11), "Fogo") );
                    break;
                case 2:
                    baralho.add( new Carta(Jogo.criarNumeroAleatorio(1, 11), "Gelo") );
                    break;
                case 3:
                    baralho.add( new Carta(Jogo.criarNumeroAleatorio(1, 11), "Água") );
                    break;
            }
        }

        return baralho;
    }

    // (Matheus) Completar esse
    public void jogarTurno(Jogador jogador) {

    }

    // (Matheus) Completar esse
    public boolean jogoAcabou() {
        return true;
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
