public class Bicicleta {
    private String estilo;
    private String acessorios;

    public Bicicleta(String estilo, String acessorios)  {
    this.estilo = estilo;
    this.acessorios = acessorios;
    }

    public String getestilo(){
        return estilo;
    }

    public void setestilo(String estilo){
      this.estilo = estilo;
    }

    public String getacessorios(){
        return acessorios;
    }
    
    public void setacessorios(String acessorios){
        this.acessorios = acessorios;
      }

    public void Pedalar(){
        System.out.println("Ação: Pedalando");
      }

    public void Freiar(){
        System.out.println("Ação: Freando");
      }
}