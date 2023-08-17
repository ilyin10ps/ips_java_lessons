package lessons.sprint_02;

public class Task04_Main {
    public static void main(String[] args) {
        System.out.println("Спринт 02. ДЗ №4");
        Task04_Phone telephone = new Task04_Phone("89223537915","Samsung",3);
        System.out.println("Номер: " + telephone.number);
        System.out.println("Модель: " + telephone.model);
        System.out.println("Вес: " + telephone.weight);
        Task04_Phone telephone2 = new Task04_Phone("89223537915","Samsung");
        System.out.println("Номер: " + telephone2.number);
        System.out.println("Модель: " + telephone2.model);
        Task04_Phone telephone3 = new Task04_Phone("Samsung");
        System.out.println("Модель: " + telephone3.model);
        telephone.receiveCall("Том");
        System.out.println(telephone.getNumber());
        telephone.receivePhoneCall("Том", "89223537915");
        telephone.sendMessages(new String[]{"80123456789", "89876543210"}, telephone.number);
    }
}
