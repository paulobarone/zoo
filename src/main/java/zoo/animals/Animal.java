package zoo.animals;

public abstract class Animal {
  protected String name;
  protected int age;
  protected String gender;
  private final boolean isBaby;

  public Animal(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.isBaby = this.age < 1;
  }

  // Getters and Setters

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public boolean isBaby() {
    return isBaby;
  }
}
