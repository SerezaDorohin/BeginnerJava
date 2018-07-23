package test;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ArithmeticTest {
    @Test
    public void TestArithmetic(){
        int[] mas={3,5,4,6,8,4,9};
        double b = 0;
        for (int i=0;i<mas.length;i++){
            b+=mas[i];
        }
        b/=mas.length;
        double expended=b;
        assertThat(b,is(expended));
    }

}