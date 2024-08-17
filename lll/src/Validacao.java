import java.util.List;

public class Validacao {

    private static final int VALOR_TOTAL_GANHO = 6;
    private static final int VINTE_PORCENTO_GANHO = 5;
    private static final int CINCO_PORCENTO_GANHO = 4;

    private Sorteio sorteio;
    private Aposta aposta;

    public Aposta getAposta() {
        return aposta;
    }

    public void setAposta(Aposta aposta) {
        this.aposta = aposta;
    }

    public Sorteio getSorteio() {
        return sorteio;
    }

    public void setSorteio(Sorteio sorteio) {
        this.sorteio = sorteio;
    }

    public Validacao(Sorteio sorteio, Aposta aposta) {
        setSorteio(sorteio);
        setAposta(aposta);
    }

    public void validacaoValorSorteio(Integer valorSorteio){
        if(valorSorteio < 1){
            throw new IllegalArgumentException("Valor sorteio invalido");
        }
    }

    public int contarAcertos() {
        int acertos = 0;
        for (Integer i : this.aposta.getAposta()) {
            if (this.sorteio.getSorteados().contains(i)) {
                acertos++;
            }
        }
        return acertos;
    }
    //8 CC
    public double verificar_acertos(Integer valor_sorteio){
        validacaoValorSorteio(valor_sorteio);

        int acertos = contarAcertos();

        if (acertos == VALOR_TOTAL_GANHO){
            return valor_sorteio; // 100%
        } else if (acertos == VINTE_PORCENTO_GANHO){
            return valor_sorteio * 0.2; // 20%
        } else if (acertos == CINCO_PORCENTO_GANHO){
            return valor_sorteio * 0.05; // 5%
        }
        return 0.0;
    }

}
