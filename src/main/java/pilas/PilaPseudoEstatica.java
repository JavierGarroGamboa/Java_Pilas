package pilas;

import javax.swing.*;

public class PilaPseudoEstatica extends Pila {
    private Integer[] vector;
    private int tope = -1;

    //PseudoEstática
    public PilaPseudoEstatica(int size) {
        vector = new Integer[size];
    }

    @Override
    public void push(Integer data) {
        tope = tope + 1;
        if (tope < vector.length) {
            vector[tope] = data;
        } else {
            tope = tope - 1;
        }
    }

    @Override
    public void pop() {
        if (!empty()) {
            vector[tope] = null;
            tope = tope - 1;
        } else {
            System.out.println("La pila de datos no contiene elementos");
        }
    }

    @Override
    public boolean empty() {
        return tope == -1;
    }

    @Override
    public Integer peek() {
        if (!empty()) {
            return vector[tope];
        } else {
            return null;
        }
    }

}
