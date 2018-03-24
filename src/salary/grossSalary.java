
package salary;

public class grossSalary extends salaryCalculator {
    
    public  void setSalary(double netSalary){
        this.netSalary=netSalary;
    }
    public double getSalary(){
        return netSalary;
    }
     public double netPay() {
         System.out.println("salary returned");
          return baseSalary;
    }
    public String toString(){
            return "The base salary"+ baseSalary;
    }
    
    
    
}
