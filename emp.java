// class person
// {
//     String name;
//     int age;
//     person(int age, String name)
//     {
//         this.name = name;
//         this.age = age;
//     }
// }

// class Employee extends person
// {
//     int empid;
//     int empsal;
//     Employee(int id,int salary, int age, String name)
//     {
//         super(age,name);
//         empid= id;
//         empsal = salary;
//     }
//     void printEmployeeDetails()
//     {
//         System.out.println("Employee Name :" + name);
//         System.out.println("Employee Id :" + empid);
//         System.out.println("Employee Age :" + age);
//         System.out.println("Employee Salary :" + empsal);
//     }
// }
// public class emp
// {
//     public static void main(String aes[])
//     {
//         Employee emp = new Employee(10,1000000,19,"Dhanushkumar");
//         emp.printEmployeeDetails();
//     }
// }



//
// class person{
//     String name;
//     int age;
    
//     person(int age,String name)
//     {
//         this.name =name;
//         this.age = age;
        
//     }
// }

// class employee extends person
// {
//     int empsal;
//     int empid;
    
//     employee(String name,int age,int id,int salary)
//     {
//         super(age,name);
//         empid = id;
//         empsal = salary;
//     }
//   void employeePrintdetails()
// {
//     System.out.println("Employee name:" + name);
//     System.out.println("Employee Age:" + age);
//     System.out.println("Employee Id:" + empid);
//     System.out.println("Employee Salary:" + empsal);
// }
  
// }


// public class emp
// {
//     public static void main(String ages[])
//     {
//         employee emp = new employee("Aswin",13,134,23334);
//         emp.employeePrintdetails();
//     }
// }



// class person {
// String name;
// int age;

// person(String name,int age){
//     this.name = name;
//     this.age = age;
// }
// }

// class employee extends person{
//     int empid;
//     int empsal;
    
//     employee(String name,int age,int id, int salary){
//         super(name,age);
//         empid = id;
//         empsal = salary;
//     }
//     void printEmployeeDetails(){
//         System.out.println("employee Name :" + name);
//         System.out.println("employee Age :" + age);
//         System.out.println("employee Id :" + empid);
//         System.out.println("employee Salary :" + empsal);
//     }
// }

// public class emp
// {
    
// public static void main(String args[]) 
// {
//     employee emp = new employee("sanjaykumar",12,24,123456);
//     emp.printEmployeeDetails();
// }
// }


// class person{
//     String name;
//     int age;
    
//     person(String name, int age){
//         this.name = name;
//         this.age = age;
//     }
// }

// class employee extends person{
//     int empid ;
//     int empsal;
    
//     employee(String name, int age,int id, int salary){
//         super(name,age);
//         empid = id;
//         empsal = salary;
//     }
//     void printdetails(){
//         System.out.println("Employee name :" + name);
//         System.out.println("Employee name :" + age);
//         System.out.println("Employee name :" + empid);
//         System.out.println("Employee name :" + empsal);
//     }
// }

// public class emp{
//     public static void main(String args[]){
//         employee emp  =  new employee("arun",12,23,234);
        
//         emp.printdetails();
//     }
// }


class person{
    String name;
    int age;
    person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class employee extends person{
    int empid;
    int empsal;
    
    employee(String name, int age, int id, int salary){
        super(name, age);
        empid = id;
        empsal = salary;
        
        
    }
    void printdetails(){
        System.out.println("Employee name :" + name);
        System.out.println("Employee name :" + age);
        System.out.println("Employee name :" + empid);
        System.out.println("Employee name :" + empsal);
    }
}

public class emp{
    public static void main(String args[]){
        employee emp = new employee("dhanushkumar",12,34,23546);
        emp.printdetails();
    }
}