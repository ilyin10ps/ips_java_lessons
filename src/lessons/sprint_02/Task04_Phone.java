package lessons.sprint_02;

class Task04_Phone {
    static String number;
    String model;
    int weight;

    String getNumber() {
        return number;
    }
    public Task04_Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Task04_Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Task04_Phone(String model) {
        this.model = model;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public static void receivePhoneCall(String name, String number) {
        System.out.println("Звонит " + name + " по номеру телефона " + number);
    }

    public void sendMessages(String[] args, String number) {
        for (int i = 0; i<2; i++){
            System.out.println("На номер " + args[i] + " было отправлено сообщение с номера " + number);
        }
    }
}
