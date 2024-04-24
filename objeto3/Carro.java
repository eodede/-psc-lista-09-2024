public class Carro {
    private String cor;
    private String marca;

    public Carro(String cor, String marca)  {
    this.cor = cor;
    this.marca = marca;
    }

    public String getcor(){
        return cor;
    }

    public void setcor(String cor){
      this.cor = cor;
    }

    public String getmarca(){
        return marca;
    }
    
    public void setmarca(String marca){
        this.marca = marca;
      }

    public void dirigir(){
        System.out.println("Ação: Dirigindo");
      }

    public void transportar(String carga){
        System.out.println("Ação: Transportando" + carga);
      }
}