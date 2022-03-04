import java.util.Random;

/**
 * A classe Frase segue o padrão Singleton porque não faz
 * sentido termos mais de uma instância desta. Frase é
 * instanciada e todas as frases são geradas via geraFrase().
 */
public class Frase {

    private static final int LENGTH = 5;
    private static Frase instancia;

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

    /**
     * Construtor privado (Singleton).
     */
    private Frase() {}

    /**
     * Expõe gerador de instâncias.
     * @return instância de Frase
     */
    public static Frase getInstancia() {
        if (instancia == null) {
            instancia = new Frase();
        }
        return instancia;
    }

    /**
     * Gera frases aleatórias escolhendo aleatoriamente
     * artigo, verbo, substantivo e adjetivo das fontes.
     * @return string : frase com 5 ítens.
     */
    public String geraFrase() {
        // instancia gerador de números pseudo-aleatórios
        Random r = new Random();

        // cria um artigo aleatório com a primeira letra maiúscula
        String first = article[r.nextInt(LENGTH)];
        StringBuilder sb = new StringBuilder();
        sb.append(first.substring(0, 1).toUpperCase());
        sb.append(first.substring(1));
        String firstArticle = sb.toString();

        // cria e retorna o restante da frase aleatoriamente
        return  firstArticle + " " +
                noum[r.nextInt(LENGTH)] + " " +
                verb[r.nextInt(LENGTH)] + " " +
                preposition[r.nextInt(LENGTH)] + " " +
                noum[r.nextInt(LENGTH)] + ".";
    }

}
