// + Создайте класс Phone, который содержит переменные number, model и weight.
// + Создайте три экземпляра(объекта) этого класса.
// + Выведите на консоль значения их переменных.
// + Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение
// + “Звонит {name}” . getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
// + Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
// + Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
// + Добавить конструктор без параметров.
// + Добавьте метод receivePhoneCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
// + Вызвать этот метод.
// + Создать метод sendMessages c массивом строк (String[]) в качестве одного из параметров.
// + Данный метод принимает на вход номера телефонов (которые являются элементами переданного массива),
// + которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов:
// + - На номер {} было отправлено сообщение с номера {number}.
public class T_4 {
    public static void main (String[] args)
    {
        Phone phone1 = new Phone ("111","Iphone14",157.1);
        Phone phone2 = new Phone ("222","Iphone13",158.0);
        Phone phone3 = new Phone ("333","Iphone12",159.6);

        System.out.println( "number: " + phone1.getNumber ()
                + " model: " + phone1.getModel ()  +
                " weight: " + phone1.getWeight());
        System.out.println( "number: " + phone2.getNumber ()
                + " model: " + phone2.getModel ()  +
                " weight: " + phone2.getWeight());
        System.out.println( "number: " + phone3.getNumber ()
                + " model: " + phone3.getModel ()  +
                " weight: " + phone3.getWeight());

        phone1.receiveCall(" Misha" + " number: " + phone1.getNumber());
        phone2.receiveCall(" Masha" + " number: " + phone2.getNumber());
        phone3.receiveCall(" Ivan" + " number: " + phone3.getNumber());

        phone1.receivePhoneCall (" Misha",   "444");
        phone2.receivePhoneCall (" Masha", "555");
        phone3.receivePhoneCall (" Ivan", "777");

        String [] r = {phone1.getNumber(),phone2.getNumber(),phone3.getNumber()};

        Phone.sendMessages(r);
        System.out.println("На номер " + phone1.getNumber() + " было отправлено сообщение с номера " + phone2.getNumber());
        System.out.println("На номер " + phone2.getNumber() + " было отправлено сообщение с номера " + phone3.getNumber());
        System.out.println("На номер " + phone1.getNumber() + " было отправлено сообщение с номера " + phone2.getNumber());
    }
}
class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone (String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0;
    }
    public Phone () {
    }
    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }
    public void receiveCall(String callerName) {
        System.out.println("Звонит" + callerName );
    }
    public void receivePhoneCall (String callerName, String number) {
        System.out.println("Звонит" + callerName + " with number " + getNumber());
    }
    static void sendMessages (String [] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}
