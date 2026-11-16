public class Batalha {

    // (Matheus) Esse método é interno, só serve pra ser usado dentro do método "resultado"
    public static int batalhar( Carta a, Carta b ) {
        // (Matheus) Se ambas forem do mesmo elemento ou algum jogador for Cajado
        if( a.getElemento().equals(b.getElemento()) || a.getElemento().equals("X") || b.getElemento().equals("X") ) {
            if( a.getValor() > b.getValor() ) { // (Matheus) Carta a maior
                return 1;
            }
            else if( a.getValor() < b.getValor() ) { // (Matheus) Carta b maior
                return -1;
            }
            else { // (Matheus) Empate
                return 0;
            }
        }
        else { // (Matheus) Se ambas forem de elementos diferentes
            if( a.getElemento().equals("Fogo") ) { // (Matheus) Fogo vs. Gelo e Fogo vs. Água
                if( b.getElemento().equals("Gelo") ) {
                    return 1;
                }
                else {
                    return -1;
                }
            }
            else if ( a.getElemento().equals("Gelo") ) { // (Matheus) Gelo vs. Água e Gelo vs. Fogo
                if (b.getElemento().equals("Água")) {
                    return 1;
                } else {
                    return -1;
                }
            }
            else { // (Matheus) Por eliminação só resta água
                if( b.getElemento().equals("Fogo") ) { // (Matheus) Água vs. Fogo e Água vs. Gelo
                    return 1;
                }
                else {
                    return -1;
                }
            }
        }
    }

    public static int resultado(Jogador x, Carta a, Jogador y, Carta b) {
        switch( Batalha.batalhar( a, b ) ) {
            case -1: { // (Matheus) Carta b vence Carta a, vitória do Jogador y
                if( y.getPersonagem().getNome().equals("A Espada") && Espada.modificaRegra( b, a ) == true ) {
                    y.setVitorias(y.getVitorias() + 2);
                    x.setDerrotas(x.getDerrotas() + 1);
                    return -2;
                }
                else {
                    y.setVitorias(y.getVitorias() + 1);
                    x.setDerrotas(x.getDerrotas() + 1);
                    return -1;
                }
            }
            case 1: { // (Matheus) Carta a vence Carta b, vitória do Jogador x
                if( x.getPersonagem().getNome().equals("A Espada") && Espada.modificaRegra( a, b ) == true ) {
                    x.setVitorias(x.getVitorias() + 2);
                    y.setDerrotas(y.getDerrotas() + 1);
                    return -2;
                }
                else {
                    x.setVitorias(x.getVitorias() + 1);
                    y.setDerrotas(y.getDerrotas() + 1);
                    return -1;
                }
            }
            default: { // (Matheus) Empate
                return 0;
            }
        }
    }

}
