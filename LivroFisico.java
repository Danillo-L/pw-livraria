package model;
//Livro físico herda de livro
public class LivroFisico extends Livro {

    public double getLivroImpressao(){
        return valor * 0.05;
    }
}
