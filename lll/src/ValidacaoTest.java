import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class ValidacaoTest {

    private Aposta aposta;
    private Sorteio sorteio;
    private Validacao validacao;

    @BeforeEach
    void setUp() {
        sorteio = new Sorteio();
        aposta = new Aposta();
        validacao = new Validacao(sorteio, aposta);
    }

    @Test
    void deveRetornarErroValorSorteioMenorZero() throws Exception {

        try {
            validacao.verificar_acertos(0);
            fail("Era para ter reportado que o valor do sroteio foi menor que 0.");

        }catch (Exception e) {
            assertEquals("Valor sorteio invalido", e.getMessage());
        }
    }
    @Test
    public void deveRetornarContarAcertosComTodosAcertos() throws Exception {
        List<Integer> lista_apostada = Arrays.asList(10,20,30,40,1,2);
        List<Integer> lista_sorteada = Arrays.asList(10,20,30,40,1,2);
        aposta.setAposta(lista_apostada);
        sorteio.setSorteados(lista_sorteada);


        int acertos = validacao.contarAcertos();
        assertEquals(6, acertos);
    }
    @Test
    public void deveRetornarContarAcertosComTresAcerto() throws Exception {
        List<Integer> lista_apostada = Arrays.asList(10,20,30,40,1,2);
        List<Integer> lista_sorteada = Arrays.asList(10,20,30,14,15,16);
        aposta.setAposta(lista_apostada);
        sorteio.setSorteados(lista_sorteada);


        int acertos = validacao.contarAcertos();
        assertEquals(3, acertos);
    }
    @Test
    public void deveRetornarContarAcertosComNenhumAcerto() throws Exception {
        List<Integer> lista_apostada = Arrays.asList(10,20,30,40,50,59);
        List<Integer> lista_sorteada = Arrays.asList(1,14,22,25,45,57);
        aposta.setAposta(lista_apostada);
        sorteio.setSorteados(lista_sorteada);


        int acertos = validacao.contarAcertos();
        assertEquals(0, acertos);
    }
    @Test
    void deveRetonarValorCemPorcentoDoValor() throws Exception {
        List<Integer> lista_apostada = Arrays.asList(1,14,22,25,45,57);
        List<Integer> lista_sorteada = Arrays.asList(1,14,22,25,45,57);
        aposta.setAposta(lista_apostada);
        sorteio.setSorteados(lista_sorteada);
        assertEquals(1000, validacao.verificar_acertos(1000));
    }
    @Test
    void deveRetonarValorVintePorcentoDoValor() throws Exception {
        List<Integer> lista_sorteada = Arrays.asList(1,14,22,25,45,60);
        List<Integer> lista_apostada = Arrays.asList(1,14,22,25,45,57);
        aposta.setAposta(lista_apostada);
        sorteio.setSorteados(lista_sorteada);
        assertEquals(200, validacao.verificar_acertos(1000));
    }
    @Test
    void deveRetonarValorCincoPorcentoDoValor() throws Exception {
        List<Integer> lista_sorteada = Arrays.asList(1,14,22,25,40,60);
        List<Integer> lista_apostada = Arrays.asList(1,14,22,25,45,57);
        aposta.setAposta(lista_apostada);
        sorteio.setSorteados(lista_sorteada);
        assertEquals(50, validacao.verificar_acertos(1000));
    }
    @Test
    void deveRetonarValorZeroPorcentoDoValor() throws Exception {
        List<Integer> lista_sorteada = Arrays.asList(1,14,22,20,40,60);
        List<Integer> lista_apostada = Arrays.asList(1,14,22,25,45,57);
        aposta.setAposta(lista_apostada);
        sorteio.setSorteados(lista_sorteada);
        assertEquals(0, validacao.verificar_acertos(1000));
    }
}