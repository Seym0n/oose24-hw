public class Employee implements IEmployee {

    private float salary;

    Employee(float pSalary){
        this.salary = pSalary;
    }

    Employee(IEmployee pEmployee){
        this.salary = pEmployee.getSalary();
    }

    public float getSalary() {
        return this.salary;
    }
}
