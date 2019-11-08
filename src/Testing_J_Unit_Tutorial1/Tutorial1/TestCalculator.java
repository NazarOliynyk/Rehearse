package Testing_J_Unit_Tutorial1.Tutorial1;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {

    @Test
    public void testCalc() throws Exception{
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 4);
        // instead of using if() use Assert.assertEquals

//        if(result != 7){
//            System.out.println("Calculator works wrong!!");
//        }
        Assert.assertEquals(7, result);
    }

}
