public class Objeto8{
    public static void main(String [] args){
        Cadeira cadeira = new Cadeira("Característica Cor: Vermelha" , "Caracteristica Tipo: Gamer");
    
        System.out.println(cadeira.getcor());
        System.out.println(cadeira.gettipo());
        cadeira.sentar();
        cadeira.descansar();
    }
}
    