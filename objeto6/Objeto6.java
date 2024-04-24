public class Objeto6 {
    public static void main(String [] args){
        Endereço endereço = new Endereço("Caracteristica Nome: Nova York", 65880-970);

        System.out.println(endereço.getnome());
        System.out.println(endereço.getCEP());
        endereço.navegar();
        endereço.registrar();
    }
}

