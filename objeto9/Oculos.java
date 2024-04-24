public class Oculos {
    private String armaçao;
    private String lente;

    public Oculos(String armaçao, String lente)  {
    this.armaçao = armaçao;
    this.lente = lente;
    }

    public String getarmaçao(){
        return armaçao;
    }

    public void setarmaçao(String armaçao){
        this.armaçao = armaçao;
    }

    public String getlente(){
        return lente;
    }

    public void setlente(String lente){
        this.lente = lente;
    }

    public void proteger(){
        System.out.println("Ação:  Protegendo a visão");
    }

    public void corrigir(){
        System.out.println("Ação: Corrigindo a visão");
    }

}