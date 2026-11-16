public abstract class Personagem {

    protected String nome;
    protected String descricao;


    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if( nome.isEmpty() == false ) {
            this.nome = nome;
            return true;
        }
        else {
            return false;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean setDescricao(String descricao) {
        if( descricao.isEmpty() == false ) {
            this.descricao = descricao;
            return true;
        }
        else {
            return false;
        }
    }

    public Personagem(String nome, String descricao) {
        setNome(nome);
        setDescricao(descricao);
    }

    public String contarHistoria() {
        return "Nome: " + getNome() + "\nDescrição: " + getDescricao();
    }


}
