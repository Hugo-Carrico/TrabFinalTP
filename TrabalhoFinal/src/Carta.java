public class Carta {

    protected int valor;
    protected String elemento;

    public int getValor() {
        return valor;
    }

    public boolean setValor(int valor) { // (Matheus) Cartas de 1 a 10
        if( valor > 0 && valor < 11 ) {
            this.valor = valor;
            return true;
        }
        else {
            return false;
        }
    }

    public String getElemento() {
        return elemento;
    }

    public boolean setElemento(String elemento) { // (Matheus) Só aceita os 3 elementos do jogo e o elemento curinga
        if( elemento.equals( "Fogo" ) || elemento.equals( "Gelo" ) || elemento.equals ( "Água" ) || elemento.equals("X") ) {
            this.elemento = elemento;
            return true;
        }
        else {
            return false;
        }
    }

    public Carta(int valor, String elemento) {
        setValor(valor);
        setElemento(elemento);
    }

}
