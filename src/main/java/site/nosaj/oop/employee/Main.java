package site.nosaj.oop.employee;

class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.name = "John";
        employee1.age = 25;
        employee1.salary = 100000;
        employee1.location = "New York";

        employee2.name = "Jane";
        employee2.age = 28;
        employee2.salary = 120000;
        employee2.location = "New York";

        employee1.raise(5000);

        System.out.println(employee1.salary+" "+employee2.salary);
    }
}
