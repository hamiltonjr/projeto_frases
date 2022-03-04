public class Main {

    // número de frases mostradas
    private static final int MAX = 20;

    public static void main(String[] args) {

        Frase frase = Frase.getInstancia();
        int counter = 0;

        // loop das frases
        while (++counter <= MAX) {
            System.out.println(counter +
                    ": " + frase.geraFrase());
        }

    }
}
