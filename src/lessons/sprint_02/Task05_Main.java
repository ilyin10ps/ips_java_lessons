package lessons.sprint_02;

class Task05_Main {
    static Task05_User[] array = new Task05_User[3];
    public static void main(String[] args) {
        array[0] = new Task05_User("Махоумс", "Патрик", 27);
        array[1] = new Task05_User("Джексон", "Ламар", 26);
        array[2] = new Task05_User("Брэди", "Том", 45);
        for (int i = 0; i<3; i++){
            System.out.println("Last name: " + array[i].lastName + ", name: " + array[i].firstName  + " - " + array[i].age);
        }
    }
}