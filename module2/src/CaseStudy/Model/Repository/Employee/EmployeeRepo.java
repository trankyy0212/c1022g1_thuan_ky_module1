package CaseStudy.Model.Repository.Employee;

import CaseStudy.Data.ReadFile;
import CaseStudy.Data.WriteFile;
import CaseStudy.Model.model.Person.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepo implements IEmployeeRepo{
    static List<Employee> myEmployeeList = new ArrayList<>();

    static {
        myEmployeeList.add(new Employee("1","huong","11/4/1998","GIRL","1234548966","456625623","huong@gmail.com","cao đẳng","phục vụ","8.5" ));
        myEmployeeList.add(new Employee("2","hong","12/5/1887","GIRL","1949659866","785465655","hong@gmail.com","cao đẳng","phục vụ","8" ));
        myEmployeeList.add(new Employee("3","thom","22/9/1789","GIRL","1185461615","216659798","thom@gmail.com","cao đẳng","phục vụ","7.9" ));
    }
    @Override
    public void list() {
        for (int i = 0; i <myEmployeeList.size() ; i++) {
            System.out.println(myEmployeeList.get(i));
        }myEmployeeList = ReadFile.readFileEmployee();
    }

    @Override
    public void add(Employee employee) {
        myEmployeeList.add(employee);
        WriteFile.writeEmployee(myEmployeeList);
    }

    @Override
    public Employee findByName(String name) {
        for(Employee x : myEmployeeList){
           if (x.getName().equals(name));
           return x;
        }
        return null;
    }

    @Override
    public Employee findById(String id) {
        for(Employee y : myEmployeeList){
            if (y.getId()== id){
                return y;
            }
        }
        return null;
    }

    @Override
    public void delete(Employee employee) {
        for (int i = 0; i <myEmployeeList.size() ; i++) {
            if (myEmployeeList.get(i).getName().equals(employee.getName())){
                myEmployeeList.remove(myEmployeeList.get(i));
            }
        }
    }

    @Override
    public void edit(Employee employee) {
        for (int i = 0; i <myEmployeeList.size() ; i++) {
            if (myEmployeeList.get(i).getName().equals(employee.getName())){
                myEmployeeList.set(i,employee);
            }
        }
    }

    @Override
    public List<Employee> findAll() {
        return myEmployeeList;
    }
}
