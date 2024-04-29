public class Student implements IStudent {

    private String subject;

    Student(String pSubject){
        this.subject = pSubject;
    }

    Student(IStudent pStudent){
        this.subject = pStudent.getSubject();
    }

    public String getSubject() {
        return subject;
    }
}
