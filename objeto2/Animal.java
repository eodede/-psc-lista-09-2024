public class Animal {
    private String nome;
    private String raça;

    public Animal(String nome, String raça)  {
    this.nome = nome;
    this.raça = raça;
    }

    public String getnome(){
        return nome;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public String getraça(){
        return raça;
    }

    public void setraça(String raça){
        this.raça = raça;
    }

    public void andar(){
        System.out.println("Ação:  Andando");
    }

    public void comer(String ração){
        System.out.println("Ação: Comendo" + ração);
    }

}