import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteio {
    private static final int MENOR_NUMERO = 1;
    private static final int MAIOR_NUMERO = 10;
    private static final int TAMANHO_LISTA = 6;
    private List<Integer> sorteados;

    public Sorteio(){
        this.sorteados = new ArrayList<>();
    }

    public List<Integer> getSorteados() {
        return sorteados;
    }

    public void setSorteados(List<Integer> sorteados) {
        this.sorteados = sorteados;
    }

    public void sortear_numeros() {
        Random random = new Random();
        List<Integer> uniqueNumbers = new ArrayList<>();

        while (uniqueNumbers.size() < TAMANHO_LISTA) {
            int numeroSorteado = random.nextInt(MAIOR_NUMERO - MENOR_NUMERO + 1) + MENOR_NUMERO;

            // Verifica se o número já está na lista
            if (!uniqueNumbers.contains(numeroSorteado)) {
                uniqueNumbers.add(numeroSorteado);
            }
        }

        sorteados = new ArrayList<>(uniqueNumbers);
    }
}
