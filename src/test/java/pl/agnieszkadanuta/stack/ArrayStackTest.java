package pl.agnieszkadanuta.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {

    @Test
    @DisplayName("created stack should be empty")

    void createStack(){

        Stack<String> stack = new ArrayStack<>();
        assertTrue(stack.isEmpty());
    }

    @Test
    @DisplayName("should enlarge stack")
    void enlargeStack(){
        Stack<Integer> stack = new ArrayStack<>();
        //push w pętli dużo razy
        int size = 100;
        for(int i = 0; i < size; i++){
            stack.push(i);
        }


        //pop w pętli dużo razy
        for(int i = 0 ; i < size; i++){
            Integer element = stack.pop();
            assertEquals(size - i - 1, element.intValue());
        }
        //każdy zdjęty powinien być taki sam

        assertTrue(stack.isEmpty());

        //stos powinien być pusty
    }


    @Test
    @DisplayName("should contain one element after adding element to empty stack")
    void push() {

        Stack<String> stack = new ArrayStack<>();
        String element = "element";
        stack.push(element);

        String actualElement = stack.pop();

        assertEquals(element, actualElement);
        assertTrue(stack.isEmpty());

    }

    @Test
    void pop() {
    }

    @Test
    void isEmpty() {
    }
}