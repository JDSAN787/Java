public class Employee {

    private String name;
    private int idNumber;
    private String department;
    private String position;
    private double salary;

    //constructor
    public Employee(String empName,int id,String dep,String position, double salary) {

        this.name=empName;
        this.idNumber=id;
        this.department=dep;
        this.position=position;
        this.salary = salary;

    }

    public Employee(String empName,int id) {
        this.name=empName;
        this.idNumber=id;
        this.department=" ";
        this.position=" ";
    }

    public Employee() {
        this.name=" ";
        this.idNumber=0;
        this.department=" ";
        this.position=" ";
    }

    //Set
    public void setName(String name) {
        this.name=name;
    }

    public void setId(int id) {
        this.idNumber=id;
    }

    public void setDepartment(String dep) {
        this.department = dep;
    }

    public void setPosition(String pos) {
        this.position=pos;
    }

    //Get
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public int getId() {
        return idNumber;
    }

    public void setSalary(double salary){


        // validating salary separate (less confuse for me)
        if(salary > 90000 || salary < 0){

            this.salary = 0;

        }

        else{

            this.salary = salary;

        }
    }

    public double getSalary(){
        return salary;
    }
}

