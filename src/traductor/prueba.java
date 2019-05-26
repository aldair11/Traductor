package traductor;

public class prueba {

    public static void main(String[] args) {
        Traductor tr = new Traductor();
        tr.insertar(new Palabra("Amigo", "Friend", "Amiga","es una persona de confianza"));
        tr.insertar(new Palabra("Perro", "Dog", "Cão","es un animal canino"));
        tr.insertar(new Palabra("Gato", "Cat", "Gato","es un animal felino"));
        System.out.println("Inorden");
        tr.inorden();
        System.out.println("");
        System.out.println("");
        System.out.println("Posorden");
        tr.posorden();
        System.out.println("");
        System.out.println("");
        System.out.println("Preorden");
        tr.preorden();
        System.out.println("");
        System.out.println("el peso es:" + tr.peso());
        System.out.println("la busqueda es:");
        System.out.println(tr.buscarOBJ("Gato","Español"));
        System.out.println("");
        
        tr.eliminar("Gato");
        tr.inorden();
     
        
    }
}
