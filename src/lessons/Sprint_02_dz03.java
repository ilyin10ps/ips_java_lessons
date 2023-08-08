package lessons;

public class Sprint_02_dz03 {
    public static void main(String[] args) {
        System.out.println("Спринт 02. ДЗ №3");
        System.out.println("Задача 01:"); arrayReverse();
        System.out.println("Задача 02:"); multiply2times();
        System.out.println("Задача 03:"); negativeArrElements();
        System.out.println("Задача 04:"); replacingNegativesWithZero();
    }
    public static void arrayReverse() {
        int[] arr = new int[5];
        System.out.println("Массив в оригинальном порядке: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 100 - 1) + 1);
            System.out.print(arr[i] + "  ");
        }
        System.out.println("\nМассив в обратном порядке: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void multiply2times() {
        int[] arr = new int[7];
        System.out.println("Оригинальный массив из 7-ми элементов: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 100 - 1) + 1);
            System.out.print(arr[i] + "  ");
        }
        System.out.println("\nМассив, в котором все его элементы увеличины в 2 раза: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
            System.out.print(arr[i] + "  ");
        }
    }

    public static void negativeArrElements() {
        int[] arr = new int[8];
        System.out.println("Массив из 8-ми элементов от –10 до 10: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int)(Math.random() * 21) - 10);
            System.out.print(arr[i] + "  ");
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) { count += 1; }
        }
        System.out.println("\nКоличество отрицательных элементов в массиве: " + count);
    }

    public static void replacingNegativesWithZero() {
        int[] arr = new int[12];
        System.out.println("Массив из 12-ти элементов от –20 до 10: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int)(Math.random() * 21) - 10);
            System.out.print(arr[i] + "  ");
        }
        System.out.println("\nМассив, в котором все отрицательные элементы заменены на число 0: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) { arr[i] = 0; }
            System.out.print(arr[i] + "  ");
        }
    }
}