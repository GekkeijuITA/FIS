package atm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestEuro {

    private Euro euro1;
    private Euro euro2;

    @BeforeEach
    public void setUp() {
        euro1 = new Euro(530.5);
        euro2 = new Euro(100);
    }

    @Test
    void testSum() {
        Euro sum = euro1.sum(euro2);
        assertEquals(630.5, sum.getValue());
    }

    @Test
    void testSubtract() {
        Euro subtract = euro1.subtract(euro2);
        assertEquals(430.5, subtract.getValue());
    }

    @Test
    void testEqualTo() {
        assertTrue(euro1.equalTo(new Euro(530.5)));
    }

    @Test
    void testLessThan() {
        assertTrue(euro2.lessThan(euro1));
    }

    @Test
    void testPrint() {
        assertEquals("530.5 euro", euro1.print());
    }
}
