package pattern.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {

  @Override
  public List<Person> meetCriteria(List<Person> persons) {
    List<Person> femalePersons = new ArrayList<Person>();

    for (Person person : persons) {
      if (person.getGender().equalsIgnoreCase(GenderType.FEMALE.getType())) {
        femalePersons.add(person);
      }
    }
    return femalePersons;
  }
}
