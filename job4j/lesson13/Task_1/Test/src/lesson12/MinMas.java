package lesson12;

import java.util.Arrays;

public class MinMas {
    public int findMinIndex(int[] mas){
        Arrays.sort(mas);
        return mas[0];

    }
}
