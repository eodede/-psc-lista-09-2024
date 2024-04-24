public class Endereço {
    private String nome;
    private int CEP;

    public Endereço(String nome, int CEP){
        this.nome = nome;
        this.CEP = CEP;
    }

    public String getnome(){
        return nome;
    }

    public void setnome(String nome){
      this.nome = nome;
    }

    public int getCEP(){
        return CEP;
    }
    
    public void setCEP(int CEP){
        this.CEP = CEP;
      }

    public void navegar(){
        System.out.println("Ação: Navegando");
      }

    public void registrar(){
        System.out.println("Ação: Registrando");
      }
}