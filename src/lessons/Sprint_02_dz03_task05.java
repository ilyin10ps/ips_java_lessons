package lessons;

class Task05 {
    static User[] array = new User[3];
    public static void main(String[] args) {
        array[0] = new User("Махоумс", "Патрик", 27);
        array[1] = new User("Джексон", "Ламар", 26);
        array[2] = new User("Брэди", "Том", 45);
        for (int i = 0; i<3; i++){
            System.out.println("Last name: " + array[i].lastName + ", name: " + array[i].firstName  + " - " + array[i].age);
        }
    }
}
class User {
    String firstName; String lastName; int age;
    public User (String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}

