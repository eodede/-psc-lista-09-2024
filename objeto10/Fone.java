public class Fone {
    private String fio;
    private String marca;

    public Fone(String fio, String marca)  {
    this.fio = fio;
    this.marca = marca;
    }

    public String getfio(){
        return fio;
    }

    public void setfio(String fio){
        this.fio = fio;
    }

    public String getmarca(){
        return marca;
    }

    public void setmarca(String marca){
        this.marca = marca;
    }

    public void ouvir(String musica){
        System.out.println("Ação: Reproduzindo" + musica);
    }

    public void chamar(){
        System.out.println("Ação: Fazendo chamada...");
    }

}

