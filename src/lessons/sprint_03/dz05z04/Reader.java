package lessons.sprint_03.dz05z04;

public class Reader {
    static String fio;
    int libraryCardNumber;
    String faculty;
    String dateOfBirth;
    String phoneNumber;

    public Reader(String fio, int libraryCardNumber, String faculty, String dateOfBirth, String phoneNumber){
        this.fio = fio;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }
    public static void takeBook(int numberOfBooksTaken){
        System.out.println(fio + " взял " + numberOfBooksTaken + " книги");
    }
    public static void takeBook(String[] args) {
        StringBuilder spisok = new StringBuilder();
        for (int i = 0; i<3; i++){
            spisok.append(args[i]).append(", ");
        }
        spisok.deleteCharAt(spisok.length() - 2);
        System.out.println(fio + " взял книги: " + spisok);
    }
    public static void takeBook(String[] args, String fio_author) {
        StringBuilder spisok = new StringBuilder();
        for (int i = 0; i<3; i++){
            spisok.append(args[i]).append(", ");
        }
        spisok.deleteCharAt(spisok.length() - 2);
        System.out.println(fio_author + " взял книги: " + spisok);
    }
    public static void returnBook(int numberOfBooksTaken){
        System.out.println(fio + " вернул " + numberOfBooksTaken + " книги");
    }
    public static void returnBook(String[] args) {
        StringBuilder spisok = new StringBuilder();
        for (int i = 0; i<3; i++){
            spisok.append(args[i]).append(", ");
        }
        spisok.deleteCharAt(spisok.length() - 2);
        System.out.println(fio + " вернул книги: " + spisok);
    }
    public static void returnBook(String[] args, String fio_author) {
        StringBuilder spisok = new StringBuilder();
        for (int i = 0; i<3; i++){
            spisok.append(args[i]).append(", ");
        }
        spisok.deleteCharAt(spisok.length() - 2);
        System.out.println(fio_author + " вернул книги: " + spisok);
    }
}