public class UniMember extends Student implements IUniMember {

    private String name;
    private float salary;

    UniMember(IStudent pStudent, String pName, float pSalary){
        super(pStudent);
        this.name = pName;
        this.salary = pSalary;
    }

    UniMember(String pSubject, String pName, float pSalary){
        super(pSubject);
        this.name = pName;
        this.salary = pSalary;
    }

    UniMember(IUniMember pUniMember){
        super(pUniMember.getSubject());
        this.name = pUniMember.getName();
        this.salary = pUniMember.getSalary();
    }

    public String getName() {
        return this.name;
    }

    public float getSalary() {
        return this.salary;
    }
}
