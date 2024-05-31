/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfazSistema;

import java.awt.Color;

/**
 *
 * @author axels
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoVentanaInicio = new javax.swing.JPanel();
        titiuloGestiones = new javax.swing.JLabel();
        botonCerrarSesion1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonVentanaReportes = new javax.swing.JPanel();
        tituloBotonGestion6 = new javax.swing.JLabel();
        botonVentanaRealizarRetiro = new javax.swing.JPanel();
        tituloBotonGestion5 = new javax.swing.JLabel();
        botonVentanaRealizarDeposito = new javax.swing.JPanel();
        tituloBotonGestion4 = new javax.swing.JLabel();
        botonVentanaAperturaCuenta = new javax.swing.JPanel();
        tituloBotonGestion3 = new javax.swing.JLabel();
        botonVentanaActualizacionCliente = new javax.swing.JPanel();
        tituloBotonGestion2 = new javax.swing.JLabel();
        botonVentanaRegistroCliente = new javax.swing.JPanel();
        tituloBotonGestion1 = new javax.swing.JLabel();
        cuadroGestiones = new javax.swing.JLabel();
        fondoInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        fondoVentanaInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titiuloGestiones.setFont(new java.awt.Font("Unispace", 0, 24)); // NOI18N
        titiuloGestiones.setForeground(new java.awt.Color(0, 0, 0));
        titiuloGestiones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titiuloGestiones.setText("GESTIONES");
        fondoVentanaInicio.add(titiuloGestiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 50));

        botonCerrarSesion1.setBackground(new java.awt.Color(246, 245, 242));
        botonCerrarSesion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCerrarSesion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCerrarSesion1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCerrarSesion1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCerrarSesion1MouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText(" Cerrar Sesión");

        javax.swing.GroupLayout botonCerrarSesion1Layout = new javax.swing.GroupLayout(botonCerrarSesion1);
        botonCerrarSesion1.setLayout(botonCerrarSesion1Layout);
        botonCerrarSesion1Layout.setHorizontalGroup(
            botonCerrarSesion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        botonCerrarSesion1Layout.setVerticalGroup(
            botonCerrarSesion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        fondoVentanaInicio.add(botonCerrarSesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 360, 50));

        botonVentanaReportes.setBackground(new java.awt.Color(246, 245, 242));
        botonVentanaReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVentanaReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonVentanaReportesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonVentanaReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonVentanaReportesMouseExited(evt);
            }
        });

        tituloBotonGestion6.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        tituloBotonGestion6.setForeground(new java.awt.Color(51, 51, 51));
        tituloBotonGestion6.setText(" Reportes");

        javax.swing.GroupLayout botonVentanaReportesLayout = new javax.swing.GroupLayout(botonVentanaReportes);
        botonVentanaReportes.setLayout(botonVentanaReportesLayout);
        botonVentanaReportesLayout.setHorizontalGroup(
            botonVentanaReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloBotonGestion6, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        botonVentanaReportesLayout.setVerticalGroup(
            botonVentanaReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloBotonGestion6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        fondoVentanaInicio.add(botonVentanaReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 360, 50));

        botonVentanaRealizarRetiro.setBackground(new java.awt.Color(246, 245, 242));
        botonVentanaRealizarRetiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVentanaRealizarRetiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonVentanaRealizarRetiroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonVentanaRealizarRetiroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonVentanaRealizarRetiroMouseExited(evt);
            }
        });

        tituloBotonGestion5.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        tituloBotonGestion5.setForeground(new java.awt.Color(51, 51, 51));
        tituloBotonGestion5.setText(" Realizar Retiro");

        javax.swing.GroupLayout botonVentanaRealizarRetiroLayout = new javax.swing.GroupLayout(botonVentanaRealizarRetiro);
        botonVentanaRealizarRetiro.setLayout(botonVentanaRealizarRetiroLayout);
        botonVentanaRealizarRetiroLayout.setHorizontalGroup(
            botonVentanaRealizarRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloBotonGestion5, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        botonVentanaRealizarRetiroLayout.setVerticalGroup(
            botonVentanaRealizarRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloBotonGestion5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        fondoVentanaInicio.add(botonVentanaRealizarRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 360, 50));

        botonVentanaRealizarDeposito.setBackground(new java.awt.Color(246, 245, 242));
        botonVentanaRealizarDeposito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVentanaRealizarDeposito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonVentanaRealizarDepositoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonVentanaRealizarDepositoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonVentanaRealizarDepositoMouseExited(evt);
            }
        });

        tituloBotonGestion4.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        tituloBotonGestion4.setForeground(new java.awt.Color(51, 51, 51));
        tituloBotonGestion4.setText(" Realizar Depósito");

        javax.swing.GroupLayout botonVentanaRealizarDepositoLayout = new javax.swing.GroupLayout(botonVentanaRealizarDeposito);
        botonVentanaRealizarDeposito.setLayout(botonVentanaRealizarDepositoLayout);
        botonVentanaRealizarDepositoLayout.setHorizontalGroup(
            botonVentanaRealizarDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloBotonGestion4, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        botonVentanaRealizarDepositoLayout.setVerticalGroup(
            botonVentanaRealizarDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloBotonGestion4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        fondoVentanaInicio.add(botonVentanaRealizarDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 360, 50));

        botonVentanaAperturaCuenta.setBackground(new java.awt.Color(246, 245, 242));
        botonVentanaAperturaCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVentanaAperturaCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonVentanaAperturaCuentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonVentanaAperturaCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonVentanaAperturaCuentaMouseExited(evt);
            }
        });

        tituloBotonGestion3.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        tituloBotonGestion3.setForeground(new java.awt.Color(51, 51, 51));
        tituloBotonGestion3.setText(" Apertura de Cuenta");

        javax.swing.GroupLayout botonVentanaAperturaCuentaLayout = new javax.swing.GroupLayout(botonVentanaAperturaCuenta);
        botonVentanaAperturaCuenta.setLayout(botonVentanaAperturaCuentaLayout);
        botonVentanaAperturaCuentaLayout.setHorizontalGroup(
            botonVentanaAperturaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloBotonGestion3, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        botonVentanaAperturaCuentaLayout.setVerticalGroup(
            botonVentanaAperturaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloBotonGestion3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        fondoVentanaInicio.add(botonVentanaAperturaCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 360, 50));

        botonVentanaActualizacionCliente.setBackground(new java.awt.Color(246, 245, 242));
        botonVentanaActualizacionCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVentanaActualizacionCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonVentanaActualizacionClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonVentanaActualizacionClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonVentanaActualizacionClienteMouseExited(evt);
            }
        });

        tituloBotonGestion2.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        tituloBotonGestion2.setForeground(new java.awt.Color(51, 51, 51));
        tituloBotonGestion2.setText(" Actualización de Cliente");

        javax.swing.GroupLayout botonVentanaActualizacionClienteLayout = new javax.swing.GroupLayout(botonVentanaActualizacionCliente);
        botonVentanaActualizacionCliente.setLayout(botonVentanaActualizacionClienteLayout);
        botonVentanaActualizacionClienteLayout.setHorizontalGroup(
            botonVentanaActualizacionClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloBotonGestion2, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        botonVentanaActualizacionClienteLayout.setVerticalGroup(
            botonVentanaActualizacionClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloBotonGestion2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        fondoVentanaInicio.add(botonVentanaActualizacionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 360, 50));

        botonVentanaRegistroCliente.setBackground(new java.awt.Color(246, 245, 242));
        botonVentanaRegistroCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVentanaRegistroCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonVentanaRegistroClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonVentanaRegistroClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonVentanaRegistroClienteMouseExited(evt);
            }
        });

        tituloBotonGestion1.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        tituloBotonGestion1.setForeground(new java.awt.Color(51, 51, 51));
        tituloBotonGestion1.setText(" Registro de Cliente");

        javax.swing.GroupLayout botonVentanaRegistroClienteLayout = new javax.swing.GroupLayout(botonVentanaRegistroCliente);
        botonVentanaRegistroCliente.setLayout(botonVentanaRegistroClienteLayout);
        botonVentanaRegistroClienteLayout.setHorizontalGroup(
            botonVentanaRegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloBotonGestion1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        botonVentanaRegistroClienteLayout.setVerticalGroup(
            botonVentanaRegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloBotonGestion1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        fondoVentanaInicio.add(botonVentanaRegistroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 360, 50));

        cuadroGestiones.setBackground(new java.awt.Color(246, 245, 242));
        cuadroGestiones.setOpaque(true);
        fondoVentanaInicio.add(cuadroGestiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 720));

        fondoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondos/fondos/fondoInicio.png"))); // NOI18N
        fondoVentanaInicio.add(fondoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoVentanaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoVentanaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVentanaRegistroClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVentanaRegistroClienteMouseEntered
        botonVentanaRegistroCliente.setBackground(new Color(227,226,223));
    }//GEN-LAST:event_botonVentanaRegistroClienteMouseEntered

    private void botonVentanaRegistroClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVentanaRegistroClienteMouseExited
        botonVentanaRegistroCliente.setBackground(new Color(246,245,242));
    }//GEN-LAST:event_botonVentanaRegistroClienteMouseExited

    private void botonVentanaActualizacionClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVentanaActualizacionClienteMouseEntered
        botonVentanaActualizacionCliente.setBackground(new Color(227,226,223));
    }//GEN-LAST:event_botonVentanaActualizacionClienteMouseEntered

    private void botonVentanaActualizacionClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVentanaActualizacionClienteMouseExited
        botonVentanaActualizacionCliente.setBackground(new Color(246,245,242));
    }//GEN-LAST:event_botonVentanaActualizacionClienteMouseExited

    private void botonVentanaAperturaCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVentanaAperturaCuentaMouseEntered
        botonVentanaAperturaCuenta.setBackground(new Color(227,226,223));
    }//GEN-LAST:event_botonVentanaAperturaCuentaMouseEntered

    private void botonVentanaAperturaCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVentanaAperturaCuentaMouseExited
        botonVentanaAperturaCuenta.setBackground(new Color(246,245,242));
    }//GEN-LAST:event_botonVentanaAperturaCuentaMouseExited

    private void botonVentanaRealizarDepositoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVentanaRealizarDepositoMouseEntered
        botonVentanaRealizarDeposito.setBackground(new Color(227,226,223));
    }//GEN-LAST:event_botonVentanaRealizarDepositoMouseEntered

    private void botonVentanaRealizarDepositoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVentanaRealizarDepositoMouseExited
        botonVentanaRealizarDeposito.setBackground(new Color(246,245,242));
    }//GEN-LAST:event_botonVentanaRealizarDepositoMouseExited

    private void botonVentanaRealizarRetiroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVentanaRealizarRetiroMouseEntered
        botonVentanaRealizarRetiro.setBackground(new Color(227,226,223));
    }//GEN-LAST:event_botonVentanaRealizarRetiroMouseEntered

    private void botonVentanaRealizarRetiroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVentanaRealizarRetiroMouseExited
        botonVentanaRealizarRetiro.setBackground(new Color(246,245,242));
    }//GEN-LAST:event_botonVentanaRealizarRetiroMouseExited

    private void botonVentanaReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVentanaReportesMouseEntered
        botonVentanaReportes.setBackground(new Color(227,226,223));
    }//GEN-LAST:event_botonVentanaReportesMouseEntered

    private void botonVentanaReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVentanaReportesMouseExited
        botonVentanaReportes.setBackground(new Color(246,245,242));
    }//GEN-LAST:event_botonVentanaReportesMouseExited

    private void botonCerrarSesion1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarSesion1MouseEntered
        botonCerrarSesion1.setBackground(new Color(227,226,223));
    }//GEN-LAST:event_botonCerrarSesion1MouseEntered

    private void botonCerrarSesion1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarSesion1MouseExited
        botonCerrarSesion1.setBackground(new Color(246,245,242));
    }//GEN-LAST:event_botonCerrarSesion1MouseExited

    private void botonCerrarSesion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarSesion1MouseClicked
        Login cerrarSesion1 = new Login();
        cerrarSesion1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonCerrarSesion1MouseClicked

    private void botonVentanaRegistroClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVentanaRegistroClienteMouseClicked
        RegistroCliente abrirRegistroCliente = new RegistroCliente();
        abrirRegistroCliente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonVentanaRegistroClienteMouseClicked

    private void botonVentanaActualizacionClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVentanaActualizacionClienteMouseClicked
        ActualizacionCliente abrirActualizacionCliente = new ActualizacionCliente();
        abrirActualizacionCliente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonVentanaActualizacionClienteMouseClicked

    private void botonVentanaAperturaCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVentanaAperturaCuentaMouseClicked
        AperturaCuenta abrirAperturaCuenta = new AperturaCuenta();
        abrirAperturaCuenta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonVentanaAperturaCuentaMouseClicked

    private void botonVentanaRealizarDepositoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVentanaRealizarDepositoMouseClicked
        RealizarDeposito abrirRealizarDeposito = new RealizarDeposito();
        abrirRealizarDeposito.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonVentanaRealizarDepositoMouseClicked

    private void botonVentanaRealizarRetiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVentanaRealizarRetiroMouseClicked
        RealizarRetiro abrirRealizarRetiro = new RealizarRetiro();
        abrirRealizarRetiro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonVentanaRealizarRetiroMouseClicked

    private void botonVentanaReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVentanaReportesMouseClicked
        Reporte abrirReporte = new Reporte();
        abrirReporte.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonVentanaReportesMouseClicked

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonCerrarSesion1;
    private javax.swing.JPanel botonVentanaActualizacionCliente;
    private javax.swing.JPanel botonVentanaAperturaCuenta;
    private javax.swing.JPanel botonVentanaRealizarDeposito;
    private javax.swing.JPanel botonVentanaRealizarRetiro;
    private javax.swing.JPanel botonVentanaRegistroCliente;
    private javax.swing.JPanel botonVentanaReportes;
    private javax.swing.JLabel cuadroGestiones;
    private javax.swing.JLabel fondoInicio;
    private javax.swing.JPanel fondoVentanaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel titiuloGestiones;
    private javax.swing.JLabel tituloBotonGestion1;
    private javax.swing.JLabel tituloBotonGestion2;
    private javax.swing.JLabel tituloBotonGestion3;
    private javax.swing.JLabel tituloBotonGestion4;
    private javax.swing.JLabel tituloBotonGestion5;
    private javax.swing.JLabel tituloBotonGestion6;
    // End of variables declaration//GEN-END:variables
}