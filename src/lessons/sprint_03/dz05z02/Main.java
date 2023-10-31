package lessons.sprint_03.dz05z02;

public class Main {
    public static void main(String[] arg){
        System.out.println("Сумма:");
        System.out.println(Calculator.add(10,2));
        System.out.println(Calculator.add(10.0,2.0));
        System.out.println(Calculator.add(1000000000L,200000000L));
        System.out.println("Деление:");
        System.out.println(Calculator.division(20,4));
        System.out.println(Calculator.division(20.0,4.0));
        System.out.println(Calculator.division(2000000000L,400000000L));
        System.out.println("Умножение:");
        System.out.println(Calculator.multiply(30,6));
        System.out.println(Calculator.multiply(30.0,6.0));
        System.out.println(Calculator.multiply(3000000000L,600000000L));
        System.out.println("Вычитание:");
        System.out.println(Calculator.minus(40,8));
        System.out.println(Calculator.minus(40.0,8.0));
        System.out.println(Calculator.minus(4000000000L,800000000L));
    }
}
