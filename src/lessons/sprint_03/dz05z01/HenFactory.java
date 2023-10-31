package lessons.sprint_03.dz05z01;

public class HenFactory {
    static Hen getHen(String country) {
        Hen hen = null;
        return switch (country) {
            case Country.RUSSIA -> new RussianHen();
            case Country.FINLAND -> new FinlandHen();
            case Country.MOLDOVA -> new MoldovanHen();
            case Country.BELARUS -> new BelarusianHen();
            default -> hen;
        };
    }
}