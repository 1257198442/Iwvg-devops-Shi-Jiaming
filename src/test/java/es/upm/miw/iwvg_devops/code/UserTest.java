package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;

    @BeforeEach
    void testData(){
        this.user = new User("1","Jiaming","Shi",new ArrayList<>());
    }

    @Test
    void testSet(){
        User user_test=new User();
        user_test.setName("Jiaming");
        user_test.setFamilyName("Shi");
        user_test.setFractions(new ArrayList<>());
        assertEquals(user.getName(),user_test.getName());
        assertEquals(user.getFamilyName(),user_test.getFamilyName());
        assertEquals(user.getFractions(),user_test.getFractions());
    }

    @Test
    void testGet(){
        assertEquals("1",user.getId());
        assertEquals("Jiaming",user.getName());
        assertEquals("Shi",user.getFamilyName());
        assertEquals(new ArrayList<>(),user.getFractions());
    }

    @Test
    void testAddFraction(){
        assertEquals(0,this.user.getFractions().size());
        this.user.addFraction(new Fraction());
        assertEquals(1,this.user.getFractions().size());
    }

    @Test
    void testFullName(){
        assertEquals("Jiaming Shi",this.user.fullName());
    }

    @Test
    void testInials(){
        assertEquals("J.",this.user.initials());
    }

}
