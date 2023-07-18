package lessons;

public class Sprint_02 {
    public static void main(String[] args) {
        System.out.println("Спринт 02. ДЗ №3");
        System.out.println("Задача 01:"); arrayReverse();
    }
    public static void arrayReverse() {
        int[] arr = new int[5];
        System.out.println("Массив в оригинальном порядке: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 100 - 1) + 1);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nМассив в обратном порядке: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}