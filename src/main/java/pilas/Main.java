package pilas;

public class Main {
    public static void main(String[] args) {
        PilaPseudoEstatica pilaPseudo = new PilaPseudoEstatica(5);

        pilaPseudo.push(3);
        pilaPseudo.push(7);
        pilaPseudo.push(2);
        pilaPseudo.push(8);
        pilaPseudo.push(9);
        pilaPseudo.push(5);
        pilaPseudo.push(4);

        while (!pilaPseudo.empty()) {
            System.out.println("data = " + pilaPseudo.peek());
            pilaPseudo.pop();
        }
    }
}
