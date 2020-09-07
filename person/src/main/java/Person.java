import java.text.MessageFormat;

public class Person {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String greet(String other) {
        // Change the code between here ...
        return MessageFormat.format("Hi {1}, my name is {0}", this.name, other);
        // ... and here!
    }

    public static void main(String[] args) {
        Person person = new Person("Mary");
        System.out.println(person.toString());
        String result = person.greet("John");
        if (!result.equals("Hi John, my name is Mary")) {
            System.out.println("FAILED!");
            System.exit(1);
        }
        person = new Person("Paul");
        result = person.greet("Lisa");
        if (!result.equals("Hi Lisa, my name is Paul")) {
            System.out.println("FAILED!");
            System.exit(1);
        }
        System.out.println("OK");
    }

}
