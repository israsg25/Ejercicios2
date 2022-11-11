package ClasesGenericas;

public class Principal {
    public static void main(String[] args) {
        ClaseG<String> gen1=new ClaseG<>("Hola");
        System.out.println(gen1.getDato());

        Persona p1 =new Persona("David", 18, "M", "Atlacomulco");
        ClaseG<Persona>gen2=new ClaseG<>(p1);
        System.out.println(gen2.getDato());
    }
}
