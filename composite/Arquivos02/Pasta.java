package composite.Arquivos02;

import java.util.ArrayList;

public class Pasta extends ArquivoBase {
    private ArrayList<ArquivoBase> itens = new ArrayList<>();

    public Pasta(String nome) {
        super(nome);
    }

    public int getTamanho() {
        int tamanhoTotal = 0;
        for (ArquivoBase arquivo: itens){
            tamanhoTotal += arquivo.getTamanho();
        }
        return tamanhoTotal;
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
