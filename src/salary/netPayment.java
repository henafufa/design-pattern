
package salary;

public class netPayment extends salaryCalculator{
     public double netPay() {
         System.out.println("salary returned");
          return baseSalary;
    }
    public String toString(){
            return "The base salary"+ baseSalary;
    }
    public  void setSalary(double baseSalary){
        this.baseSalary=baseSalary;
    }
    public double getSalary(){
        return baseSalary;
    }
    
}
