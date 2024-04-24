public class CartãoCredito {
    private int numero;
    private String marca;

    public CartãoCredito(int numero, String marca){
        this.numero = numero;
        this.marca = marca;
    }

    public int getnumero(){
        return numero;
    }

    public void setnumero(int numero){
      this.numero = numero;
    }

    public String getmarca(){
        return marca;
    }
    
    public void setmarca(String marca){
        this.marca = marca;
      }

    public void comprar(String compras){
        System.out.println("Ação: Comprando");
      }

    public void retirar(String dinheiro){
        System.out.println("Ação: Retirando");
      }
}
