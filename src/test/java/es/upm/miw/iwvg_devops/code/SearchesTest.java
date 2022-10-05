package es.upm.miw.iwvg_devops.code;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SearchesTest {
    @Test
    void testFindFirstDecimalFractionByUserName() {
        assertEquals(0.20, new Searches().findFirstDecimalFractionByUserName("Oscar"));
    }
    @Test
    void testFindUserIdBySomeProperFraction(){
        assertEquals(Arrays.asList(new String[]{"1","2","3","5"}),new Searches().findUserIdBySomeProperFraction(1).collect(Collectors.toList()));
    }
}
