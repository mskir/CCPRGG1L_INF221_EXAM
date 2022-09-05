public class App {
    public static void main(String[] args) {

        // Character Class
        Character Student = new Character();

        Student.surname = "Gamas";
        Student.firstName = "Journey";
        Student.middleInitial = 'C';
        Student.dateOfBirth = "12/28/2004";
        Student.studentNumber = 2022101612;
        Student.studentEmailAddress = "gamasjc@students.national-u.edu.ph";
        Student.iAmAwesome = true;
        Student.sayMyStudentNumber();
        Student.sayMyEmailAddress();
        Student.amIAwesome();

        
    }
}