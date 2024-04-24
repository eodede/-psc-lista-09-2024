public class Cadeira {
    private String cor;
    private String tipo;

    public Cadeira(String cor, String tipo)  {
    this.cor = cor;
    this.tipo = tipo;
    }

    public String getcor(){
        return cor;
    }

    public void setcor(String cor){
        this.cor = cor;
    }

    public String gettipo(){
        return tipo;
    }

    public void settipo(String tipo){
        this.tipo = tipo;
    }

    public void sentar(){
        System.out.println("Ação:  Sentando");
    }

    public void descansar(){
        System.out.println("Ação: Descansando");
    }

}