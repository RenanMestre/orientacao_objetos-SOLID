package metasoft;

import org.junit.Test;
import static org.junit.Assert.*;

public class MetaSoftTeste {

    @Test
    public void testCriacaoProduto() {
        Produto p1 = new Produto();
        p1.setProduto("Chapa de aço carbono");
        p1.setDescricao("Chapa metálica de aço carbono 5mm");
        p1.setValor(500.0f);

        assertEquals("Chapa de aço carbono", p1.getProduto());
        assertEquals("Chapa metálica de aço carbono 5mm", p1.getDescricao());
        assertEquals(500.0f, p1.getValor(), 0.001);
    }
}
