public class Celular {
    private String modelo;
    private String marca;

    public Celular(String modelo, String marca)  {
    this.modelo = modelo;
    this.marca = marca;
    }

    public String getmodelo(){
        return modelo;
    }

    public void setmodelo(String modelo){
      this.modelo = modelo;
    }

    public String getmarca(){
        return marca;
    }
    
    public void setmarca(String marca){
        this.marca = marca;
      }

    public void Chamada(){
        System.out.println("Ação: Ligando para o número digitado...");
      }

    public void Navegar(String site){
        System.out.println("Ação: Navegando no " + site);
      }
}