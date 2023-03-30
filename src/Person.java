import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Person {

    private String name;
    private String family;
    private Integer age;
    private Sex sex;
    private Education education;

    public Person (String name, String family, Integer age, Sex sex, Education education) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.sex = sex;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public Integer getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public Education getEducation() {
        return education;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", education=" + education +
                '}';
    }

    public Collection<Person> filter (Collection<Person> persons) {
        List<Person> people = new ArrayList<>();
        for (Person person : persons) {
            if (person.getSex() == Sex.WOMAN && person.getAge() < 60) {
                people.add(person);
            } else if (person.getSex() == Sex.MAN && person.getAge() < 65) {
                people.add(person);
            }
        }
        return people;
    }
}