package lessons;

public class Sprint_01 {
    public static void main(String[] args) {
        System.out.println("Спринт 01. Задания №2");
        System.out.println("Задача 01:"); numberEven();
        System.out.println("Задача 02:"); numberDouble();
    }
    public static void numberEven() {
        int n = 4;
        if (n%2 == 0) System.out.println("n - " + "четное число");
        else System.out.println("n - " + "нечетное число");
    }

    public static void numberDouble() {
        int m = 8, n = 11, a = 10;
        int x = a - m;
        int y = a - n;
        if (x > y) {
            System.out.println("Ближайшее число к " + a + ": " + n);
        } else {
            System.out.println("Ближайшее число к " + a + ": " + m);
        }
    }
}