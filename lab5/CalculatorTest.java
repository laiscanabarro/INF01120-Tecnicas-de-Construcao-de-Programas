import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc = new Calculator();
    
    public void start() {
        System.out.println("Test are starting");
    }

    public void init() {
        calc = new Calculator();
    }

    @Test
    public void addTeste() {
        double resultAdd;
        
        init();
        resultAdd = calc.add(10, 5);
        assertEquals(15, resultAdd, 0);

        init();
        resultAdd = calc.add(30.7, 5);
        assertEquals(35.7, resultAdd, 0);

        init();
        resultAdd = calc.add(7, 11);
        assertEquals(18, resultAdd, 0);

        init();
        resultAdd = calc.add(-4, 5);
        assertEquals(1, resultAdd, 0);

        init();
        resultAdd = calc.add(2, -8);
        assertEquals(-6, resultAdd, 0);

        init();
        resultAdd = calc.add(0, 0);
        assertEquals(0, resultAdd, 0);

        init();
        resultAdd = calc.add(-5, -2);
        assertEquals(-7, resultAdd, 0);

    }

    @Test
    public void divideTest() {
        double resultDivide;

        init();
        resultDivide = calc.divide(10, 2);
        assertEquals(5, resultDivide, 0);

        init();
        resultDivide = calc.divide(10, -2);
        assertEquals(-5, resultDivide, 0);

        init();
        resultDivide = calc.divide(5, 2);
        assertEquals(2.5, resultDivide, 0);

        init();
        resultDivide = calc.divide(1, 5);
        assertEquals(0.2, resultDivide, 0);

        init();
        resultDivide = calc.divide(10, 0);
        assertEquals(0, resultDivide, 0);

        init();
        resultDivide = calc.divide(0, 2);
        assertEquals(0, resultDivide, 0);
    }

    public void close() {
        System.out.println("Testing is completed");
    }

    
    public static void main(String args[]) {
        CalculatorTest t = new CalculatorTest();
        t.start();
        t.addTeste();
        t.divideTest();
        t.close();
    }


}
