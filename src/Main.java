import person.Builder;
import person.Driver;
import person.Person;
import person.Programmer;

public class Main {
    public static void main(String[] args) {
        //todo нонМодификаторлору ар кыл болгон полясы бар классты 3 класс мурастап анын методун оверайд кылып колдонуп жатат
        Builder builder = new Builder();
        Person.setAge(30);
        System.out.println(builder.working()+" Аты: "+builder.getName()+" Жашы: "+ Person.getAge());

        Driver driver = new Driver();
        Person.setAge(32);
        System.out.println(driver.working()+" Аты: "+driver.getName()+" Жашы: "+ Person.getAge());

        Programmer programmer = new Programmer();
        Person.setAge(34);
        System.out.println(programmer.working()+" Аты: "+programmer.getName()+" Жашы: "+ Person.getAge());

    }
}