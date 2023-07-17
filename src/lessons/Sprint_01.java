package lessons;
import java.util.Random;
import java.util.Scanner;

public class Sprint_01 {
    public static void main(String[] args) {
        System.out.println("Спринт 01. Задания №2");
        System.out.println("Задача 01:"); numberEven();
        System.out.println("Задача 02:"); numberDouble();
        System.out.println("Задача 03:"); numberInterval();
        System.out.println("Задача 04:"); numberThreeNatural();
        System.out.println("Задача 05:"); numberIncreasing();
        System.out.println("Задача 06:"); numberFourDigit();
        System.out.println("Задача 07:"); numberFirst55();
        System.out.println("Задача 08:"); numberNonNegative();
        System.out.println("Задача 09:"); numberFirst20();
        System.out.println("Задача 10:"); numberFactorial();
        System.out.println("Задача 11:"); numberPositiveDivisors();
        System.out.println("Задача 12:"); numberSimple();
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

    public static void numberInterval() {
        int min = 5;
        int max = 155;
//        int n = (int) (Math.random() * ((max - min) + 1) + min);
        int n = new Random().nextInt(151) + 5;
        if (n > 25 && n < 100) {
            System.out.println("Случайно выбранное из [5;155] число '" + n + "' попало в интервал (25;100)");
        } else {
            System.out.println("Случайно выбранное из [5;155] число '" + n + "' не попало в интервал (25;100)");
        }
    }

    public static void numberThreeNatural() {
        Random random = new Random();
        int min = 100;
        int max = 999;
        int n = (int) (Math.random() * ((max - min) + 1) + min);
        int a = n % 10;
        int b = (n/10) % 10;
        int c = (n/100) % 10;
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > 1 && 2 > 3) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        System.out.println(n);
    }

    public static void numberIncreasing() {
        int a = -5, b = 0, c = 7;
        if (a < b && a < c && b < c) {
            System.out.println(a + ", " + b + ", " + c);
        } else if (b < a && b < c && a < c) {
            System.out.println(b + ", " + a + ", " + c);
        } else if (c < a && c < b && a < b) {
            System.out.println(c + ", " + a + ", " + b);
        }
    }

    public static void numberFourDigit() {
        for (int n = 1000; n <= 9999; n = n + 3) {
            System.out.print(n + ", ");
        }
    }

    public static void numberFirst55() {
        int y = 0;
        for(int i = 0, x = 1; i < 55; x = x + 2, i++) {
            System.out.print(x + ", ");
            y++;
        }
        System.out.println("\nКол-во первых элементов: " + y);
    }

    public static void numberNonNegative() {
        for (int n = 90; n >= 0; n = n - 5)
            System.out.print(n + ", ");
    }

    public static void numberFirst20() {
        int y = 0;
        for(int i = 0, x = 2; i < 20; x = x*2, i++) {
            System.out.print(x + ", ");
            y++;
        }
        System.out.println("\nКол-во первых элементов: " + y);
    }

    public static void numberFactorial() {
        int n, x = 1;
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        n = scn.nextInt();
        for(int i = 1; i > 0; i--) {
            x *= i;
        }
        System.out.println("Факториалом натурального числа " + n + " является число " + x);
    }

    public static void numberPositiveDivisors() {
        int n, x, i;
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        n = scn.nextInt();
        System.out.print("Делителями числа " + n + " являются: ");
        for (i = n; i > 0; i--) {
            x = n % i;
            if  (x == 0)
                System.out.print( i + " ");
        }
    }

    public static void numberSimple() {
        int n, i;
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        n = scn.nextInt();
        for (i = (int) Math.sqrt(n); i >= 1; i--) {
            if ( n % i == 0 & i != 1){
                System.out.println("Число " + n + " является составным");
                break;
            }
            if (i == 1)
                System.out.println("Число " + n + " является простым");
        }
    }
}