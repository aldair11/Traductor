package traductor;

public interface Arbin<E> {

    E obtener();

    Arbin<E> izq();

    Arbin<E> der();

    void enlIzq(Arbin<E> x);

    void enlDer(Arbin<E> x);

    void modificar(E x);
}
