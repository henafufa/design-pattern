
/*
this class called when ever the baseSalary entered and evaluted in if condition if it
is between 7501-10900 the salary method executed by passing the base salary in the constrctor
*/

package salary.Decorator;

import salary.salaryCalculator;

public class taxFive  extends taxRateDecorator{
    salaryCalculator baseSalary;
    public taxFive(salaryCalculator baseSalary){
        this.baseSalary=baseSalary;
    }
    
    public double ratedSalary(){
        return this.baseSalary.getSalary()* 0.30;
        
    }
    @Override
    public double netPay() {
        
        return this.baseSalary.getSalary()-( ratedSalary() + this.baseSalary.pensionSalary());
        
    }
    public String toString(){
            return "The net pay(no allowance) \t"+ netPay()+ "\n The Income Tax:\t " + ratedSalary()+ "\n The Pension(7%):\t " + this.baseSalary.pensionSalary();
    }
    
}
