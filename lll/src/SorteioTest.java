import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SorteioTest {
    Sorteio sorteio = new Sorteio();

    @BeforeEach
    void setUp() {
        sorteio = new Sorteio();
    }

    @Test
    public void deveRetornarTamanhoCorreto() {
        sorteio.sortear_numeros();
        List<Integer> sorteados = sorteio.getSorteados();
        assertEquals(6, sorteados.size());
    }

    @Test
    public void deveRetornarNumerosUnicos() {
        sorteio.sortear_numeros();
        List<Integer> sorteados = sorteio.getSorteados();

        for (int i = 0; i < sorteados.size(); i++) {
            for (int j = i + 1; j < sorteados.size(); j++) {
                assertNotEquals(sorteados.get(i), sorteados.get(j), "Número duplicado encontrado: " + sorteados.get(i));
            }
        }
    }

    @Test
    public void deveRetornarIntervaloCorreto() {
        sorteio.sortear_numeros();
        List<Integer> sorteados = sorteio.getSorteados();

        for (Integer numero : sorteados) {
            assertTrue(numero >= 1 && numero <= 59, "Número fora do intervalo permitido: " + numero);
        }
    }

    @Test
    public void testEstadoAposSortear() {
        sorteio.sortear_numeros();
        List<Integer> sorteados = sorteio.getSorteados();

        assertNotNull(sorteados, "A lista de números sorteados não deve ser nula.");
        assertTrue(sorteados.size() > 0, "A lista de números sorteados deve conter pelo menos um número.");
    }


}