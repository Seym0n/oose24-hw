public class Main {
    public static void main(String[] args){
        System.out.println("Create Employee instance and print its methods (getSalary)");

        IEmployee employee = new Employee(56000);

        System.out.println(employee.getSalary());



        System.out.println("\nCreate Student instance and print its methods (getSubject)");

        IStudent student = new Student("Business Administration");

        System.out.println(student.getSubject());



        System.out.println("\nThe same student becomes a university member and print its methods (getSubject, getName, getSalary)");

        IUniMember unimember = new UniMember(student, "John", 5600);

        System.out.println(unimember.getSubject());
        System.out.println(unimember.getName());
        System.out.println(unimember.getSalary());



        System.out.println("\nThe same student and university member becomes a tutor and print its methods (getSubject, getName, getSalary)");

        IUniMember tutor = new Tutor(unimember);

        System.out.println(tutor.getSubject());
        System.out.println(tutor.getName());
        System.out.println(tutor.getSalary());



        System.out.println("\nA new employee becomes a professor and print its methods (getSalary)");

        IEmployee employee2 = new Employee(74000);
        IEmployee prof = new Professor(employee2);

        System.out.println(prof.getSalary());



        System.out.println("\nAnother new employee becomes a PhD and print its methods (getSalary)");

        IEmployee employee3 = new Employee(34533);
        IEmployee phd = new PhD(employee3);

        System.out.println(phd.getSalary());

    }
}
