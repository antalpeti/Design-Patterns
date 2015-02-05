package pattern.filter;

public enum GenderType {
  MALE("Male"), FEMALE("Female");

  private String type;

  GenderType(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }

}
