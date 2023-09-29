package composite.Arquivos01;

import java.util.ArrayList;

public class Pasta extends ArquivoBase {
    private ArrayList<ArquivoBase> itens = new ArrayList<>();

    public Pasta(String nome) {
        super(nome);
    }

    public void adicionarArquivo(ArquivoBase arquivo){
        itens.add(arquivo);
    }

    public void removerArquivo(ArquivoBase arquivo){
        for (ArquivoBase exemplo: itens) {
            if(exemplo.getNome() == arquivo.getNome()){
                itens.remove(arquivo);
            }
        }
    }

    public void listarItens(){
        for (ArquivoBase arquivos: itens){
            System.out.println(arquivos.getNome());
        }
    }
}
