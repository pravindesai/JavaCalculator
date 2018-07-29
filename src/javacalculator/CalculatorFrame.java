/**
 * @name        Java Calculator
 * @author      Pravin Desai
 * @email       pravindesai100@gmail.com
 * @link        https://github.com/pravindesai
 * @copyright   Copyright ravin Desai, All Rights Reserved.
 * @created      29-07-2018
 */
package javacalculator;


public class CalculatorFrame extends javax.swing.JFrame {

    /**
     * Creates new form CalculatorFrame
     */
    public CalculatorFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jTextField = new javax.swing.JTextField();
        two = new javax.swing.JButton();
        div = new javax.swing.JButton();
        one = new javax.swing.JButton();
        three = new javax.swing.JButton();
        five = new javax.swing.JButton();
        mul = new javax.swing.JButton();
        four = new javax.swing.JButton();
        six = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        add = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        dp = new javax.swing.JButton();
        mod = new javax.swing.JButton();
        eql = new javax.swing.JButton();
        SqrRoot = new javax.swing.JButton();
        CLR = new javax.swing.JButton();
        sqr1 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 350, 80));

        two.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        getContentPane().add(two, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 80, 50));

        div.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        div.setText("/");
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });
        getContentPane().add(div, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 80, 50));

        one.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        getContentPane().add(one, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 80, 50));

        three.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        getContentPane().add(three, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 80, 50));

        five.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        getContentPane().add(five, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 80, 50));

        mul.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mul.setText("*");
        mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulActionPerformed(evt);
            }
        });
        getContentPane().add(mul, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 80, 50));

        four.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        getContentPane().add(four, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 80, 50));

        six.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        getContentPane().add(six, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 80, 50));

        sub.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sub.setText("-");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });
        getContentPane().add(sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 80, 50));

        eight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        getContentPane().add(eight, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 80, 50));

        seven.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        getContentPane().add(seven, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 80, 50));

        nine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        getContentPane().add(nine, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 80, 50));

        add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add.setText("+");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 80, 50));

        zero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        getContentPane().add(zero, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 80, 50));

        dp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dp.setText(".");
        dp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpActionPerformed(evt);
            }
        });
        getContentPane().add(dp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 80, 50));

        mod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mod.setText("mod");
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });
        getContentPane().add(mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 80, 50));

        eql.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eql.setText("=");
        eql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eqlActionPerformed(evt);
            }
        });
        getContentPane().add(eql, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 80, 50));

        SqrRoot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SqrRoot.setText("√");
        SqrRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SqrRootActionPerformed(evt);
            }
        });
        getContentPane().add(SqrRoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 80, 50));

        CLR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CLR.setText("CLR");
        CLR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLRActionPerformed(evt);
            }
        });
        getContentPane().add(CLR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 80, 50));

        sqr1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sqr1.setText("x²");
        sqr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqr1ActionPerformed(evt);
            }
        });
        getContentPane().add(sqr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 80, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
       a=Double.parseDouble(jTextField.getText());
       op="div";
       jTextField.setText("");
    }//GEN-LAST:event_divActionPerformed

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
       String s1=jTextField.getText();
       a=Double.parseDouble(s1);
       op="mod";
       jTextField.setText("");
    }//GEN-LAST:event_modActionPerformed

    private void jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        a=Double.parseDouble(jTextField.getText());
       op="sub";
       jTextField.setText("");
    }//GEN-LAST:event_subActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        a=Double.parseDouble(jTextField.getText());
       op="add";
       jTextField.setText("");
    }//GEN-LAST:event_addActionPerformed

    private void mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulActionPerformed
        a=Double.parseDouble(jTextField.getText());
       op="mul";
       jTextField.setText("");
    }//GEN-LAST:event_mulActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        jTextField.setText(jTextField.getText()+"3"); 
    }//GEN-LAST:event_threeActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        jTextField.setText(jTextField.getText()+"1");            // TODO add your handling code here:
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        jTextField.setText(jTextField.getText()+"2"); 
    }//GEN-LAST:event_twoActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        jTextField.setText(jTextField.getText()+"4"); 
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        jTextField.setText(jTextField.getText()+"5"); 
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        jTextField.setText(jTextField.getText()+"6"); 
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        jTextField.setText(jTextField.getText()+"7"); 
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        jTextField.setText(jTextField.getText()+"8"); 
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        jTextField.setText(jTextField.getText()+"9"); 
    }//GEN-LAST:event_nineActionPerformed

    private void dpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpActionPerformed
        jTextField.setText(jTextField.getText()+".");
    }//GEN-LAST:event_dpActionPerformed

    private void eqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eqlActionPerformed
       b=Double.parseDouble(jTextField.getText());
       
        switch(op)
       {
            case "add":
                Ans=a+b;
               break;
            case "sub":
                Ans=a-b;
               break;
            case "mul":
                Ans=a*b;
               break;
            case "div":
                Ans=a/b;
               break;
            case "mod":
                Ans=a%b;
               break;
                  
       }
        jTextField.setText("");
        jTextField.setText(Double.toString(Ans));
    }//GEN-LAST:event_eqlActionPerformed

    private void CLRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLRActionPerformed
       jTextField.setText("");
    }//GEN-LAST:event_CLRActionPerformed

    private void sqr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqr1ActionPerformed
        double SqrNo,No;
        String s3=jTextField.getText();
        No = Double.parseDouble(s3);
        SqrNo=No*No;
        jTextField.setText(Double.toString(SqrNo));
    }//GEN-LAST:event_sqr1ActionPerformed

    private void SqrRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SqrRootActionPerformed
        double Sqrt,No;
        String s3=jTextField.getText();
        No = Double.parseDouble(s3);
        Sqrt=Math.sqrt(No);
        jTextField.setText(Double.toString(Sqrt));
    }//GEN-LAST:event_SqrRootActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
       jTextField.setText(jTextField.getText()+"0");
    }//GEN-LAST:event_zeroActionPerformed

   static double a,b,Ans;
   static String op;
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CalculatorFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CLR;
    private javax.swing.JButton SqrRoot;
    private javax.swing.JButton add;
    private javax.swing.JButton div;
    private javax.swing.JButton dp;
    private javax.swing.JButton eight;
    private javax.swing.JButton eql;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField jTextField;
    private javax.swing.JButton mod;
    private javax.swing.JButton mul;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton sqr1;
    private javax.swing.JButton sub;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
