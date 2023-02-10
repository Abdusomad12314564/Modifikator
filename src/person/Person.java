package person;

public class Person {
    private final String name="Абдусомад";
    private static int age;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Person.age = age;
    }

    public String working(){
        return working();
    }
}
