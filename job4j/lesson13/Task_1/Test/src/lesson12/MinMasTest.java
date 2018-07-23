package lesson12;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MinMasTest {
    @Test
    public void testMinInexOfMas(){
        int[] mas={1,85,5,65,4,8,3,2,5};
        Arrays.sort(mas);
        int expended=mas[0];
        assertThat(mas[0],CoreMatchers.is(expended));
    }

}