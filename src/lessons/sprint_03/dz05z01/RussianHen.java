package lessons.sprint_03.dz05z01;

public class RussianHen extends Hen {
    public int getCountOfEggsPerMonth() {
        return 400;
    }
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}