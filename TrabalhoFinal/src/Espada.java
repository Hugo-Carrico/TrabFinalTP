public class Espada extends Personagem{

    public Espada() {
        super("A Espada", "Lendária Guerreira com foco no ataque.\nHabilidade: Ataque Crítico, rodadas " +
                "vencidas com cartas de valor 5 ou maior que a carta do oponente contam em dobro.\n");
    }

    // (Matheus) Diferença de números igual ou maior que 5 = Dano crítico
    public static boolean modificaRegra( Carta a, Carta b ) {
        if( a.getValor() >= b.getValor() + 5 ) {
            return true;
        }
        else {
            return false;
        }
    }

}
