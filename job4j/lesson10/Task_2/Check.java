package job4.lesson10.Task_2;

public class Check {
    public String checkInt(int num){
        if (num<0){
            return "Number is negative";
        }
        if (num>0){
            return "Number is positive";
        }
        else{
            return "Num is 0";
        }

    }
}
