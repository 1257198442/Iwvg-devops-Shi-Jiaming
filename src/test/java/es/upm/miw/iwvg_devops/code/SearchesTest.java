package es.upm.miw.iwvg_devops.code;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class SearchesTest {
    @Test
    void testFindFirstDecimalFractionByUserName() {
        assertEquals(0.20, new Searches().findFirstDecimalFractionByUserName("Oscar"));
        assertNull(new Searches().findFirstDecimalFractionByUserName("Antonio"));
    }
    @Test
    void testFindUserIdBySomeProperFraction(){
        assertEquals(Arrays.asList("1","2","3","5"),new Searches().findUserIdBySomeProperFraction().collect(Collectors.toList()));
    }
    @Test
    void testFindDecimalFractionByUserName(){
        assertEquals(Arrays.asList(0.0, 1.0, 2.0, 0.2, -0.5, 0.5, 1.0),new Searches().findDecimalFractionByUserName("Oscar").collect(Collectors.toList()));
    }
    @Test
    void testFindUserFamilyNameByAllNegativeSignFractionDistinct(){
        assertEquals(List.of(),new Searches().findUserFamilyNameByAllNegativeSignFractionDistinct().collect(Collectors.toList()));
    }
}
