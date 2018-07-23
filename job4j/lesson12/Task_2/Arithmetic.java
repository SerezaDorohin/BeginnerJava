package job4j.lesson12.Task_2;

public class Arithmetic {
    public double arithmetic(int[] mas){
        double b = 0;
        for (int i=0;i<mas.length;i++){
            b+=mas[i];
        }
        b/=mas.length;
        return b;

    }
}
