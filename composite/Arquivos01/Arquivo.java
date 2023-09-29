package composite.Arquivos01;

public class Arquivo extends ArquivoBase {
    private String base64;
    private int tamanho;

    public Arquivo(String nome, String base64, int tamanho) {
        super(nome);
        this.base64 = base64;
        this.tamanho = tamanho;
    }


    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}