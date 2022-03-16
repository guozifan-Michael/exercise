package Package004;

// 实例变量
public class Employee {
    // 这个实例变量对子类可见
    public String name;
    // 私有变量，仅在该类可见
    private double salary;
    // 在构造器中name赋值
//   public Employee(String empName){
//        name = empName;
//    }
    // 设定Salary的值
    public void setSalary(double empSal){
        salary = empSal;
    }
    // 打印信息
    public void printEmp(){
        System.out.println("名字："+name);
        System.out.println("薪水："+salary);
    }

    public static void main(String[] args){
//        Employee empone = new Employee("RUNOOB");
//        empone.setSalary(1000.0);
//        empone.printEmp();
    }
}
