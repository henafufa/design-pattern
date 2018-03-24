
package salary;

import java.awt.FlowLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;
import salary.Decorator.taxFirst;
import salary.Decorator.taxThird;
import salary.netSalary;

public class Net extends javax.swing.JFrame {
  
    double gros,gros1,gros2,gros3,gros4,gros5,inputs,allowance;
    String input,inp,gros7;
    public Net() {
        super( " Net Salary" ); 
          setLayout( new FlowLayout() ); // set frame layout 
            setContentPane(new JLabel(new ImageIcon( getClass().getResource("log.jpg"))));  
//         setVisible( true );
         
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gross = new javax.swing.JLabel();
        gross1 = new javax.swing.JLabel();
        transport = new javax.swing.JTextField();
        gross2 = new javax.swing.JLabel();
        transport1 = new javax.swing.JTextField();
        gross3 = new javax.swing.JLabel();
        transport2 = new javax.swing.JTextField();
        calculate = new javax.swing.JButton();
        pension = new javax.swing.JLabel();
        net3 = new javax.swing.JTextField();
        grossSalary = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        net1 = new javax.swing.JTextField();
        income1 = new javax.swing.JLabel();
        net2 = new javax.swing.JTextField();
        check = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 600));
        setType(java.awt.Window.Type.POPUP);

        gross.setBackground(new java.awt.Color(255, 255, 255));
        gross.setFont(new java.awt.Font("Engravers MT", 1, 17)); // NOI18N
        gross.setForeground(new java.awt.Color(255, 255, 225));
        gross.setText("Base Salary");
        gross.setFocusable(false);
        gross.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        gross1.setBackground(new java.awt.Color(255, 255, 255));
        gross1.setFont(new java.awt.Font("Engravers MT", 1, 17)); // NOI18N
        gross1.setForeground(new java.awt.Color(255, 255, 225));
        gross1.setText("Transport Allowance");
        gross1.setFocusable(false);
        gross1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        transport.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        transport.setToolTipText("");
        transport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transportActionPerformed(evt);
            }
        });
        transport.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                transportKeyPressed(evt);
            }
        });

        gross2.setBackground(new java.awt.Color(255, 255, 255));
        gross2.setFont(new java.awt.Font("Engravers MT", 1, 17)); // NOI18N
        gross2.setForeground(new java.awt.Color(255, 255, 225));
        gross2.setText("Incentive");
        gross2.setFocusable(false);
        gross2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        transport1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        transport1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transport1ActionPerformed(evt);
            }
        });
        transport1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                transport1KeyPressed(evt);
            }
        });

        gross3.setBackground(new java.awt.Color(255, 255, 255));
        gross3.setFont(new java.awt.Font("Engravers MT", 1, 17)); // NOI18N
        gross3.setForeground(new java.awt.Color(255, 255, 225));
        gross3.setText("Overtime Earning");
        gross3.setFocusable(false);
        gross3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        transport2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        transport2.setText("0");
        transport2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transport2ActionPerformed(evt);
            }
        });
        transport2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                transport2KeyPressed(evt);
            }
        });

        calculate.setBackground(new java.awt.Color(20, 240, 240));
        calculate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        pension.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        pension.setForeground(new java.awt.Color(250, 250, 250));
        pension.setText("Pension(7%)");

        net3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        net3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                net3ActionPerformed(evt);
            }
        });

        grossSalary.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        grossSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grossSalaryActionPerformed(evt);
            }
        });
        grossSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                grossSalaryKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(250, 250, 250));
        jLabel2.setText("Net Salary");

        net1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        net1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                net1ActionPerformed(evt);
            }
        });

        income1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        income1.setForeground(new java.awt.Color(250, 250, 250));
        income1.setText("Income Tax");

        net2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        net2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                net2ActionPerformed(evt);
            }
        });

        check.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(grossSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gross1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(transport, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gross2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(transport1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(transport2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(gross3, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(gross, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(net1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(income1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(net3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pension, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(net2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 67, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(gross, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grossSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(net1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gross1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(income1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(transport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(net2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(gross2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pension, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(transport1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(net3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(gross3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(transport2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(check)
                        .addGap(5, 5, 5)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    public void setBase(double gros){
         gros = Double.parseDouble(grossSalary.getText());
         this.gros=gros;
       
    }
    public double getBase(){
//         gros = Double.parseDouble(grossSalary.getText());
        return this.gros;
    }
     public void setAllowance(double gros1,double gros2,double gros3,double allowance){
         this.gros1=gros1;
         this.gros2=gros2;
         this.gros3=gros3;
         this.allowance=allowance;
            
     }
    public double getAllowance(){
//       allowance=Double.parseDouble(grossSalary.getText());
         this.gros1=Double.parseDouble(transport.getText());
         this.gros2=Double.parseDouble(transport1.getText());
         this.gros3=Double.parseDouble(transport2.getText());
          this.allowance= this.gros1 + this.gros2 + this.gros3;
          this.allowance=allowance;
           System.out.println(this.allowance+"=|==|=");
           return this.allowance;
    }
    public String toString(){
         
        return "T:" + getAllowance();
    }

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        System.out.println(getAllowance()+"=|==|=");
         netSalary nh=new netSalary();
//         salaryCalculator tx1= new netPayment();
//         tx1.setSalary(gros);
//            tx1=new taxThird(tx1);
      
         setBase(gros);
         
         nh.setBase(gros);
//          nh.setAllowance(gros1,gros2,gros3,allowance);
          nh.setAllowance(gros1,gros2,gros3,allowance);
          System.out.println(this.allowance+"b =|==|=");
         this.gros=getBase();
         this.allowance=getAllowance();
         gros4=this.gros +this.allowance;
         input=String.format("%.0f", gros4);
         check.setText(input);
         
         System.out.println("baseSalary"+nh.baseSalary);
         inp=String.format("%f", nh.netPay());
         System.out.println("ta"+nh.tax1+"====");
         System.out.println( "netPay:"+nh.toString());
        net1.setText(inp);
        
         
          nh.netPay();
          gros7=String.format("%f", nh.ratedNet());
          net2.setText(gros7);
          System.out.println("ratedSalary:"+gros7);
          
          
        inp=String.format("%f", nh.pensionSalary());
        net3.setText(inp);
        System.out.println("pension:"+nh.pensionSalary());

    }//GEN-LAST:event_calculateActionPerformed

    private void transportKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_transportKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_transportKeyPressed

    private void transport1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_transport1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_transport1KeyPressed

    private void transport2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_transport2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_transport2KeyPressed

    private void transportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transportActionPerformed

    private void transport1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transport1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transport1ActionPerformed

    private void transport2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transport2ActionPerformed
    }//GEN-LAST:event_transport2ActionPerformed

    private void net3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_net3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_net3ActionPerformed

    private void grossSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grossSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grossSalaryActionPerformed

    private void net1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_net1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_net1ActionPerformed

    private void net2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_net2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_net2ActionPerformed

    private void grossSalaryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grossSalaryKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_grossSalaryKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         new Welcome().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Net().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculate;
    private javax.swing.JTextField check;
    private javax.swing.JLabel gross;
    private javax.swing.JLabel gross1;
    private javax.swing.JLabel gross2;
    private javax.swing.JLabel gross3;
    private javax.swing.JTextField grossSalary;
    private javax.swing.JLabel income1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JTextField net1;
    public javax.swing.JTextField net2;
    public javax.swing.JTextField net3;
    private javax.swing.JLabel pension;
    private javax.swing.JTextField transport;
    private javax.swing.JTextField transport1;
    private javax.swing.JTextField transport2;
    // End of variables declaration//GEN-END:variables

   
}
