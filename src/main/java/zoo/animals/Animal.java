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

  public void eat() {
    System.out.println(name + " está comendo...");
  };

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getGender() {
    return gender;
  }

  public boolean isBaby() {
    return isBaby;
  }
}
