package job4j.lesson4;

public class Task_1 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        a = 3;
        c = 2;
        b = c;
        d = a;
        a = b;
        c = d;
        String end = "int a: " + a + " || int b: " + b + "\nint c: " + c + " || int d: " + d + "\nEND";
        System.out.print(end);
    }
}