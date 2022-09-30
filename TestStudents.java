// CIS2168 Data Structures, 003, Nina Perone, tul44843@temple.edu
// Assign1, TestStudents class
// Description: runs instances of student, master student, and undergraduate classes, puts objects into array and prints them with loop,
// calls compareTo in implementation of indexOfMin method which finds first student out of students in array

package assign1_template;

public class TestStudents {
    public static void main(String[] args) {
        
        //create an array of Student objects.
        Student[] cisDept = new Student[4];
        
        //Create and add 4 students, two undergraduates, two master students
        //   add these students to the array 
       
        String[] theisCommittee = {"Tom", "Richard", "Jamie"};
        cisDept[0] = new MasterStudent("222", "Steve", "Jobs", "IST", "MS", 3.5,
                "How to make ipad smarter", "Jamie", theisCommittee);
        
        cisDept[1] = new Undergraduate("444", "Bill", "Z", "CS", "BS", 3.0, "Erin", "Sally");

        String[] theisCommittee2 = {"Jie", "Zoran", "Gene"};
        cisDept[2] = new MasterStudent("333", "Amy", "Jobs", "CS", "MS", 3.8,
                "Study of Robots That can Perform", "Eduard", theisCommittee2);
        
        cisDept[3] = new Undergraduate("111", "Melinda", "Gates", "IST", "BS", 3.0, "Erin", "Frank");
        
        
        // loop to print the information about all students in the cisDept array
        for(Student student: cisDept) {
        	System.out.println(student);
        }
       
        System.out.println();
        
        
        // calls indexOfMin(...), passing the array cisDept,
        // prints the student located at the return value of indexOfMin(...)
        
        int index = indexOfMin(cisDept);
        System.out.println("first CS student in the alphabetical order: ");
        System.out.println(cisDept[index]);
        
    }
    
    
    
    // returns the index of first student in array in alphabetical order, takes array of students as parameter
    public static int indexOfMin(Student[] myDept) {
    	Student minVal = myDept[0];
    	int minIndex = 0;
    	
    	for(int i = 1; i < myDept.length; i++) {
    		if(myDept[i].compareTo(minVal) < 0) {
    			minVal = myDept[i];
    			minIndex = i;
    			//minVal = myDept[i].compareTo(myDept[i+1]);
    			//minIndex = i;
    		}
    	}
    	/*
    	if(myDept[myDept.length-1].compareTo(myDept[0]) < minVal) {
			minIndex = myDept.length-1;
			
		} */    
        
        return minIndex;
    }
}
