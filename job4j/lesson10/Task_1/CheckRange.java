package job4.lesson10.Task_1;

public class CheckRange {
    public String checkRange(int num1, int num2, int num3){
        if ((num1>num2)&&(num1<num3)){
            return "The number is in the range";
        }
        else{
            return "The number is not in the range";
        }
    }
}
