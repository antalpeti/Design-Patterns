package pattern.filter;

public enum MaritalStatusType {
  MARRIED("Married"), SINGLE("Single");

  private String type;

  private MaritalStatusType(String type) {
    this.type = type;
  }

  String getType() {
    return type;
  }
}
