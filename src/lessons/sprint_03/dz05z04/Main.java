package lessons.sprint_03.dz05z04;

public class Main {
    public static void main(String[] arg){
        Reader reader1 = new Reader("Майкл Джордан", 23, "Информационные системы и технологии", "10.02.1990", "+79111222333");
        Reader.takeBook(3);
        Reader.takeBook(new String[]{"Его воздушество", "Легенда НБА", "История Чикаго Буллз"});
        Book book1 = new Book("The Mamba Mentality", "Коби Брайант");
        Book book2 = new Book("Shooting Stars", "Леброн Джеймс");
        Book book3 = new Book("Undefeated", "Шакил О'Нил");
        Reader.takeBook(new String[]{book1.title, book2.title, book3.title}, book1.author);
        Reader.returnBook(3);
        Reader.returnBook(new String[]{"Его воздушество", "Легенда НБА", "История Чикаго Буллз"});
        Reader.returnBook(new String[]{book1.title, book2.title, book3.title}, book1.author);
    }
}