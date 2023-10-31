package lessons.sprint_03.dz05z01;

public class FinlandHen extends Hen {
    public int getCountOfEggsPerMonth() {
        return 300;
    }
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.FINLAND + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}