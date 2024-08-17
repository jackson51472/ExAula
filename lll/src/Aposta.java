import java.util.ArrayList;
import java.util.List;

public class Aposta {

    private static final int MENOR_NUMERO = 1;
    private static final int MAIOR_NUMERO = 59;
    private static final int TAMANHO_APOSTA = 6;


    private List<Integer> aposta;

    public Aposta() {
        this.aposta = new ArrayList<>();
    }


    public List<Integer> getAposta() {
        return aposta;
    }

    public void setAposta(List<Integer> aposta) throws Exception {
        if (aposta.size() != TAMANHO_APOSTA) {
            throw new Exception("A aposta deve conter exatamente 6 números.");
        }
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (Integer n : aposta) {
            if (n > MAIOR_NUMERO || n < MENOR_NUMERO) {
                throw new Exception("Número fora do intervalo permitido (1-59): ");
            }
            if (uniqueNumbers.contains(n)) {
                throw new Exception("Número duplicado encontrado: ");
            }
            uniqueNumbers.add(n);
        }
        this.aposta = aposta;
    }

}
