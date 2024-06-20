package oops;

public class Student extends Person {
    private double percentage;

    public Student() {
        super();
        this.percentage = 0.0;
    }

    public Student(String name, double percentage) {
        super(name);
        this.percentage = percentage;
    }

    public void display() {
        System.out.println("Student Name: " + getName());
        System.out.println("Percentage: " + percentage);
    }

    @Override
    public boolean isOutstanding() {
        return percentage > 85.0;
    }
}
