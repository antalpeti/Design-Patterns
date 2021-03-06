package pattern.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMarried implements Criteria {

  @Override
  public List<Person> meetCriteria(List<Person> persons) {
    List<Person> singlePersons = new ArrayList<Person>();

    for (Person person : persons) {
      if (person.getMaritalStatus().equals(MaritalStatusType.MARRIED)) {
        singlePersons.add(person);
      }
    }
    return singlePersons;
  }

}
