public class Objeto7{
public static void main(String [] args){
    CartãoCredito cartão = new CartãoCredito(12345678 , "Visa");

    System.out.println(cartão.getnumero());
    System.out.println(cartão.getmarca());
    cartão.comprar(" Roupas");
    cartão.retirar(" Dinheiro");
}
}
