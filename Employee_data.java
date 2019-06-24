import java.util.*;
import java.lang.*;
class Bank{
    String city;
    String bank_name;
    Bank(String x,String y){
        city=x;
        bank_name=y;
    }
    void print(){
        System.out.println("Bank Name: "+bank_name);
        System.out.println("City : "+city);
    }
}
class Employee_data extends Bank{
    int no_of_employees;
    Employee_data(String x,String y, int a){
        super(x,y);
        no_of_employees=a;
    }
    void print(){
        super.print();
        System.out.println("No of Employees: "+no_of_employees);
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of bank data to store: ");
        int n=in.nextInt();
        System.out.println("Enter bank data as bank-name, city and no of employees: ");
        Employee_data obj[]=new Employee_data[n];
        for(int i=0;i<n;i++){
            String name=in.next();
            String city=in.next();
            int num=in.nextInt();
            obj[i]=new Employee_data(city,name,num);
        }
        System.out.println("All bank data:");
        System.out.println(" ");
        for(int i=0;i<n;i++){
            obj[i].print();
        }
    }
}