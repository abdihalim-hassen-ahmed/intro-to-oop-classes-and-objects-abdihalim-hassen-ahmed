
public class Main {
    public static void main(String[] args) {
        // --- TODO: Step 1 ---
        // Create your Student.java file in the src/ folder.
        // It should have private fields, a constructor, and getters/setters.

        // --- TODO: Step 2 ---
        // Instantiate your first student object here
        // Example: Student s1 = new Student("Abebe Kassa", 12345);

        // --- TODO: Step 3 ---
        // Instantiate your second student object here
        
        // --- TODO: Step 4 ---
        // Print the details to the console using your getter methods
        System.out.println("--- Student Enrollment List ---");
        // System.out.println("Student Name: " + s1.getName());

        System.out.println("\nAssignment Status: Check your Git commits before pushing!");
   
        // Create a Student object
        Student student1 = new Student("Ali", 12345);

        Student student2 = new Student("kalid", 67890);
        // Print student details
        System.out.println("--- Student Information ---");
        System.out.println("Student 1: " + student1.getName());
        System.out.println("Student 2: " + student2.getName());
    }
}