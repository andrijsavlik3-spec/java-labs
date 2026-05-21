public class Driver {
    private String name;
    private int age;
    private int experience;

    public Driver(String name, int age, int experience) {
        this.name = name; this.age = age; this.experience = experience;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public int getExperience() { return experience; }
    public void setExperience(int experience) { this.experience = experience; }

    @Override
    public String toString() {
        return name + " (" + age + " років, досвід: " + experience + " р.)";
    }
}