package pattern.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {
  public static void main(String[] args) {
    List<Person> persons = new ArrayList<Person>();

    persons.add(new Person("Robert", "Male", "Single"));
    persons.add(new Person("John", "Male", "Married"));
    persons.add(new Person("Laura", "Female", "Married"));
    persons.add(new Person("Diana", "Female", "Single"));
    persons.add(new Person("Mike", "Male", "Single"));
    persons.add(new Person("Bobby", "Male", "Single"));

    Criteria male = new CriteriaMale();
    Criteria female = new CriteriaFemale();
    Criteria single = new CriteriaSingle();
    Criteria married = new CriteriaMarried();
    Criteria singleMale = new AndCriteria(single, male);
    Criteria singleFemale = new AndCriteria(single, female);
    Criteria singleOrMale = new OrCriteria(single, male);
    Criteria singleOrFemale = new OrCriteria(single, female);
    Criteria marriedMale = new AndCriteria(married, male);
    Criteria marriedFemale = new AndCriteria(married, female);
    Criteria marriedOrMale = new OrCriteria(married, male);
    Criteria marriedOrFemale = new OrCriteria(married, female);

    printFiltered(persons, male, "Males: ");
    printFiltered(persons, female, "\nFemales: ");
    printFiltered(persons, single, "\nSingles: ");
    printFiltered(persons, married, "\nMarried: ");
    printFiltered(persons, singleMale, "\nSingle Males: ");
    printFiltered(persons, singleFemale, "\nSingle Females: ");
    printFiltered(persons, singleOrMale, "\nSingle Or Males: ");
    printFiltered(persons, singleOrFemale, "\nSingle Or Females: ");
    printFiltered(persons, marriedMale, "\nMarried Males: ");
    printFiltered(persons, marriedFemale, "\nMarried Females: ");
    printFiltered(persons, marriedOrMale, "\nMarried Or Males: ");
    printFiltered(persons, marriedOrFemale, "\nMarried Or Females: ");

  }

  private static void printFiltered(List<Person> persons, Criteria criteria, String header) {
    System.out.println(header);
    printPersons(criteria.meetCriteria(persons));
  }

  public static void printPersons(List<Person> persons) {
    for (Person person : persons) {
      System.out.printf("Person : [ Name : %8s, Gender : %8s, Marital Status : %8s ]\n",
          person.getName(), person.getGender(), person.getMaritalStatus());
    }
  }
}
