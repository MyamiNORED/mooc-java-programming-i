
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public String getName() {
        return name;
    }

    public SimpleDate getBirthday() {
        return birthday;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Person, the objects are not equal
        if (!(compared instanceof Person)) {
            return false;
        }

        // convert the object into a Person object
        Person comparedPerson = (Person) compared;

        // if the values of the object variables are equal, the objects are equal
        if ( 0 == this.name.compareTo(comparedPerson.getName()) 
                && this.height == comparedPerson.getHeight()
                && this.weight == comparedPerson.getWeight()
                && (this.birthday.getYear()== comparedPerson.getBirthday().getYear() 
                 && this.birthday.getMonth() == comparedPerson.getBirthday().getMonth() 
                  && this.birthday.getDay() == comparedPerson.getBirthday().getDay()) ) {
            return true;
        }

        // otherwise the objects are not equal
        return false;
    }
}
