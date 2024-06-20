package oops;

public class OutStanding {
	    public static void main(String[] args) {
	        Person[] persons = new Person[5];

	        persons[0] = new Professor("Dr. MuthuKumar", 5);
	        persons[1] = new Student("Priya", 90.0);
	        persons[2] = new Professor("Dr. Hariharan", 3);
	        persons[3] = new Student("Gayathri", 82.0);
	        persons[4] = new Student("Shankar", 88.0);

	        System.out.println("OutStanding Professor And Student");
	        for (Person person : persons) {
	            if (person.isOutstanding()) {
	                if (person instanceof Professor) {
	                    ((Professor) person).print();
	                } else if (person instanceof Student) {
	                    ((Student) person).display();
	                }
	                System.out.println();
	            }
	        }
	    }
}
