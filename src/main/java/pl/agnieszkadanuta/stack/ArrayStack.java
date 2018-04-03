package pl.agnieszkadanuta.stack;

import java.util.Arrays;

public class ArrayStack<E> implements Stack<E> {

    //początkowy rozmiar stosu, który jest stałą
    private static final int DEFAULT_SIZE = 10;

    //tablica typu E
    private Object[] stackTab;

    //licznik elementów w tablicy
    private int countElements;

    //konstruktor tworzący tablicę
    public ArrayStack() {
       stackTab = new Object[DEFAULT_SIZE];
       countElements = 0;
    }

    @Override
    public void push(E element) {
        if(countElements == stackTab.length) {
            stackTab = Arrays.copyOf(stackTab, 2 * stackTab.length);
        }
        stackTab[countElements] = element;
        countElements++;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E pop() {
        if(countElements > 0){
            countElements--;
            return (E)stackTab[countElements];
        }else{
            throw new IllegalStateException("Stack is empty");
        }
    }

    @Override
    public boolean isEmpty() {
        return countElements == 0;
    }
}
