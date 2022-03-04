public class Main {

    private static final int MAX = 20;

    public static void main(String[] args) {

        Frase frase = new Frase();
        int counter = 0;

        while (++counter <= MAX) {
            System.out.println(counter +
                    ": " + frase.geraFrase());
        }

    }
}
