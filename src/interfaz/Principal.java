/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import clases.Cafetera;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Principal extends javax.swing.JFrame {

    Cafetera c;
    public Principal() {
        initComponents();
        cmdVaciar.setEnabled(false);
        cmdLlenar.setEnabled(false);
        cmdAgregar.setEnabled(false);
        cmdServir.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCTazas = new javax.swing.JTextField();
        txtCActual = new javax.swing.JTextField();
        txtICafe = new javax.swing.JTextField();
        txtITaza = new javax.swing.JTextField();
        cmdVaciar = new javax.swing.JButton();
        cmdEstablecer = new javax.swing.JButton();
        cmdAgregar = new javax.swing.JButton();
        cmdServir = new javax.swing.JButton();
        cmdLlenar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCMaxima = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmdBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Cantidad a Depositar:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Capacidad Maxima:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Ingresar café:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Cantidad de tazas:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        txtCTazas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtCTazas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCTazasKeyTyped(evt);
            }
        });
        jPanel1.add(txtCTazas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 60, -1));

        txtCActual.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtCActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCActualKeyTyped(evt);
            }
        });
        jPanel1.add(txtCActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 60, -1));

        txtICafe.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtICafe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtICafeKeyTyped(evt);
            }
        });
        jPanel1.add(txtICafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 60, -1));

        txtITaza.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtITaza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtITazaKeyTyped(evt);
            }
        });
        jPanel1.add(txtITaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 60, -1));

        cmdVaciar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdVaciar.setText("Vaciar cafetera");
        cmdVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdVaciarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdVaciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 140, -1));

        cmdEstablecer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdEstablecer.setText("Establecer");
        cmdEstablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEstablecerActionPerformed(evt);
            }
        });
        jPanel1.add(cmdEstablecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 120, -1));

        cmdAgregar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdAgregar.setText("Agregar");
        cmdAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 120, -1));

        cmdServir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdServir.setText("Servir");
        cmdServir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdServirActionPerformed(evt);
            }
        });
        jPanel1.add(cmdServir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 120, -1));

        cmdLlenar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdLlenar.setText("Llenar cafetera");
        cmdLlenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdLlenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 120, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Capacidad Actual:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        txtCMaxima.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtCMaxima.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCMaximaKeyTyped(evt);
            }
        });
        jPanel1.add(txtCMaxima, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 60, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("CAFETERA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        cmdBorrar.setText("BORRAR");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCTazasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCTazasKeyTyped
        // TODO add your handling code here:

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtCTazasKeyTyped

    private void txtCActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCActualKeyTyped
        // TODO add your handling code here:

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtCActualKeyTyped

    private void txtICafeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtICafeKeyTyped
        // TODO add your handling code here:

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtICafeKeyTyped

    private void txtITazaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtITazaKeyTyped
        // TODO add your handling code here:

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtITazaKeyTyped

    private void cmdVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdVaciarActionPerformed
        // TODO add your handling code here:

        c.Vaciar();

         JOptionPane.showMessageDialog(this, "Cafetera Vaciada Satisfactoriamente su nueva capacida es de: " +c.getCapacidadActual() );
        txtCActual.setEditable(true);
    }//GEN-LAST:event_cmdVaciarActionPerformed

    private void cmdEstablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEstablecerActionPerformed
        // TODO add your handling code here:

        int a = 0, b = 0;
        int sw = 1;

        try {
            a = Integer.parseInt(txtCActual.getText());
            b = Integer.parseInt(txtCMaxima.getText());
            if (b == 0) {
                 JOptionPane.showMessageDialog(this, "La cantidad maxima no puede ser 0");
                txtCMaxima.requestFocusInWindow();
                txtCMaxima.selectAll();
                sw = 0;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Porfavor digite los datos correctos");
            sw = 0;
        }

        if (sw == 1) {
            c = new Cafetera(b, a);
           JOptionPane.showMessageDialog(this, "Cafetera Creada Satisfactoriamente su capacidad es de: " + c.getCapacidadActual());
            
            txtCActual.setEditable(false);
            txtCActual.setText("");
            txtCMaxima.setEditable(false);
            txtCMaxima.setText("");
            cmdVaciar.setEnabled(true);
            cmdLlenar.setEnabled(true);
            cmdAgregar.setEnabled(true);
            cmdServir.setEnabled(true);
        }
    }//GEN-LAST:event_cmdEstablecerActionPerformed

    private void cmdAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAgregarActionPerformed
        // TODO add your handling code here:

        int h = 0;
        int sw = 1;

        try {
            h = Integer.parseInt(txtICafe.getText());
            if (h == 0) {
                 JOptionPane.showMessageDialog(this, "La cantidad  a agregar no puede ser 0");
                txtICafe.requestFocusInWindow();
                txtICafe.selectAll();
                sw = 0;
            }
        } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(this, "Favor digitar los datos correctos");
            sw = 0;
        }

        if (sw == 1) {
            c.AgregarCafe(h);

            if (c.getCapacidadActual() >= c.getCapacidadMaxima()){
                 JOptionPane.showMessageDialog(this, "La Cafetera esta LLena no se puede llenar mas");
            } else {
                 JOptionPane.showMessageDialog(this, "A agregado satisfactoriamente, la  cantida de cafe actual es de: "+c.getCapacidadActual());
                txtICafe.setText("");
            }
        }
    }//GEN-LAST:event_cmdAgregarActionPerformed

    private void cmdServirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdServirActionPerformed
        // TODO add your handling code here:

        int j = 0, k = 0;
        int sw = 1;

        try {
            j = Integer.parseInt(txtCTazas.getText());
            if (j == 0) {
                JOptionPane.showMessageDialog(this, "La cantidad de tazas a servir no 0");
                txtCTazas.requestFocusInWindow();
                txtCTazas.selectAll();
                sw = 0;
            }
            k = Integer.parseInt(txtITaza.getText());
            if (k == 0) {
                 JOptionPane.showMessageDialog(this, "La cantidad de tazas a servir no puede ser 0");
                txtITaza.requestFocusInWindow();
                txtITaza.selectAll();
                sw = 0;
            }
        } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(this, "Por favor Dijite datos Validos");
            sw = 0;
        }

        if (sw == 1) {
            if (c.getCapacidadActual() == 0){
                JOptionPane.showMessageDialog(this, "Por favor ingrese cafe ");
                txtCTazas.setText("");
                txtITaza.setText("");
                txtICafe.requestFocusInWindow();
            } else if (c.getCapacidadActual() < (j * k)) {
                JOptionPane.showMessageDialog(this, "Queda poco cafe se servira hasta donde alcanze");
                c.setCapacidadActual(0);
                txtCTazas.setText("");
                txtITaza.setText("");
            } else {
                c.ServirTaza(j, k);
                 JOptionPane.showMessageDialog(this, "Las tazas servidad satisfactoriamente, su cantida en la cafeteria es de: " +c.getCapacidadActual() );
                txtITaza.setText("");
                txtCTazas.setText("");
            }
        }
    }//GEN-LAST:event_cmdServirActionPerformed

    private void cmdLlenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarActionPerformed
        // TODO add your handling code here:

        c.LlenarCafetera();
        
         JOptionPane.showMessageDialog(this, "Cafetera llena satisfactoriamente capacidad actua es de: " +c.getCapacidadActual());

        
    }//GEN-LAST:event_cmdLlenarActionPerformed

    private void txtCMaximaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCMaximaKeyTyped
        // TODO add your handling code here:

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtCMaximaKeyTyped

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
       txtCActual.getText();
       txtCMaxima.getText();
       txtCTazas.getText();
       txtICafe.getText();
       txtITaza.getText();
       
       
    }//GEN-LAST:event_cmdBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAgregar;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdEstablecer;
    private javax.swing.JButton cmdLlenar;
    private javax.swing.JButton cmdServir;
    private javax.swing.JButton cmdVaciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCActual;
    private javax.swing.JTextField txtCMaxima;
    private javax.swing.JTextField txtCTazas;
    private javax.swing.JTextField txtICafe;
    private javax.swing.JTextField txtITaza;
    // End of variables declaration//GEN-END:variables
}
