package site.nosaj.oop.employee;

class Employee implements EmployeeInterface {
    String name;
    int age;
    int salary;
    String location;

    //let's give it a parameter so we'll determine even how big the raise will be
    public void raise(int raiseAmount){
        this.salary += raiseAmount;
    }

}