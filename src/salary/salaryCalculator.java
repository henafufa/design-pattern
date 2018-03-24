
package salary;

abstract public class salaryCalculator {
    
    private String info;
    
    public double baseSalary,allowance,netSalary;
    
//    public salaryCalculator(double baseSalary){
//        
//    }
    
    public abstract double netPay();
    
    public void info(){
    }
    //rated salary
    
    public double ratedSalary(){
        return baseSalary * 0.0;
    }
    
    // am jst did for only individuals
    public double pensionSalary(){
        return baseSalary * 0.07;
    }
    public  void setSalary(double baseSalary){
        this.baseSalary=baseSalary;
    }
    public double getSalary(){
        return baseSalary;
    }
//    public String toString(){
//            return "The base salary"+ this.baseSalary;
//    }
}
