import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CensoTest {

    @Test
    public void deveContarSeguidoresAtivosInstagram() {
           Instagram instagram = new Instagram(
                        new Seguidor("Chico", true),
                        new Seguidor("Javali", true),
                        new Seguidor("Joaozin", false),
                        new Seguidor("Asta", true)
           );
           assertEquals(3, Censo.contarSeguidoresAtivosInstagram(instagram));
    }

    @Test
    public void deveContarTotalSeguidoresInstagram() {
        Instagram instagram = new Instagram(
                new Seguidor("Chico", true),
                new Seguidor("Javali", true),
                new Seguidor("Joaozin", false),
                new Seguidor("Asta", true)
        );
        assertEquals(4, Censo.contarTotalSeguidoresInstagram(instagram));
    }
}
