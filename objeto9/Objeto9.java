public class Objeto9 {
    public static void main(String[] args) {
    Oculos ocu = new Oculos("Característica Armação: Grande e Quadrada" , "Caracteristica Lente: de sol");
    
    System.out.println(ocu.getarmaçao());
    System.out.println(ocu.getlente());
    ocu.proteger();
    ocu.corrigir();
    }
}
