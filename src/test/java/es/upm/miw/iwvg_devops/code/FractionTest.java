package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    private  Fraction fraction;

    @BeforeEach
    void testData(){
        this.fraction=new Fraction(1,100);
    }

    @Test
    void testGet(){
        assertEquals(1,this.fraction.getNumerator());
        assertEquals(100,this.fraction.getDenominator());
    }

    @Test
    void testSet(){
        this.fraction.setNumerator(2);
        assertEquals(2,this.fraction.getNumerator());
        this.fraction.setDenominator(200);
        assertEquals(200,this.fraction.getDenominator());
    }

    @Test
    void testDecimal(){
        fraction=new Fraction(1,2);
        assertEquals(0.5,this.fraction.decimal());
    }
}