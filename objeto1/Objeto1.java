public class Objeto1 {
    public static void main(String [] args){
        Pessoa pessoa = new Pessoa("Caracteristica: André", "Caracterisctica: " + 18);

        System.out.println(pessoa.getnome());
        System.out.println(pessoa.getidade());
        pessoa.andar();
        pessoa.dormir();
    }
}
