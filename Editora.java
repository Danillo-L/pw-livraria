package model;

public class Editora {

    public String nome;
    public String email;
    public String site;

    public void exibirDadosEditora(){
        System.out.println("Dados da editora");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Site: " + site);
    }
}
