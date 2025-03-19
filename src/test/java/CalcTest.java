import ie.atu.TDD.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcTest {
    Calculator calc;

    @BeforeEach
    void setup(){
        calc = new Calculator();
    }

    @Test
    void testAddSuccess(){
        assertEquals(8, calc.add(4,4));
    }

    @Test
    void testAddFailure(){
        Exception e = assertThrows(IllegalArgumentException.class, ()-> {
            calc.add(Integer.MAX_VALUE, 1);
                }
        );
        assertEquals("Value is Too Large", e.getMessage());
    }

    @Test
    void testSubtractSuccess(){
        assertEquals(4, calc.subtract(8,4));
    }
    @Test
    void testSubtractFailure(){

        Exception e = assertThrows(IllegalArgumentException.class, ()-> {
            calc.subtract(Integer.MIN_VALUE, 1);
        });
        assertEquals("Value is too Small", e.getMessage());
    }

    @Test
    void testMultiplySuccess(){
        assertEquals(4, calc.multiply(2,2));
    }

    @Test
    void testMultiplyFailure(){
        Exception e = assertThrows(IllegalArgumentException.class, ()-> {
            calc.multiply(Integer.MAX_VALUE, 2);
        });
        assertEquals("Value is too Large", e.getMessage());
    }
}
