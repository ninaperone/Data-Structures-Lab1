// CIS2168 Data Structures, 003, Nina Perone, tul44843@temple.edu
// Assign1, Student class
// Description: creates a student object, contains student methods (getters, setters, toString, compareTo), 
// assigns values to instance variables with constructor

package assign1_template;

public abstract class Student implements Comparable<Student> {
    
    private String id;
    private String firstName;
    private String lastName;
    private String major;
    private String degree;
    private double gpa;

    //constructors
    public Student() {
    }

    public Student(String id, String firstName, String lastName, String major,
            String degree, double gpa) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.degree = degree;
        this.gpa = gpa;
    }

    //setters
    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    //getters
    public String getDegree() {
        return degree;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    // prints all instance variables of student object
    @Override
    public String toString() {
        return "id: " + id + ", firstName: " + firstName + ", lastName: " + lastName
                + ", major: " + major + ", degree: " + degree + ", gpa: " + gpa;
    }

    //optional: for testing the coding of your Student class.
    //  verify the code implementing Comparable<T> interface in Java API
    public static void main(String[] args) {

    }

	// compares a student object to another (entered as parameter), gives alphabetical value to last or first names to determine order
    // returns 0 is names the same, positive integer if it follows other name, negative integer if proceeds other name
    @Override
	public int compareTo(Student o) {
		// checking last name
		int lengthLast1 = lastName.length();  
	    int lengthLast2 = o.getLastName().length();  
	    int limitLast = Math.min(lengthLast1, lengthLast2);
	    int i = 0;  
	    while (i < limitLast) {  
	        char letter1 = lastName.charAt(i); 
	        char letter2 = o.getLastName().charAt(i);  
	        if (letter1 != letter2) {  
	            return letter1 - letter2;  
	        }  
	        i++;  
	    } 
	    
	    //checking first name if last names same
	    if(lengthLast1 - lengthLast2 == 0) {
	    	int lengthFirst1 = firstName.length();  
		    int lengthFirst2 = o.getFirstName().length();  
		    int limitFirst = Math.min(lengthFirst1, lengthFirst2);
		    
		    int j = 0;  
		    while (j < limitFirst) {  
		        char letter1 = firstName.charAt(j); 
		        char letter2 = o.getFirstName().charAt(j);  
		        if (letter1 != letter2) {  
		            return letter1 - letter2;  
		        }  
		        j++;
		    }
		    return lengthFirst1-lengthFirst2;
	    }
	    	
	    return lengthLast1 - lengthLast2;
	}
}
