/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package keypuzzle;

/**
 *
 * @author prabi
 */
public class InputForm extends javax.swing.JFrame {

    /**
     * Creates new form InputForm
     */
    public InputForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        inp_b = new javax.swing.JTextField();
        inp_c = new javax.swing.JTextField();
        inp_d = new javax.swing.JTextField();
        inp_a = new javax.swing.JTextField();
        inp_e = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Input Value");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("One Digit Right and its place");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("One Digit Right and wrong place");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Two Digit Right and both in wrong place");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("All digits are wrong");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("One Digit Right and wrong place");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        inp_b.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        inp_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inp_bActionPerformed(evt);
            }
        });
        inp_b.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inp_bKeyPressed(evt);
            }
        });
        getContentPane().add(inp_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 90, 30));

        inp_c.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        inp_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inp_cActionPerformed(evt);
            }
        });
        inp_c.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inp_cKeyPressed(evt);
            }
        });
        getContentPane().add(inp_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 90, 30));

        inp_d.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        inp_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inp_dActionPerformed(evt);
            }
        });
        inp_d.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inp_dKeyPressed(evt);
            }
        });
        getContentPane().add(inp_d, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 90, 30));

        inp_a.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        inp_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inp_aActionPerformed(evt);
            }
        });
        inp_a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inp_aKeyPressed(evt);
            }
        });
        getContentPane().add(inp_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 90, 30));

        inp_e.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        inp_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inp_eActionPerformed(evt);
            }
        });
        inp_e.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inp_eKeyPressed(evt);
            }
        });
        getContentPane().add(inp_e, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 90, 30));

        submit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        clear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inp_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inp_bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inp_bActionPerformed

    private void inp_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inp_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inp_cActionPerformed

    private void inp_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inp_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inp_dActionPerformed

    private void inp_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inp_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inp_aActionPerformed

    private void inp_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inp_eActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inp_eActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitActionPerformed

    private void inp_aKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inp_aKeyPressed
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (Character.isDigit(c) || Character.isISOControl(c)){
            inp_a.setEditable(true);
        } else {
            inp_a.setEditable(false);
        }
    }//GEN-LAST:event_inp_aKeyPressed

    private void inp_bKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inp_bKeyPressed
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (Character.isDigit(c) || Character.isISOControl(c)) {
            inp_b.setEditable(true);
        } else {
            inp_b.setEditable(false);
        }
    }//GEN-LAST:event_inp_bKeyPressed

    private void inp_cKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inp_cKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c) || Character.isISOControl(c)) {
            inp_c.setEditable(true);
        } else {
            inp_c.setEditable(false);
        }
    }//GEN-LAST:event_inp_cKeyPressed

    private void inp_dKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inp_dKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c) || Character.isISOControl(c)) {
            inp_d.setEditable(true);
        } else {
            inp_d.setEditable(false);
        }
    }//GEN-LAST:event_inp_dKeyPressed

    private void inp_eKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inp_eKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c) || Character.isISOControl(c)) {
            inp_e.setEditable(true);
        } else {
            inp_e.setEditable(false);
        }
    }//GEN-LAST:event_inp_eKeyPressed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        inp_a.setText("");
        inp_b.setText("");
        inp_c.setText("");
        inp_d.setText("");
        inp_e.setText("");
    }//GEN-LAST:event_clearActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(InputForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JTextField inp_a;
    private javax.swing.JTextField inp_b;
    private javax.swing.JTextField inp_c;
    private javax.swing.JTextField inp_d;
    private javax.swing.JTextField inp_e;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
