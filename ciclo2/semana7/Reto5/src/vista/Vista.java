/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controladorbo.EstudianteBo;
import javax.swing.JOptionPane;
import modelovo.EstudianteVo;

/**
 *
 * @author leale
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista() {
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

        LNombres = new javax.swing.JLabel();
        LApellidos = new javax.swing.JLabel();
        LNacimiento = new javax.swing.JLabel();
        LCorreoInst = new javax.swing.JLabel();
        LCorreoPersonal = new javax.swing.JLabel();
        LCelular = new javax.swing.JLabel();
        LFijo = new javax.swing.JLabel();
        LPrograma = new javax.swing.JLabel();
        TNombres = new javax.swing.JTextField();
        TApellidos = new javax.swing.JTextField();
        TNacimiento = new javax.swing.JTextField();
        TCorreoInst = new javax.swing.JTextField();
        TCorreoPersonal = new javax.swing.JTextField();
        TCelular = new javax.swing.JTextField();
        TFijo = new javax.swing.JTextField();
        TPrograma = new javax.swing.JTextField();
        BAgregar = new javax.swing.JButton();
        BModificar = new javax.swing.JButton();
        BEliminar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        BConsultas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LNombres.setText("Nombres");

        LApellidos.setText("Apellidos");

        LNacimiento.setText("Fecha de Nacimiento");

        LCorreoInst.setText("Correo Institucional");

        LCorreoPersonal.setText("Correo Personal");

        LCelular.setText("Celular");

        LFijo.setText("Fijo");

        LPrograma.setText("Programa Academico");

        TCorreoPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCorreoPersonalActionPerformed(evt);
            }
        });

        TFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFijoActionPerformed(evt);
            }
        });

        BAgregar.setText("Agregar");
        BAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAgregarActionPerformed(evt);
            }
        });

        BModificar.setText("Modificar");
        BModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BModificarActionPerformed(evt);
            }
        });

        BEliminar.setText("Eliminar");
        BEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarActionPerformed(evt);
            }
        });

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        BConsultas.setText("Consultas");
        BConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BConsultasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(LNombres)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(LApellidos)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LFijo)
                                .addComponent(LCelular)
                                .addComponent(LCorreoPersonal)
                                .addComponent(LCorreoInst)
                                .addComponent(LNacimiento))
                            .addGap(18, 18, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TCelular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TFijo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TCorreoPersonal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TCorreoInst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TNacimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(LPrograma)
                            .addGap(35, 35, 35)
                            .addComponent(TPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(BModificar)
                        .addGap(18, 18, 18)
                        .addComponent(BEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(Limpiar)
                        .addGap(18, 18, 18)
                        .addComponent(BConsultas)))
                .addContainerGap(307, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LNombres)
                    .addComponent(TNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LApellidos)
                    .addComponent(TApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LNacimiento)
                    .addComponent(TNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LCorreoInst)
                    .addComponent(TCorreoInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LCorreoPersonal)
                    .addComponent(TCorreoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LCelular)
                    .addComponent(TCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LFijo)
                    .addComponent(TFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LPrograma)
                    .addComponent(TPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BAgregar)
                    .addComponent(BModificar)
                    .addComponent(BEliminar)
                    .addComponent(Limpiar)
                    .addComponent(BConsultas))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TCorreoPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCorreoPersonalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TCorreoPersonalActionPerformed

    private void TFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFijoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFijoActionPerformed

    private void BAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAgregarActionPerformed
        // TODO add your handling code here:
        EstudianteVo estudiante = new EstudianteVo();
        estudiante.setNombres(TNombres.getText());
        estudiante.setApellidos(TApellidos.getText());
        estudiante.setNacimiento(TNacimiento.getText());
        estudiante.setCorreoInst(TCorreoInst.getText());
        estudiante.setCorreoPersonal(TCorreoPersonal.getText());
        estudiante.setCelular(Long.parseLong(TCelular.getText()));
        estudiante.setFijo(Long.parseLong(TFijo.getText()));
        estudiante.setPrograma(TPrograma.getText());
        boolean Resultado = new EstudianteBo().agregarEstudiante(estudiante);
        String mensaje = Resultado?"El estudiante fue registrado":"El estudiante no fue registrado";
        
        JOptionPane.showMessageDialog(this, mensaje);
    }//GEN-LAST:event_BAgregarActionPerformed

    private void BModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BModificarActionPerformed
        // TODO add your handling code here:
        String CorreoInst = TCorreoInst.getText();
        EstudianteVo estudiante = new EstudianteVo();
        estudiante.setNombres(TNombres.getText());
        estudiante.setApellidos(TApellidos.getText());
        estudiante.setNacimiento(TNacimiento.getText());
        estudiante.setCorreoPersonal(TCorreoPersonal.getText());
        estudiante.setCelular(Long.parseLong(TCelular.getText()));
        estudiante.setFijo(Long.parseLong(TFijo.getText()));
        estudiante.setPrograma(TPrograma.getText());
        boolean Resultado = new EstudianteBo().actualizarEstudiante(CorreoInst, estudiante);
        String mensaje = Resultado?"El estudiante fue modificado":"El estudiante no fue modificado";
        
        JOptionPane.showMessageDialog(this, mensaje);
    }//GEN-LAST:event_BModificarActionPerformed

    private void BEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarActionPerformed
        // TODO add your handling code here:
        EstudianteVo estudiante = new EstudianteVo();
        String CorreoInst = TCorreoInst.getText();
        boolean Resultado = new EstudianteBo().eliminarEstudiante(CorreoInst);
        String mensaje = Resultado?"El estudiante fue eliminado":"El estudiante no fue eliminado";
        
        JOptionPane.showMessageDialog(this, mensaje);
    }//GEN-LAST:event_BEliminarActionPerformed

    
    public void limpiar() {
        TNombres.setText(null);
        TApellidos.setText(null);
        TNacimiento.setText(null);
        TCorreoInst.setText(null);
        TCorreoPersonal.setText(null);
        TCelular.setText(null);
        TFijo.setText(null);
        TPrograma.setText(null);
    }
    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void BConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BConsultasActionPerformed
        // TODO add your handling code here:
        new Consultas(this, true).setVisible(true);
        
    }//GEN-LAST:event_BConsultasActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAgregar;
    private javax.swing.JButton BConsultas;
    private javax.swing.JButton BEliminar;
    private javax.swing.JButton BModificar;
    private javax.swing.JLabel LApellidos;
    private javax.swing.JLabel LCelular;
    private javax.swing.JLabel LCorreoInst;
    private javax.swing.JLabel LCorreoPersonal;
    private javax.swing.JLabel LFijo;
    private javax.swing.JLabel LNacimiento;
    private javax.swing.JLabel LNombres;
    private javax.swing.JLabel LPrograma;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField TApellidos;
    private javax.swing.JTextField TCelular;
    private javax.swing.JTextField TCorreoInst;
    private javax.swing.JTextField TCorreoPersonal;
    private javax.swing.JTextField TFijo;
    private javax.swing.JTextField TNacimiento;
    private javax.swing.JTextField TNombres;
    private javax.swing.JTextField TPrograma;
    // End of variables declaration//GEN-END:variables
}
