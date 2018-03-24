/*
The only thing this class  and its subclass did is take the basesalary return 
the rated salary and calculate the net salary based on rated salary;
*/

package salary.Decorator;

import salary.salaryCalculator;

public abstract class taxRateDecorator extends salaryCalculator {
    
    
    public abstract double netPay();
    
}
