public class Objeto4 {
    public static void main(String [] args){
        Celular celular = new Celular("Caracteristica Modelo: Tablet", "Caracterisctica Marca: Apple");
    
        System.out.println(celular.getmodelo());
        System.out.println(celular.getmarca());
        celular.Chamada();
        celular.Navegar(" Google");
    }
    }