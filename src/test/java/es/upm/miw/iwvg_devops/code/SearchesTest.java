package es.upm.miw.iwvg_devops.code;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SearchesTest {
    @Test
    void testFindFirstDecimalFractionByUserName() {
        assertEquals(0.20, new Searches().findFirstDecimalFractionByUserName("Oscar"));
    }
}
