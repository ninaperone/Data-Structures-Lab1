// CIS2168 Data Structures, 003, Nina Perone, tul44843@temple.edu
// Assign1, MasterStudent class (subclass of student super class)
// Description: creates a master student object, contains master student methods (getters, setters, toString), 
// assigns values to instance variables with constructor, extends student class

package assign1_template;

import java.util.Arrays;

public class MasterStudent extends Student {

    private String thesis;
    private String thesisAdvisor;
    private String[] committee; //thesis committee, excluding thesis advisor    

    // constructors
    public MasterStudent() {
    	
    }
    
    public MasterStudent(String id, String firstName, String lastName, String major,
            String degree, double gpa,String thesis, String thesisAdvisor, String[] committee) {
    	
    	super(id, firstName, lastName, major, degree, gpa);
    	this.thesis = thesis;
    	this.thesisAdvisor = thesisAdvisor;
    	this.committee = committee;
    }
    
    //add getters for all new data fields
    public String getThesis() {
    	return thesis;
    }
    
    public String getThesisAdvisor() {
    	return thesisAdvisor;
    }
    public String[] getCommittee() {
    	return committee;
    }
    
    //add setters for all new data fields
    public void setThesis(String thesis) {
		this.thesis = thesis;
	}

	public void setThesisAdvisor(String thesisAdvisor) {
		this.thesisAdvisor = thesisAdvisor;
	}

	public void setCommittee(String[] committee) {
		this.committee = committee;
	}
    
    //new toString() method that overrides the toString() in Student class
	// prints all instance variables of master student object
	public String toString() {
        return super.toString() + ", \n Thesis Title: " + thesis + ", \n Thesis Committee: " +
        		Arrays.toString(committee) + ", \n Thesis Advisor: " + thesisAdvisor;
   
    }
    
    //optional: for testing the coding of your MasterStudent class.
    public static void main(String[] args) {
    	//String[] committee = {"jen", "john"};
    	//MasterStudent nina = new MasterStudent("1", "nina", "perone", "cs", "ba", 4.0, "stuff", "joe", committee);
    	//System.out.println(Arrays.toString(nina.getCommittee()));
    	//System.out.println(nina);

    }
}
