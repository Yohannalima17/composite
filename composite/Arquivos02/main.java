package composite.Arquivos02;

public class main {

    public static void main(String[] args) {

        Pasta pasta1 = new Pasta("pasta1");
        Pasta pasta2 = new Pasta("pasta2");
        Arquivo arquivo1 = new Arquivo("arquivo1", "43290751", 120);
        Arquivo arquivo2 = new Arquivo("arquivo2", "18303823", 321);
        Arquivo arquivo3 = new Arquivo("arquivo3", "89342772", 812);


        pasta1.adicionarArquivo(arquivo1);
        pasta1.adicionarArquivo(arquivo2);
        pasta2.adicionarArquivo(pasta1);
        pasta2.adicionarArquivo(arquivo3);


        System.out.println("Pasta 01:");
        pasta1.listarItens();
        System.out.println("Pasta 02:");
        pasta2.listarItens();

        System.out.println("Tamanho da pasta02:");
        System.out.println(pasta2.getTamanho()) ;
    }

}