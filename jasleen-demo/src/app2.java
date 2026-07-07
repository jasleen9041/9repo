public class app2 {
    private String courseName;
    private int enrolledStudents;
    private final int MAX_CAPACITY = 30;

    public app2(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = 0;
    }

    public void enrollStudent(String studentName) {
        if (enrolledStudents < MAX_CAPACITY) {
            System.out.println("Successfully enrolled: " + studentName);
        } else {
            System.out.println(" Sorry, " + courseName + " is completely full!");
        }
        }

        public void printClassStatus() {
            int seatsleft = MAX_CAPACITY - enrolledStudents;
            System.out.println("/n--- " + courseName + " Status ---");
            System.out.println("Enrolled Students: " + enrolledStudents);
            System.out.println("Available Seats: " + seatsleft);
            System.out.println("-----------------------------/n");
        }

        public static void main(String[] args) {

            app2 myCourse = new app2("Advanced Java Programming");

            myCourse.enrollStudent("Jasleen");
            myCourse.enrollStudent("Aman");
            myCourse.enrollStudent("Rohan");

            myCourse.printClassStatus();
        }
    }

        
        
    
    
