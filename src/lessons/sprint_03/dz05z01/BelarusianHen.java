package lessons.sprint_03.dz05z01;

public class BelarusianHen extends Hen {
    public int getCountOfEggsPerMonth() {
        return 100;
    }
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}