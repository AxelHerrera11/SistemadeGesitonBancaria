
package InterfazSistema;

import java.awt.Color;

public class Login extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public Login() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        movVentana.setVisible(false);
        botonSalida.setVisible(false);
        advertenciaCampo1.setVisible(false);
        advertenciaCampo2.setVisible(false);
        errorUsuario.setVisible(false);
        errorContraseña.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPanel = new javax.swing.JPanel();
        botonSalida = new javax.swing.JLabel();
        movVentana = new javax.swing.JPanel();
        botonInicioSesion = new javax.swing.JPanel();
        tituloBotonIniciarSesion = new javax.swing.JLabel();
        ingresoContraseña = new javax.swing.JPasswordField();
        ingresoUsuario = new javax.swing.JTextField();
        errorContraseña = new javax.swing.JLabel();
        errorUsuario = new javax.swing.JLabel();
        advertenciaCampo2 = new javax.swing.JLabel();
        advertenciaCampo1 = new javax.swing.JLabel();
        tituloContraseña = new javax.swing.JLabel();
        tituloUsuario = new javax.swing.JLabel();
        tituloInicioSesion = new javax.swing.JLabel();
        cuadroSesion = new javax.swing.JLabel();
        fondoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        fondoPanel.setOpaque(false);
        fondoPanel.setRequestFocusEnabled(false);
        fondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonSalida.setBackground(new java.awt.Color(255, 255, 255));
        botonSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarPrograma.png"))); // NOI18N
        botonSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalidaMouseClicked(evt);
            }
        });
        fondoPanel.add(botonSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, 20, 20));

        movVentana.setOpaque(false);
        movVentana.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movVentanaMouseDragged(evt);
            }
        });
        movVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movVentanaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout movVentanaLayout = new javax.swing.GroupLayout(movVentana);
        movVentana.setLayout(movVentanaLayout);
        movVentanaLayout.setHorizontalGroup(
            movVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        movVentanaLayout.setVerticalGroup(
            movVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        fondoPanel.add(movVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 40));

        botonInicioSesion.setBackground(new java.awt.Color(204, 204, 204));
        botonInicioSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonInicioSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonInicioSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonInicioSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonInicioSesionMouseExited(evt);
            }
        });

        tituloBotonIniciarSesion.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        tituloBotonIniciarSesion.setForeground(new java.awt.Color(0, 0, 0));
        tituloBotonIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonIniciarSesion.setText("Ingresar");

        javax.swing.GroupLayout botonInicioSesionLayout = new javax.swing.GroupLayout(botonInicioSesion);
        botonInicioSesion.setLayout(botonInicioSesionLayout);
        botonInicioSesionLayout.setHorizontalGroup(
            botonInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloBotonIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        botonInicioSesionLayout.setVerticalGroup(
            botonInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloBotonIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        fondoPanel.add(botonInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 100, 40));

        ingresoContraseña.setBackground(new java.awt.Color(255, 255, 255));
        ingresoContraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        ingresoContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ingresoContraseñaFocusLost(evt);
            }
        });
        fondoPanel.add(ingresoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 420, 40));

        ingresoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        ingresoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ingresoUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ingresoUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        ingresoUsuario.setMargin(new java.awt.Insets(6, 6, 6, 6));
        ingresoUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ingresoUsuarioFocusLost(evt);
            }
        });
        ingresoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoUsuarioActionPerformed(evt);
            }
        });
        fondoPanel.add(ingresoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 420, 40));

        errorContraseña.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        errorContraseña.setForeground(new java.awt.Color(153, 0, 0));
        errorContraseña.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        errorContraseña.setText("Contraseña Incorrecta");
        fondoPanel.add(errorContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 150, -1));

        errorUsuario.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        errorUsuario.setForeground(new java.awt.Color(153, 0, 0));
        errorUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        errorUsuario.setText("Usuario Incorrecto");
        fondoPanel.add(errorUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 130, -1));

        advertenciaCampo2.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        advertenciaCampo2.setForeground(new java.awt.Color(153, 0, 0));
        advertenciaCampo2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        advertenciaCampo2.setText("CAMPO REQUERIDO");
        fondoPanel.add(advertenciaCampo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, 120, -1));

        advertenciaCampo1.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        advertenciaCampo1.setForeground(new java.awt.Color(153, 0, 0));
        advertenciaCampo1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        advertenciaCampo1.setText("CAMPO REQUERIDO");
        fondoPanel.add(advertenciaCampo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 120, -1));

        tituloContraseña.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        tituloContraseña.setForeground(new java.awt.Color(0, 0, 0));
        tituloContraseña.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tituloContraseña.setText("Contraseña");
        fondoPanel.add(tituloContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 140, -1));

        tituloUsuario.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        tituloUsuario.setForeground(new java.awt.Color(0, 0, 0));
        tituloUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tituloUsuario.setText("Usuario");
        fondoPanel.add(tituloUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 140, -1));

        tituloInicioSesion.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        tituloInicioSesion.setForeground(new java.awt.Color(0, 0, 0));
        tituloInicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloInicioSesion.setText("Iniciar Sesión");
        fondoPanel.add(tituloInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 460, -1));

        cuadroSesion.setBackground(new java.awt.Color(246, 245, 242));
        cuadroSesion.setOpaque(true);
        fondoPanel.add(cuadroSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 460, 620));

        fondoLogin.setBackground(new java.awt.Color(246, 245, 242));
        fondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondos/fondos/fondoLogin2.png"))); // NOI18N
        fondoPanel.add(fondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void movVentanaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movVentanaMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_movVentanaMousePressed

    private void movVentanaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movVentanaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y- yMouse);
    }//GEN-LAST:event_movVentanaMouseDragged

    private void botonSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalidaMouseClicked
        System.exit(0);
    }//GEN-LAST:event_botonSalidaMouseClicked

    private void ingresoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoUsuarioActionPerformed

    private void botonInicioSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInicioSesionMouseEntered
        botonInicioSesion.setBackground(new Color(188,188,188));
    }//GEN-LAST:event_botonInicioSesionMouseEntered

    private void botonInicioSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInicioSesionMouseExited
        botonInicioSesion.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_botonInicioSesionMouseExited

    private void botonInicioSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInicioSesionMouseClicked
        errorUsuario.setVisible(false);
        errorContraseña.setVisible(false);
        String usuario = "admin";
        String contraseña = "1234";
        
        String Pass = new String(ingresoContraseña.getPassword());
        String validacionContraAdv = Pass;
        
        
        if(ingresoUsuario.getText().trim().isEmpty() || validacionContraAdv.trim().isEmpty()){
            if(ingresoUsuario.getText().trim().isEmpty()){
                advertenciaCampo1.setVisible(true);
            }else{
                advertenciaCampo1.setVisible(false);
            }
            if(validacionContraAdv.trim().isEmpty()){
                advertenciaCampo2.setVisible(true);
            }else{
                advertenciaCampo2.setVisible(false);
            }
        }else{        
            if(ingresoUsuario.getText().equals(usuario) && Pass.equals(contraseña)){
                Inicio abrirInicio = new Inicio();
                abrirInicio.setVisible(true);
                this.setVisible(false);
            }else{
                if(!ingresoUsuario.getText().equals(usuario)){
                    errorUsuario.setVisible(true);
                }
                if(!Pass.equals(contraseña)){
                    errorContraseña.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_botonInicioSesionMouseClicked

    private void ingresoUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ingresoUsuarioFocusLost
        if(ingresoUsuario.getText().trim().isEmpty()){
            advertenciaCampo1.setVisible(true);
        }else{
            advertenciaCampo1.setVisible(false);
        }
    }//GEN-LAST:event_ingresoUsuarioFocusLost

    private void ingresoContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ingresoContraseñaFocusLost
        String Pass = new String(ingresoContraseña.getPassword());
        String validacionContraseña = Pass;
        
        if(validacionContraseña.trim().isEmpty()){
            advertenciaCampo2.setVisible(true);
        }else{
            advertenciaCampo2.setVisible(false);
        }
    }//GEN-LAST:event_ingresoContraseñaFocusLost

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel advertenciaCampo1;
    private javax.swing.JLabel advertenciaCampo2;
    private javax.swing.JPanel botonInicioSesion;
    private javax.swing.JLabel botonSalida;
    private javax.swing.JLabel cuadroSesion;
    private javax.swing.JLabel errorContraseña;
    private javax.swing.JLabel errorUsuario;
    private javax.swing.JLabel fondoLogin;
    private javax.swing.JPanel fondoPanel;
    private javax.swing.JPasswordField ingresoContraseña;
    private javax.swing.JTextField ingresoUsuario;
    private javax.swing.JPanel movVentana;
    private javax.swing.JLabel tituloBotonIniciarSesion;
    private javax.swing.JLabel tituloContraseña;
    private javax.swing.JLabel tituloInicioSesion;
    private javax.swing.JLabel tituloUsuario;
    // End of variables declaration//GEN-END:variables
}
