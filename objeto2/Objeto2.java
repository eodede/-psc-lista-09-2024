public class Objeto2{
    public static void main(String[] args) {
        Animal animal = new Animal("Caracteristica Nome: Wiu", "Caracteristica Raça: Pitbull");

        System.out.println(animal.getnome());
        System.out.println(animal.getraça());
        animal.andar();
        animal.comer("Ração");
    }
}