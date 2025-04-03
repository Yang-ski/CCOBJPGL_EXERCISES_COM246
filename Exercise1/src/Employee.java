public class Employee {

    protected String name;
    protected String work;
    protected int salary;

    Employee(String name, String work, int salary) {
        this.name = name;
        this.work = work;
        this.salary = salary;
    }

    public String getWork(){
        return this.work;
    }

    public Integer getSalary(){
        return this.salary;
    }
}
