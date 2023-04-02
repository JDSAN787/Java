public class EmployeeTest {
    //make sure to have this to make the code run
    public static void main(String[] args) {

        Employee worker1=new Employee("Susan Meyers ",47899,"Accounting","VP",89000 );
        Employee worker2=new Employee("Mark Jones",39119, "IT","Programmer",67000);
        Employee worker3=new Employee("Joy Rogers",81774, "Manufacturing","Engineer",66000);

        //Printing output and "\t" for tab for align
        System.out.println(worker1.getName()+worker1.getId()+"\t"+worker1.getDepartment()+"\t\t"+worker1.getPosition()+"\t\t\t"+worker1.getSalary());
        System.out.println(worker2.getName()+"\t"+worker2.getId()+"\t"+worker2.getDepartment()+"\t\t\t\t"+worker2.getPosition()+"\t"+worker2.getSalary());
        System.out.println(worker3.getName()+"\t"+worker3.getId()+"\t"+worker3.getDepartment()+"\t"+worker3.getPosition()+"\t"+worker3.getSalary());

    }
}