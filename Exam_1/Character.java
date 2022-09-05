public class Character {
    // Character attributes
    String surname;
    String firstName;
    char middleInitial;
    String dateOfBirth;
    int studentNumber;
    String studentEmailAddress;
    boolean iAmAwesome;

    // Character method
    public void sayMyStudentNumber() {
        System.out.println("Student Number: " + studentNumber);
    }
    public void sayMyEmailAddress() {
        System.out.println("Email Address: " + studentEmailAddress);
    }
    public void amIAwesome() {
        System.out.println("I am Awesome: " + iAmAwesome);
    
    }
}