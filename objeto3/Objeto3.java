public class Objeto3{
public static void main(String [] args){
    Carro carro = new Carro("Caracteristica Cor: Cinza", "Caracterisctica Marca: Ferrari");

    System.out.println(carro.getcor());
    System.out.println(carro.getmarca());
    carro.dirigir();
    carro.transportar(" Compras");
}
}