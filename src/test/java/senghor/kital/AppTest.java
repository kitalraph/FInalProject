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
    // Senghor update
    @Test
    public void minTest(){
        int result= calculator.min(10,2);
        assertEquals(2, result);
    }

    @Test
    public void maxTest(){
        int result= calculator.max(10,2);
        assertEquals(10, result);
    }

    @Test
    public void minElementTest(){
        int [] tab={2,5,9,4,7};
        int result= calculator.minElement(tab);
        assertEquals(2, result);
    }

    @Test
    public void maxElementTest(){
        int [] tab={2,5,9,4,7};
        int result= calculator.maxElement(tab);
        assertEquals(9, result);
    }

}
