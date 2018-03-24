/*
This class use pensionSalary from salaryCalculator--print about the pension salary
This class use ratedSalary from decorator class--print about the rated salary
This class use netPay from salaryCalculator--print about the netPay salary

*/
package salary;

import salary.Decorator.taxFirst;
import salary.Net;
import java.util.Scanner;
import salary.Decorator.taxSecond;
import salary.Decorator.taxThird;
import salary.Decorator.taxFour;
import salary.Decorator.taxFive;
import salary.Decorator.taxSix;
public class netSalary extends salaryCalculator{
//     public double baseSalary
      double tax1,tax2,tax3,gros1,gros2,gros3,netSalary,gross;
      String output;
      public void setBase(double baseSalary){
          this.baseSalary = baseSalary;
      }
       public double getBase() {
        
       return baseSalary;
    }
       public void setNet(double netSalary){
            this.netSalary=netSalary;
       
    }
       public double getNet(){
        return this.netSalary;
    }
       public void setBasenet(double netSalary){
            this.tax1=netSalary;
       
    }
       public double getBaseNet(){
        return this.tax1;
    }
//      }
       public double getAllowance() { 

             return allowance;
    }
       public void setAllowance(double gros1,double gros2,double gros3,double allowance){
         this.gros1=gros1;
         this.gros2=gros2;
         this.gros3=gros3;
         this.allowance=allowance;
            
     }
      
    @Override
    public double netPay() {
//         System.out.println(">>>==tax1: " + this.baseSalary); 
        if(baseSalary <= 600){
                 System.out.println(">>>tax1: " + this.baseSalary); 
//                 System.out.println("allo: " + this.allowance); 
//             salaryCalculator tx1= new netPayment();
             tax1 = (this.baseSalary - pensionSalary())+allowance;
             this.tax1=tax1;
                System.out.println("1:"+tax1);
            }  
        if(baseSalary >= 601 && baseSalary <= 1650){
            Net net=new Net();
             System.out.println(net.allowance+"form=|==|=");
             System.out.println("->>>tax1: " + baseSalary); 
//             net = tax1.netPay();
            salaryCalculator tax1= new netPayment();
            tax1.setSalary(baseSalary);
             System.out.println(tax1.getSalary());
            tax1=new taxFirst(tax1);
//            tax2=tax1.netPay();
             System.out.println("2nd:"+tax1.netPay());
                this.tax1=tax1.netPay()+this.allowance;
                System.out.println("2nd end:"+tax1.netPay());
             
            }  
        if(baseSalary >= 1654 && baseSalary <= 3200){
             System.out.println(">>>tax1: " + this.baseSalary); 
             salaryCalculator tax1= new netPayment();
            tax1.setSalary(baseSalary);
//             System.out.println(tax1.getSalary());
            tax1=new taxSecond(tax1);
//            tax2=tax1.netPay();
               System.out.println("3rd:"+tax1.netPay());
                this.tax1=tax1.netPay()+this.allowance;
                System.out.println("3rd end:"+tax1.netPay());
            
//             System.out.println("3:"+tax1.toString());
            }  
        if(baseSalary >= 3201 && baseSalary <= 5250){
             System.out.println(">>>tax1: " + this.baseSalary); 
             salaryCalculator tax1= new netPayment();
            tax1.setSalary(baseSalary);
//             System.out.println(tax1.getSalary());
            tax1=new taxThird(tax1);
            System.out.println("4:"+tax1);
//            tax2=tax1.netPay();
                 System.out.println("4th:"+tax1.netPay());
                this.tax1=tax1.netPay()+this.allowance;
                System.out.println("4th end:"+tax1.netPay());
            
//             System.out.println(tax1.toString());
            }  
        if(baseSalary >= 5251 && baseSalary <= 7800){
            System.out.println(">>>tax1: " + this.baseSalary); 
             salaryCalculator tax1= new netPayment();
            tax1.setSalary(baseSalary);
             System.out.println(tax1.getSalary()+this.allowance);
            tax1=new taxFour(tax1);
//            tax2=tax1.netPay();
                System.out.println("5th:"+tax1.netPay());
                this.tax1=tax1.netPay();
                System.out.println("5th end:"+tax1.netPay());
            System.out.println("5:"+tax1.toString());
            
            }  
        if(baseSalary >= 7801 && baseSalary <= 10900){
            System.out.println(">>>tax1: " + this.baseSalary); 
            salaryCalculator tax1= new netPayment();
            tax1.setSalary(baseSalary);
             System.out.println(tax1.getSalary()+this.allowance);
            tax1=new taxFive(tax1);
//            tax2=tax1.netPay();
                System.out.println("6th:"+tax1.netPay());
                this.tax1=tax1.netPay();
                System.out.println("6th end:"+tax1.netPay());
            
             System.out.println("6:"+tax1);
            }  
        if( baseSalary >= 10900 ){
            System.out.println(">>>tax1: " + this.baseSalary); 
             salaryCalculator tax1= new netPayment();
            tax1.setSalary(baseSalary);
             System.out.println(tax1.getSalary());
            tax1=new taxSix(tax1);
//            tax2=tax1.netPay();
                System.out.println("7th:"+tax1.netPay());
                this.tax1=tax1.netPay()+this.allowance;
                System.out.println("7th end:"+tax1.netPay());
            
             System.out.println("7:"+tax1);
            }  
//        output=String.format("%.0f",tax2);
//        forms1.net2.setText(output);
       System.out.println("tax1->->->end: " + this.tax1); 
       return this.tax1;
    }
    public double ratedNet() {
        if(baseSalary <= 600){
             this.tax2=0.000;
            }  
        if(baseSalary >= 601 && baseSalary <= 1650){
   
            salaryCalculator tax2= new netPayment();
            tax2.setSalary(baseSalary);
            tax2=new taxFirst(tax2);
            this.tax2=tax2.ratedSalary();
            System.out.println("3rd end:"+tax2.ratedSalary());
             
            }  
        if(baseSalary >= 1654 && baseSalary <= 3200){
            
             salaryCalculator tax2= new netPayment();
            tax2.setSalary(baseSalary);
            tax2=new taxSecond(tax2);
             this.tax2=tax2.ratedSalary();
             System.out.println("3rd end:"+tax2.ratedSalary());
               
            }  
        if(baseSalary >= 3201 && baseSalary <= 5250){
     
             salaryCalculator tax2= new netPayment();
            tax2.setSalary(baseSalary);
            tax2=new taxThird(tax2);
            System.out.println("4:"+tax2);
             this.tax2=tax2.ratedSalary();
             System.out.println("3rd end:"+tax2.ratedSalary());
//            
            }  
        if(baseSalary >= 5251 && baseSalary <= 7800){
          
             salaryCalculator tax2= new netPayment();
            tax2.setSalary(baseSalary);
             System.out.println(tax2.getSalary());
            tax2=new taxFour(tax2);
            this.tax2=tax2.ratedSalary();
             System.out.println("3rd end:"+tax2.ratedSalary());
            
            }  
        if(baseSalary >= 7801 && baseSalary <= 10900){ 
            salaryCalculator tax2= new netPayment();
            tax2.setSalary(baseSalary);
            tax2=new taxFive(tax2);
              this.tax2=tax2.ratedSalary();
             System.out.println("3rd end:"+tax2.ratedSalary());
             
            }  
        if( baseSalary >= 10900 ){
          
             salaryCalculator tax2= new netPayment();
            tax2.setSalary(baseSalary);
            tax2=new taxSix(tax2);
           this.tax2=tax2.ratedSalary();
             System.out.println("3rd end:"+tax2.ratedSalary());
            }  
//        output=String.format("%.0f",tax2);
//        forms1.net2.setText(output);
       System.out.println("tax2***end: " + this.tax2); 
       return this.tax2;
    }
   
     public String toString(){
         System.out.println("tax===end: " + this.netSalary);
            return "" + this.tax1;
//             return "The base salary \t" + gross()+ tax1;
    }
     public double grossSalary(){
         System.out.println(this.netSalary);
         this.baseSalary=netSalary;
          if( baseSalary <= 600 ){
              gross=netSalary+pensionSalary();
         }
           if(netSalary >= 601 && netSalary <= 1650){
   
            salaryCalculator tax3= new netPayment();
            tax3.setSalary(netSalary);
            tax3=new taxFirst(tax3);
            this.tax3=tax3.ratedSalary();
            System.out.println("3rd end:"+tax3.ratedSalary());
             gross=netSalary+pensionSalary()+tax3.ratedSalary();
              System.out.println("3rd gross:"+ gross);
             
            }  
        if(netSalary >= 1654 && netSalary <= 3200){
            
             salaryCalculator tax3= new netPayment();
            tax3.setSalary(baseSalary);
            tax3=new taxSecond(tax3);
             this.tax3=tax3.ratedSalary();
             System.out.println("3rd end:"+tax3.ratedSalary());
                gross=netSalary+pensionSalary()+ ratedSalary();
              System.out.println("3rd gross:"+ gross);
               
            }  
        if(netSalary >= 3201 && netSalary <= 5250){
     
             salaryCalculator tax3= new netPayment();
            tax3.setSalary(netSalary);
            tax3=new taxThird(tax3);
            System.out.println("4:"+tax3);
             this.tax3=tax3.ratedSalary();
             System.out.println("3rd end:"+tax3.ratedSalary());
                gross=netSalary+pensionSalary()+ ratedSalary();
              System.out.println("3rd gross:"+ gross);
//            
            }  
        if(netSalary >= 5251 && netSalary <= 7800){
          
             salaryCalculator tax3= new netPayment();
            tax3.setSalary(baseSalary);
             System.out.println(tax3.getSalary());
            tax3=new taxFour(tax3);
            this.tax3=tax3.ratedSalary();
             System.out.println("3rd end:"+tax3.ratedSalary());
              gross=netSalary+pensionSalary()+ ratedSalary();
              System.out.println("3rd gross:"+ gross);
            
            }  
        if(netSalary >= 7801 && netSalary <= 10900){ 
            salaryCalculator tax3= new netPayment();
            tax3.setSalary(baseSalary);
            tax3=new taxFive(tax3);
              this.tax3=tax3.ratedSalary();
             System.out.println("3rd end:"+tax3.ratedSalary());
              gross=netSalary+pensionSalary()+ ratedSalary();
              System.out.println("3rd gross:"+ gross);
             
            }  
        if( netSalary >= 10900 ){
          
             salaryCalculator tax3= new netPayment();
            tax3.setSalary(baseSalary);
            tax3=new taxSix(tax3);
           this.tax3=tax3.ratedSalary();
             System.out.println("3rd end:"+tax3.ratedSalary());
              gross=netSalary+pensionSalary()+ ratedSalary();
              System.out.println("3rd gross:"+ gross);
            }  
        output=String.format("%.0f",gross);
    return gross;
     }

    
}
