public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade)  {
    this.nome = nome;
    this.idade = idade;
    }

    public String getnome(){
        return nome;
    }

    public void setnome(String nome){
      this.nome = nome;
    }

    public int getidade(){
        return idade;
    }
    
    public void setidade(int idade){
        this.idade = idade;
      }

    public void andar(){
        System.out.println("Ação: Andando");
      }

    public void dormir(){
        System.out.println("Ação: Dormindo Zzz");
      }
}
