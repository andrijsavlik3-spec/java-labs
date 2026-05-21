public class Person {
    String fullName;
    int age;

    public Person() {
        this.fullName = "Невідомий";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " говорить"); 
    }

    public void talk() {
        System.out.println(fullName + " говорить");
    }
}