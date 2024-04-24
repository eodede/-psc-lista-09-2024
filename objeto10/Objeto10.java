public class Objeto10 {
    public static void main(String[] args) {
        Fone fone = new Fone("Característica Fio: Com Fio" , "Caracteristica Marca: JBL");
        
        System.out.println(fone.getfio());
        System.out.println(fone.getmarca());
        fone.ouvir(" Matuê");
        fone.chamar();
    }
}
