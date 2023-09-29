package composite.Arquivos01;

public abstract class ArquivoBase {
    private String nome;

    public ArquivoBase(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
