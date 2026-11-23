import java.util.ArrayList;

public class Jogador {

    protected int vitorias = 0;
    protected int derrotas = 0;
    protected String ultimoTurno = "Não";
    protected String ganhando = "Não";
    protected Personagem personagem;
    protected ArrayList<Carta> baralho = new ArrayList<>();

    public int getVitorias() {
        return vitorias;
    }

    public boolean setVitorias(int vitorias) {
        if( vitorias > -1 ) {
            this.vitorias = vitorias;
            return true;
        }
        else {
            return false;
        }
    }

    public int getDerrotas() {
        return derrotas;
    }

    public boolean setDerrotas(int derrotas) {
        if( derrotas > -1 ) {
            this.derrotas = derrotas;
            return true;
        }
        else {
            return false;
        }
    }

    public String getGanhando() {
        return ganhando;
    }

    public boolean setGanhando(String ganhando) {
        if( ganhando.equals("Sim") || ganhando.equals("Não") ) {
            this.ganhando = ganhando;
            return true;
        }
        else {
            return false;
        }
    }

    public String getUltimoTurno() {
        return ultimoTurno;
    }

    public boolean setUltimoTurno(String ultimoTurno) {
        if( ultimoTurno.equals("Sim") || ultimoTurno.equals("Não") ) {
            this.ultimoTurno = ultimoTurno;
            return true;
        }
        else {
            return false;
        }
    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public boolean setPersonagem(int idPersonagem) {
        switch(idPersonagem) {
            case 1: {
                personagem = new Espada();
                return true;
            }
            case 2: {
                personagem = new Escudo();
                return true;
            }
            case 3: {
                personagem = new Cajado();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public ArrayList<Carta> getBaralho() {
        return baralho;
    }

    public boolean setBaralho(ArrayList<Carta> baralho) {
        if( baralho.isEmpty() == false ) {
            this.baralho = baralho;
            return true;
        }
        else {
            return false;
        }
    }

    public void pensarEstrategia() {
    }

    public void aplicarEstrategia(){
    }

}
