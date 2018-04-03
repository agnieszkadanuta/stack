package pl.agnieszkadanuta.stack;

public interface Stack<E> {

    void push(E element);

    E pop();

    boolean isEmpty();

}
