import java.util.Random;

public class Frase {

    private static final int LENGTH = 5;

    private static final String[] article = {
            "the" , "a" , "one" , "some", "any"
    };

    private static final String[] noum = {
            "boy" , "girl" , "dog" , "town", "car"
    };

    private static final String[] verb = {
            "drove" , "jumped" , "ran" , "walked", "skipped"
    };

    private static final String[] preposition = {
            "to" , "from" , "over" , "under", "on"
    };

    public Frase() {}

    public String geraFrase() {
        Random r = new Random();

        // cria um artigo aleatório com a primeira letra maiúscula
        String first = article[r.nextInt(LENGTH)];
        StringBuilder sb = new StringBuilder();
        sb.append(first.substring(0, 1).toUpperCase());
        sb.append(first.substring(1));
        String firstArticle = sb.toString();

        // cria o restante da frase aleatoriamente
        return  firstArticle + " " +
                noum[r.nextInt(LENGTH)] + " " +
                verb[r.nextInt(LENGTH)] + " " +
                preposition[r.nextInt(LENGTH)] + " " +
                noum[r.nextInt(LENGTH)] + ".";
    }

}
