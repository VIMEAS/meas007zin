
public class FullTime extends Employee{
    private Double salary;

    public FullTime(int id, String name, Double salary) {
        super(id, name);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee [salary=" + salary + ", getId()=" + getId() + ", getName()=" + getName() + "]";
    }
    @Override
    public void display(){
        System.out.println("ID: " + getId() + " Name: " + getName() + "Salary: " + getSalary());
    }

    

}
