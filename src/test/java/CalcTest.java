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
}
