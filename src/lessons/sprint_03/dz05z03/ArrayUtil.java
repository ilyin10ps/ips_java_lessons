package lessons.sprint_03.dz05z03;

import java.util.Arrays;

public class ArrayUtil {
    public static int[] generateMassRandom() {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 100 - 1) + 1);
        }
        return arr;
    }
    public static void min(int[] array) {
        int min = Arrays.stream(array).min().getAsInt();
        System.out.println(min + " - минимальное число в массиве " + Arrays.toString(array));
    }
    public static void max(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        System.out.println(max + " - максимальное число в массиве " + Arrays.toString(array));
    }
}