package job4j.lesson12.Task_1;

import java.util.Arrays;

public class MinMas {
    public int findMinIndex(int[] mas){
        Arrays.sort(mas);
        return mas[0];

    }
}
