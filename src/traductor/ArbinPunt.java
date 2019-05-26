package traductor;

public class ArbinPunt<E> implements Arbin<E> {

    E dato;
    Arbin<E> izq, der;

    public ArbinPunt() {
        izq = null;
        der = null;
    }

    public ArbinPunt(E x) {
        dato = x;
        izq = null;
        der = null;
    }

    @Override
    public E obtener() {
        return dato;
    }

    @Override
    public Arbin<E> izq() {
        return izq;
    }

    @Override
    public Arbin<E> der() {
        return der;
    }

    @Override
    public void enlIzq(Arbin<E> x) {
        izq = x;
    }

    @Override
    public void enlDer(Arbin<E> x) {
        der = x;
    }

    @Override
    public void modificar(E x) {
        dato = x;
    }
    
}
