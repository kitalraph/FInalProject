package senghor.kital;

import static org.junit.Assert.assertEquals;


import calcule.Calculator;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    Calculator calculator=new Calculator();
    @Test
    public void sumTest(){
        int result = calculator.sum(2,4);
        assertEquals(6,result);
    }

    @Test
    public void minusTest(){
        int result = calculator.minus(2,4);
        assertEquals(-2,result);
    }

    @Test
    public void divideTest(){
        int result = calculator.divide(2,4);
        assertEquals(0,result);
    }

    @Test
    public void MultiplyTest(){
        int result = calculator.multiply(2,4);
        assertEquals(8,result);
    }

}
