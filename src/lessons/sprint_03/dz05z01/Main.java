package lessons.sprint_03.dz05z01;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите наименование страны: ");
        Hen hen = HenFactory.getHen(scn.nextLine());
        System.out.println(hen.getDescription());
    }
}