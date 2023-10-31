package lessons.sprint_03.dz05z01;

public class MoldovanHen extends Hen {
    public int getCountOfEggsPerMonth() {
        return 200;
    }
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}