package lessons;

public class Sprint_02_dz04 {
    public static void main(String[] args) {
        System.out.println("Спринт 02. ДЗ №4");
        Phone telephone = new Phone(89223537915L,"Samsung",3);
        System.out.println("Номер: " + telephone.number);
        System.out.println("Модель: " + telephone.model);
        System.out.println("Вес: " + telephone.weight);
        telephone.receiveCall("Том");
        System.out.println(telephone.getNumber());
        telephone.receivePhoneCall("Том", 89223537915L);
        telephone.sendMessages(new String[]{}, telephone.number);
    }
}

class Phone {
    static long number; String model; int weight;
    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }
    long getNumber() {
        return number;
    }
    public Phone (long number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone (long number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone () {}
    public static void receivePhoneCall(String name, long number) {
        System.out.println("Звонит " + name + " по номеру телефона " + number);
    }
    public void sendMessages(String[] args, long number) {
        String[] arrNumber = new String[2];
        arrNumber[0] = "80123456789";
        arrNumber[1] = "89876543210";
        for (int i = 0; i<2; i++){
            System.out.println("На номер " + arrNumber[i] + " было отправлено сообщение с номера " + number);
        }
    }
}