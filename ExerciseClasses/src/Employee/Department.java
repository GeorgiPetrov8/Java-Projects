package Employee;
import java.util.ArrayList;
import java.util.List;

public class Department {
   private List<Employee> employeeList ;

   public Department() {
       this.employeeList = new ArrayList<>();
   }

   public List<Employee> getList () {
       return this.employeeList;
   }

   public double getAverageSalary() {
       return this.employeeList.stream()
               .mapToDouble(Employee::getSalary)
               .average().orElse(0.00);
   }

}
