package pattern.filter;

public class Person {

  private String name;
  private GenderType gender;
  private MaritalStatusType maritalStatus;

  public Person(String name, GenderType gender, MaritalStatusType maritalStatus) {
    this.name = name;
    this.gender = gender;
    this.maritalStatus = maritalStatus;
  }

  public String getName() {
    return name;
  }

  public GenderType getGender() {
    return gender;
  }

  public MaritalStatusType getMaritalStatus() {
    return maritalStatus;
  }
}
