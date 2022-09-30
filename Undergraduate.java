// CIS2168 Data Structures, 003, Nina Perone, tul44843@temple.edu
// Assign1, Undergraduate class (subclass of student super class)
// Description: creates an undergraduate student object, contains undergraduate methods (getters, setters, toString), 
// assigns values to instance variables with constructor, extends student class

package assign1_template;

public class Undergraduate extends Student {

    private String generalEduAdvisor;
    private String majorAdvisor;

    // constructors
    public Undergraduate() {
    	
    }
    
    public Undergraduate(String id, String firstName, String lastName, String major, String degree, double gpa, 
    		String generalEduAdvisor, String majorAdvisor) {
    	
        super(id, firstName, lastName, major, degree, gpa);
    	this.generalEduAdvisor = generalEduAdvisor;
    	this.majorAdvisor = majorAdvisor;
    }
    
    //add getters for all new data fields
    public String getGeneralEduAdvisor() {
    	return generalEduAdvisor;
    }
    
    public String getMajorAdvisor() {
    	return majorAdvisor;
    }
    
    //add setters for all new data fields
    public void setGeneralEduAdvisor(String generalEduAdvisor) {
        this.generalEduAdvisor = generalEduAdvisor;
    }

    public void setMajorAdvisor(String majorAdvisor) {
        this.majorAdvisor = majorAdvisor;
    }
    
    //add new toString() method that overrides the toString() in Student class
    // prints all instance variables of undergraduate object
    @Override
    public String toString() {
        return super.toString()+ ", \n Advidor for General Education Requirement: " +
    generalEduAdvisor + ", \n Advisor for Major Requirement: " + majorAdvisor;
   
    }
    
    //optional: for testing the coding of your Undergraduate class.
    public static void main(String[] args) {
    	//Undergraduate nina = new Undergraduate("1", "nina", "perone", "cs", "ba", 4.0, "jen", "joe");
    	//nina.setGeneralEduAdvisor("john");
    	//System.out.println(nina);

    }

}
