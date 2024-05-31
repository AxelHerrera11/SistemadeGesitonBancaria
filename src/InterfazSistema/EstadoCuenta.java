package InterfazSistema;

import Codigo.LogicaReportesTXT;
import java.awt.Color;

public class EstadoCuenta extends javax.swing.JFrame {

    public EstadoCuenta() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.advertenciaCampoD1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPanelEstadoCuenta = new javax.swing.JPanel();
        tituloNoCuentaEstadoCuenta = new javax.swing.JLabel();
        avisoEstadoCuenta = new javax.swing.JLabel();
        advertenciaCampoD2 = new javax.swing.JLabel();
        advertenciaCampoD1 = new javax.swing.JLabel();
        ingresoNoCuentaEstadoCuenta = new javax.swing.JTextField();
        tituloDeposito = new javax.swing.JLabel();
        botonRegresoReporte1 = new javax.swing.JPanel();
        tituloRegresoInicio1 = new javax.swing.JLabel();
        botonRealizarEstadoCuenta = new javax.swing.JPanel();
        tituloBotonRealizarEstadoCuenta = new javax.swing.JLabel();
        CuadroEstadoCuenta = new javax.swing.JLabel();
        fondoEstadoCuenta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondoPanelEstadoCuenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloNoCuentaEstadoCuenta.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        tituloNoCuentaEstadoCuenta.setForeground(new java.awt.Color(51, 51, 51));
        tituloNoCuentaEstadoCuenta.setText("No. Cuenta");
        fondoPanelEstadoCuenta.add(tituloNoCuentaEstadoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, -1));

        avisoEstadoCuenta.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        avisoEstadoCuenta.setForeground(new java.awt.Color(0, 153, 0));
        avisoEstadoCuenta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fondoPanelEstadoCuenta.add(avisoEstadoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 340, 15));

        advertenciaCampoD2.setFont(new java.awt.Font("Unispace", 0, 10)); // NOI18N
        advertenciaCampoD2.setForeground(new java.awt.Color(153, 0, 0));
        advertenciaCampoD2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fondoPanelEstadoCuenta.add(advertenciaCampoD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 340, 15));

        advertenciaCampoD1.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        advertenciaCampoD1.setForeground(new java.awt.Color(153, 0, 0));
        advertenciaCampoD1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        advertenciaCampoD1.setText("CAMPO REQUERIDO");
        fondoPanelEstadoCuenta.add(advertenciaCampoD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 120, -1));

        ingresoNoCuentaEstadoCuenta.setBackground(new java.awt.Color(255, 255, 255));
        ingresoNoCuentaEstadoCuenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        ingresoNoCuentaEstadoCuenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ingresoNoCuentaEstadoCuentaFocusLost(evt);
            }
        });
        ingresoNoCuentaEstadoCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingresoNoCuentaEstadoCuentaKeyTyped(evt);
            }
        });
        fondoPanelEstadoCuenta.add(ingresoNoCuentaEstadoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 340, 40));

        tituloDeposito.setFont(new java.awt.Font("Unispace", 0, 24)); // NOI18N
        tituloDeposito.setForeground(new java.awt.Color(0, 0, 0));
        tituloDeposito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloDeposito.setText("Estado de Cuenta");
        fondoPanelEstadoCuenta.add(tituloDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 50));

        botonRegresoReporte1.setBackground(new java.awt.Color(246, 245, 242));
        botonRegresoReporte1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegresoReporte1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresoReporte1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonRegresoReporte1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRegresoReporte1MouseExited(evt);
            }
        });

        tituloRegresoInicio1.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        tituloRegresoInicio1.setForeground(new java.awt.Color(102, 102, 102));
        tituloRegresoInicio1.setText(" Regresar a Reportes");

        javax.swing.GroupLayout botonRegresoReporte1Layout = new javax.swing.GroupLayout(botonRegresoReporte1);
        botonRegresoReporte1.setLayout(botonRegresoReporte1Layout);
        botonRegresoReporte1Layout.setHorizontalGroup(
            botonRegresoReporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloRegresoInicio1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        botonRegresoReporte1Layout.setVerticalGroup(
            botonRegresoReporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloRegresoInicio1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        fondoPanelEstadoCuenta.add(botonRegresoReporte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 360, 50));

        botonRealizarEstadoCuenta.setBackground(new java.awt.Color(204, 204, 204));
        botonRealizarEstadoCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRealizarEstadoCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRealizarEstadoCuentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonRealizarEstadoCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRealizarEstadoCuentaMouseExited(evt);
            }
        });

        tituloBotonRealizarEstadoCuenta.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        tituloBotonRealizarEstadoCuenta.setForeground(new java.awt.Color(0, 0, 0));
        tituloBotonRealizarEstadoCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonRealizarEstadoCuenta.setText("Crear Estado Cuenta");

        javax.swing.GroupLayout botonRealizarEstadoCuentaLayout = new javax.swing.GroupLayout(botonRealizarEstadoCuenta);
        botonRealizarEstadoCuenta.setLayout(botonRealizarEstadoCuentaLayout);
        botonRealizarEstadoCuentaLayout.setHorizontalGroup(
            botonRealizarEstadoCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonRealizarEstadoCuentaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tituloBotonRealizarEstadoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        botonRealizarEstadoCuentaLayout.setVerticalGroup(
            botonRealizarEstadoCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonRealizarEstadoCuentaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tituloBotonRealizarEstadoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondoPanelEstadoCuenta.add(botonRealizarEstadoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 150, 40));

        CuadroEstadoCuenta.setBackground(new java.awt.Color(246, 245, 242));
        CuadroEstadoCuenta.setOpaque(true);
        fondoPanelEstadoCuenta.add(CuadroEstadoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 720));

        fondoEstadoCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondos/fondos/fondoEstadoCuenta.png"))); // NOI18N
        fondoPanelEstadoCuenta.add(fondoEstadoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanelEstadoCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanelEstadoCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresoNoCuentaEstadoCuentaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ingresoNoCuentaEstadoCuentaFocusLost
        if(ingresoNoCuentaEstadoCuenta.getText().trim().isEmpty()){
            advertenciaCampoD1.setVisible(true);
        }else{
            advertenciaCampoD1.setVisible(false);
        }
    }//GEN-LAST:event_ingresoNoCuentaEstadoCuentaFocusLost

    private void ingresoNoCuentaEstadoCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresoNoCuentaEstadoCuentaKeyTyped
        int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <= 57;

        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_ingresoNoCuentaEstadoCuentaKeyTyped

    private void botonRegresoReporte1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresoReporte1MouseClicked
        Reporte abrirReportes = new Reporte();
        abrirReportes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonRegresoReporte1MouseClicked

    private void botonRegresoReporte1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresoReporte1MouseEntered
        botonRegresoReporte1.setBackground(new Color(227,226,223));
    }//GEN-LAST:event_botonRegresoReporte1MouseEntered

    private void botonRegresoReporte1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresoReporte1MouseExited
        botonRegresoReporte1.setBackground(new Color(246,245,242));
    }//GEN-LAST:event_botonRegresoReporte1MouseExited

    private void botonRealizarEstadoCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRealizarEstadoCuentaMouseEntered
        botonRealizarEstadoCuenta.setBackground(new Color(188,188,188));
    }//GEN-LAST:event_botonRealizarEstadoCuentaMouseEntered

    private void botonRealizarEstadoCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRealizarEstadoCuentaMouseExited
        botonRealizarEstadoCuenta.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_botonRealizarEstadoCuentaMouseExited

    private void botonRealizarEstadoCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRealizarEstadoCuentaMouseClicked
        if(ingresoNoCuentaEstadoCuenta.getText().trim().isEmpty()){
            advertenciaCampoD1.setVisible(true);
        }else{
            advertenciaCampoD1.setVisible(false);        
            String noCuenta = ingresoNoCuentaEstadoCuenta.getText();

            LogicaReportesTXT estadoCuenta = new LogicaReportesTXT(noCuenta);
            estadoCuenta.estadoCuenta();
            advertenciaCampoD2.setText(estadoCuenta.getAvisoNoCueIn());
            avisoEstadoCuenta.setText(estadoCuenta.getAvisoEstadoCuenta());
        }
    }//GEN-LAST:event_botonRealizarEstadoCuentaMouseClicked

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
            java.util.logging.Logger.getLogger(EstadoCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstadoCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstadoCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstadoCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstadoCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CuadroEstadoCuenta;
    private javax.swing.JLabel advertenciaCampoD1;
    private javax.swing.JLabel advertenciaCampoD2;
    private javax.swing.JLabel avisoEstadoCuenta;
    private javax.swing.JPanel botonRealizarEstadoCuenta;
    private javax.swing.JPanel botonRegresoReporte1;
    private javax.swing.JLabel fondoEstadoCuenta;
    private javax.swing.JPanel fondoPanelEstadoCuenta;
    private javax.swing.JTextField ingresoNoCuentaEstadoCuenta;
    private javax.swing.JLabel tituloBotonRealizarEstadoCuenta;
    private javax.swing.JLabel tituloDeposito;
    private javax.swing.JLabel tituloNoCuentaEstadoCuenta;
    private javax.swing.JLabel tituloRegresoInicio1;
    // End of variables declaration//GEN-END:variables
}
