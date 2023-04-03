import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Person extends Data<Integer> {
    String name;
    String lastName;
    Date birthDay;
    String birthPlace;

    public Person(String name, String lastName, int nationalCode, Date birthDay, String birthPlace) {
        super(nationalCode);
        this.name = name;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthPlace = birthPlace;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDay=" + birthDay +
                ", birthPlace='" + birthPlace + '\'' +
                ", key=" + key +
                '}';
    }

}
