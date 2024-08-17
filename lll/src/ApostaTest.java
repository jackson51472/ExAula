import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class ApostaTest {

    private Aposta aposta;
    @BeforeEach
    void setUp() {
        aposta = new Aposta();
    }

    @Test
    public void deveRetornarApostaValida() throws Exception {
        List<Integer> lista_apostada = Arrays.asList(1, 2, 3, 4, 5, 6);
        aposta.setAposta(lista_apostada);
        assertEquals(lista_apostada, aposta.getAposta());
    }

    @Test
    public void deveRetornarApostaComTamanhoIncorreto() throws Exception {
        List<Integer> lista_apostada = Arrays.asList(1, 2, 3, 4, 5);

        try{
            aposta.setAposta(lista_apostada);
        }catch (Exception e){
            assertEquals("A aposta deve conter exatamente 6 números.", e.getMessage());
        }

    }

    @Test
    public void deveRetornarNumeroForaDoIntervalo() throws Exception {
        List<Integer> lista_apostada = Arrays.asList(1, 2, 3, 4, 5, 60);
        try{
            aposta.setAposta(lista_apostada);
        }catch (Exception e){
            assertEquals("Número fora do intervalo permitido (1-59): ", e.getMessage());
        }
    }

    @Test
    public void deveRetornarNumeroDuplicado() throws Exception {
        List<Integer> lista_apostada = Arrays.asList(1, 2, 3, 5, 5, 5);

        try{
            aposta.setAposta(lista_apostada);
        }catch (Exception e){
            assertEquals("Número duplicado encontrado: ", e.getMessage());
        }
    }
}
