class InvalidMarksException extends Exception {
    public InvalidMarksException(String str) {
        super(str);
    }
}

class Student {
    int sid;
    int smarks;
    String sname;

    Student(int sid, String sname, int smarks) {
        this.sid = sid;
        this.sname = sname;
        this.smarks = smarks;
    }

    void yourMarks() {
        try {
            System.out.println("Roll No.: " + sid);
            System.out.println("Name    : " + sname);
            if (smarks < 0 || smarks > 100) {
                throw new InvalidMarksException("Marks Are Invalid...");
            } else {
                System.out.println("Mark    : " + smarks);
            }
        } catch (InvalidMarksException e) {
            e.printStackTrace();
        }
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Htet Htet", 90);
        s1.yourMarks();
        System.out.println();

        Student s2 = new Student(2, "May Mon", 101);
        s2.yourMarks();
    }
}
