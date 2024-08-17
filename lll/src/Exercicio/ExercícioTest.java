package Exercicio;

import Exercicio.Exercício;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExercícioTest {/*

    private Exercício exercicio;

    @BeforeEach
    void setUp() {
        exercicio = new Exercício();
    }

    @Test
    void deveRetornarZero() throws Exception {
        List<Integer> lista = Arrays.asList(1, 2, 6, 4, 5, 7);
        exercicio.verifica_lista(lista);
        assertEquals("Ok", exercicio.verifica_lista(lista));
    }
    @Test
    void deveRetornarListaComPoucoNumero() throws Exception {
        List<Integer> lista = Arrays.asList(1, 2, 6, 4, 7);
        try {
            exercicio.verifica_lista(lista);
        }
        catch (Exception e) {
            assertEquals("A lista deve conter exatamente 6 números.", e.getMessage());
        }
    }
    @Test
    void deveRetornarNumerosMaiorqueSessenta() throws Exception {
        List<Integer> lista = Arrays.asList(1, 2, 6, 4, 7,61);
        try {
            exercicio.verifica_lista(lista);
        }
        catch (Exception e) {
            assertEquals("Número fora do intervalo permitido (1-60): ", e.getMessage());
        }
    }
    @Test
    void deveRetornarNumerosMenorQueUm() throws Exception {
        List<Integer> lista = Arrays.asList(1, 2, 6, 4, 7,0);
        try {
            exercicio.verifica_lista(lista);
        }
        catch (Exception e) {
            assertEquals("Número fora do intervalo permitido (1-60): ", e.getMessage());
        }
    }
    @Test
    void deveRetornarNumerosDuplicado() throws Exception {
        List<Integer> lista = Arrays.asList(1, 2, 6, 4, 7,1);
        try {
            exercicio.verifica_lista(lista);
        }
        catch (Exception e) {
            assertEquals("Número duplicado encontrado: ", e.getMessage());
        }
    }
    @Test
    void deveRetonarValorCemPorcentoDoValor() throws Exception {
        List<Integer> lista = Arrays.asList(10,20,30,40,50,60);
        exercicio.setSorteados(lista);
        assertEquals(1000,exercicio.verificar_acertos(lista, 1000));
    }
    @Test
    void deveRetonarValorVintePorcentoDoValor() throws Exception {
        List<Integer> lista_sorteada = Arrays.asList(10,20,30,40,50,60);
        List<Integer> lista_apostada = Arrays.asList(10,20,30,40,50,2);
        exercicio.setSorteados(lista_sorteada);
        assertEquals(200,exercicio.verificar_acertos(lista_apostada, 1000));
    }
    @Test
    void deveRetonarValorCincoPorcentoDoValor() throws Exception {
        List<Integer> lista_sorteada = Arrays.asList(10,20,30,40,50,60);
        List<Integer> lista_apostada = Arrays.asList(10,20,30,40,1,2);
        exercicio.setSorteados(lista_sorteada);
        assertEquals(50,exercicio.verificar_acertos(lista_apostada, 1000));
    }
    @Test
    void deveRetonarValorZeroPorcentoDoValor() throws Exception {
        List<Integer> lista_sorteada = Arrays.asList(10,20,30,40,50,60);
        List<Integer> lista_apostada = Arrays.asList(10,20,30,3,1,2);
        exercicio.setSorteados(lista_sorteada);
        assertEquals(0,exercicio.verificar_acertos(lista_apostada, 1000));
    }

*/

}